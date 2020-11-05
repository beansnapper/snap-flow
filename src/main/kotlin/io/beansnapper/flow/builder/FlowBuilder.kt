package io.beansnapper.flow.builder

import io.beansnapper.flow.FlowConstants.defaultName

class FlowBuilder() {
    var name: String = defaultName

    class BuilderException(
            override val message: String? = null,
            override val cause: Throwable? = null
    ) : Exception()

    class StepBuilder(
            val flow: FlowBuilder,
            var name: String = defaultName
    )

    class WireBuilder(
            val flow: FlowBuilder,
            var fromStep: StepBuilder? = null,
            var toStep: StepBuilder? = null
    ) {

        fun to(stepName: String) {
            flow.steps[stepName] ?: throw BuilderException("The step [$stepName] hasn't been defined")
        }
    }

    val steps = mutableMapOf<String, StepBuilder>()

    fun flow(builder: FlowBuilder.() -> Unit): FlowBuilder {
        builder.invoke(this)
        return this
    }

    fun step(name: String, define: StepBuilder.() -> Unit): StepBuilder {
        if (steps.containsKey(name)) {
            throw FlowBuilder.BuilderException("duplicate step name $name")
        }

        val step = StepBuilder(this, name)
        steps[step.name] = step

        define.invoke(step)
        return step
    }

    fun wire(stepName: String): WireBuilder {
        val fromStep = steps[stepName] ?: throw BuilderException("The step [$stepName] hasn't been defined")
        return WireBuilder(this, fromStep)
    }

}