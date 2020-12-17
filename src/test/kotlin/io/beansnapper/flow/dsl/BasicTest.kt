package io.beansnapper.flow.dsl

import io.beansnapper.flow.engine.FlowContext
import io.beansnapper.flow.engine.FlowProcessor
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe


class BasicTest : StringSpec({

    "simple one two three" {

        var counter: Int = 0
        var first: Int? = null
        var second: Int? = null
        var third: Int? = null

        val flowBuilder = FlowBuilder().flow {
            name = "straight-flow"

            step("First") {
                println("First Operation")
                first = ++counter
            }
            step("Second") {
                println("Second Operation")
                second = ++counter
            }
            step("Third") {
                println("Third Operation")
                third = ++counter
            }

            start("First")
                .thenDo("Second")
                .thenDo("Third")
                .andTerminate()

        }

        val flow = flowBuilder.build()
        val context = FlowContext()
        FlowProcessor(flow).run(context)

        first shouldBe 1
        second shouldBe 2
        third shouldBe 3
    }

    "conditional branch" {

        var counter: Int = 0
        var first: Int? = null
        var second: Int? = null
        var third: Int? = null


        val flowBuilder = FlowBuilder().flow {
            name = "simple-conditional"

            step("First") {
                println("First Operation")
                first = ++counter
            }
            step("Second") {
                println("Second Operation")
                second = ++counter
            }
            step("Third") {
                println("Third Operation")
                third = ++counter
            }

            start("First")
                .thenDo("Third")
                .andTerminate()

            wire("First")
                .thenDoIf("Second") { context ->
                    (context["flag"] ?: false) as Boolean
                }
                .thenDo("Third")

        }

        val flow = flowBuilder.build()
        val context = FlowContext()
        FlowProcessor(flow).run(context)

        first shouldBe 1
        second shouldBe null
        third shouldBe 2
    }

})
