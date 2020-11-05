package io.beansnapper.flow

import org.junit.Test


class FlowTest {

    @Test
    fun straightFlow() {

        val action = { println("hello world") }
        val steps = listOf(
                Start(),
                Action("MyAction", action = { }),
                End()
        )

        val transitions = listOf(
                Transition(steps[0], steps[1]),
                Transition(steps[1], steps[2])
        )


    }


}