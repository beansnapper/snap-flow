package io.beansnapper.flow.builder

import org.junit.Test


class BuilderTest {

    @Test
    fun straightBuilder() {

        val flow = FlowBuilder().flow {
            name = "straight-builder"

            step("First") {
                println("First Operation")
            }
            step("Second") {
                println("Second Operation")
            }
            step("Third") {
                println("Third Operation")
            }

//            wire("First").to("Second")
//            wire(wire"Second").to("Third"
        }

        assert(flow.steps.size == 3)


    }

}

