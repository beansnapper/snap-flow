package io.beansnapper.flow.domain

data class Flow(
    override val id: ObjectId<Flow>? = null,
    override val timestamp: Timestamp? = null,
    val name: String,
    val steps: Collection<ObjectId<Step>>,
    val wires: Collection<ObjectId<Wire>>,
    val defaultStart: ObjectId<Step>,
) : DataObject<Flow>

