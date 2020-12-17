package io.beansnapper.flow.dsl

import io.beansnapper.annotations.NotThreadSafe
import io.beansnapper.flow.domain.*
import io.beansnapper.flow.engine.FlowContext

const val defaultName = "unknown"
const val defaultTerminateName = "#terminate"

/**
 * intended for single-thread building of a flow
 */
@NotThreadSafe
class FlowBuilder() {
    var name: String = defaultName
    var defaultStart: StepBuilder? = null
    var defaultTerminal = StepBuilder(this, defaultTerminateName, {}).apply { terminalStep = true }
    val steps = mutableMapOf(defaultTerminal.name to defaultTerminal)
    val wires = mutableListOf<WireBuilder>()

    fun getStep(name: String) = steps[name] ?: throw BuilderException("no step named $name")
    override fun toString() = "Flow $name"

    class BuilderException(
        override val message: String? = null,
        override val cause: Throwable? = null,
    ) : Exception()

    class StepBuilder(
        val flow: FlowBuilder,
        var name: String = defaultName,
        var action: ActionLambda,
        var startStep: Boolean = false,
        var terminalStep: Boolean = false,
    ) {
        private var theStep: Step? = null

        override fun toString() = "Step $name"

        fun build(): Step {
            return theStep ?: Step(null, null, name, action, startStep, terminalStep)
                .also { theStep = it }
        }
    }

    class WireBuilder(
        val flow: FlowBuilder,
        var fromStep: StepBuilder? = null,
        var toStep: StepBuilder? = null,
        var predicate: (FlowContext) -> Boolean = { _ -> true },
        var priority: Int = 0,
    ) {
        override fun toString(): String {
            return "Wire from ${fromStep?.name} to ${toStep?.name}"
        }

        fun thenDo(stepName: String): WireBuilder {
            toStep = flow.getStep(stepName)
            flow.wires.add(this)
            return WireBuilder(flow, toStep, null)
        }

        fun thenDoIf(stepName: String, predicate: (FlowContext) -> Boolean): WireBuilder {
            flow.wires.add(this)
            this.toStep = flow.getStep(stepName)
            this.priority = 20
            this.predicate = predicate
            return WireBuilder(flow, toStep)
        }

        fun andTerminate(stepName: String? = null) {
            toStep = if (stepName == null) {
                flow.defaultTerminal
            } else {
                val step = flow.getStep(stepName)
                if (!step.terminalStep) throw BuilderException("Step $stepName is not terminal")
                step
            }
            flow.wires.add(this)
        }

        internal fun build(): Wire {
            return Wire(
                null,
                null,
                ObjectId((fromStep ?: throw BuilderException("Wire is not fully defined")).build()),
                ObjectId((toStep ?: throw BuilderException("Wire is not fully defined")).build()),
                priority,
                predicate
            )
        }

    }

    fun flow(builder: FlowBuilder.() -> Unit): FlowBuilder {
        builder.invoke(this)
        return this
    }

    fun step(name: String, action: ActionLambda): StepBuilder {
        if (steps.containsKey(name)) {
            throw BuilderException("duplicate step name $name")
        }

        val step = StepBuilder(this, name, action)
        steps[step.name] = step

        return step
    }

    fun start(name: String): WireBuilder {
        val step = getStep(name)
        defaultStart = step
        return WireBuilder(this, fromStep = step)
    }

    fun wire(name: String): WireBuilder {
        val step = getStep(name)
        return WireBuilder(this, fromStep = step)
    }

    fun build(): Flow {
        val theSteps = steps.values.map { it.build() }.map { ObjectId<Step>(it) }
        val theWires = wires.map { it.build() }.map { ObjectId<Wire>(it) }
        val theStart = ObjectId<Step>(
            defaultStart?.build() ?: throw BuilderException("The default start step wasn't defined")
        )

        return Flow(null, null, name, theSteps, theWires, theStart)
    }
}