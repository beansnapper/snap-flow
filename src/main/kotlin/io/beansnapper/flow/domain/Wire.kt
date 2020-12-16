package io.beansnapper.flow.domain

import io.beansnapper.flow.engine.FlowContext
import java.util.function.Predicate

/**
 * A wire represents a directed transition from one step to another.  It's often
 * based on a condition.
 */
data class Wire(
    override val id: ObjectId<Wire>? = null,
    override val timestamp: Timestamp? = null,
    val name: String? = null,
    val from: ObjectId<Step>,
    val to: ObjectId<Step>,
    val predicate: Predicate<FlowContext>,
) : DataObject<Wire>

