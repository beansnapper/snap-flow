package io.beansnapper.flow.engine

data class Step(
    val name: String,
    val id: String,
    val action: ActionLambda,
    val start: Boolean = false,
    val stop: Boolean = false
)


