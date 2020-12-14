package io.beansnapper.flow.domain

/**
 * A wire represents a directed transition from one step to another.  It's often
 * based on a condition.
 */
data class Wire(
    override val id: RefId<Wire>? = null,
    override val timestamp: Timestamp? = null,
    val from: RefId<Step>,
    val to: RefId<Step>,
) : DataObject<Wire>

