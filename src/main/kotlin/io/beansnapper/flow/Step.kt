package io.beansnapper.flow

import java.util.*

interface Step {
    val name : String
    val key : UUID

    fun execute() {}
}


class Start(
        override val name: String = "START",
        override val key: UUID = UUID.randomUUID()
) : Step

class End(
        override val name: String = "END",
        override val key: UUID = UUID.randomUUID()
) : Step

class Action(
    override val name: String = "ACTION",
    val action : () -> Unit = {},
    override val key: UUID = UUID.randomUUID()
) : Step {

    override fun execute() {
        action
    }
}