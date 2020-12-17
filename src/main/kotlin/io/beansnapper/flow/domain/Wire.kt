package io.beansnapper.flow.domain

import io.beansnapper.flow.engine.FlowContext

/**
 * A wire represents a directed transition from one step to another.  It's often
 * based on a condition.
 */
data class Wire(
    override val id: ObjectId<Wire>? = null,
    override val timestamp: Timestamp? = null,
    val from: ObjectId<Step>,
    val to: ObjectId<Step>,
    val priority: Int,
    val predicate: (FlowContext) -> Boolean,
) : DataObject<Wire> {

    override fun toString() = "Wire from ${from.value.name} to ${to.value.name}"
}

