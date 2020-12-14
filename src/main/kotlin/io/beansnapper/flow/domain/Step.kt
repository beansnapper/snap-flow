package io.beansnapper.flow.domain

data class Step(
    override val id: RefId<Step>? = null,
    override val timestamp: Timestamp? = null,
    val name: String,
    val action: ActionLambda,
    val startStep: Boolean = false,
    val terminalStep: Boolean = false,
) : DataObject<Step>


