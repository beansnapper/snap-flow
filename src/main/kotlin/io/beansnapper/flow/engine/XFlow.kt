package io.beansnapper.flow.engine

import io.beansnapper.flow.domain.Flow
import io.beansnapper.flow.domain.Step
import io.beansnapper.flow.domain.Wire
import mu.KotlinLogging

private val log = KotlinLogging.logger {}

class XFlow(val flow: Flow) {

    val description by lazy { "Workflow $flow.name" }
    val steps = flow.steps
        .map { XStep(it.value) }
        .associateBy { it.name }

    val defaultStart = steps[flow.defaultStart.value.name] ?: throw FlowException("$this has no default start")

    override fun toString(): String = description

    init {
        flow.wires
            .map { XWire(this, it.value) }
            .groupBy { it.data.from.value.name }
            .forEach { (step, wires) ->
                val sorted = wires.sortedWith(compareBy { it.data.priority }).asReversed()
                steps[step]?.let { it.wires = sorted }
                if (sorted.isEmpty()) log.warn { "$step has no wires" }
            }
    }
}

class XStep(val data: Step) {
    val name: String
        get() = data.name
    val description by lazy { "Step $name" }
    val action: ActionLambda
        get() = data.action

    lateinit var wires: List<XWire>

    // TODO: it should be using the id
    override fun hashCode(): Int = name.hashCode()
    override fun equals(other: Any?): Boolean = (other == this)
    override fun toString(): String = description
}

class XWire(val flow: XFlow, val data: Wire) {
    val description = "Wire ${data.from.value.name} to ${data.to.value.name}"
    val toStep: XStep =
        flow.steps[data.to.value.name] ?: throw Exception("Step ${data.to.value.name} not part of flow.")

    override fun toString(): String = description
}

