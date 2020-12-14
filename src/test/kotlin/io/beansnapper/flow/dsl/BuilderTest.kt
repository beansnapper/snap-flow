package io.beansnapper.flow.dsl

import org.junit.Test


class BuilderTest {

    @Test
    fun straightBuilder() {

        val flowBuilder = FlowBuilder().flow {
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

            start("First")
                .thenDo("Second")
                .thenDo("Third")
                .andTerminate()

//            wire("First").to("Second")
//            wire("Second").to("Third")

        }


        val myFlow = flowBuilder.build()


    }

}

