package io.beansnapper.flow.domain

data class Flow(
    override val id: RefId<Flow>? = null,
    override val timestamp: Timestamp? = null,
    val name: String,
    val steps: Collection<RefId<Step>>,
    val wires: Collection<RefId<Wire>>,
    val defaultStart: RefId<Step>,
) : DataObject<Flow>

