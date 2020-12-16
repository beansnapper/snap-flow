package io.beansnapper.flow.dsl

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe


class BuilderTest : StringSpec({

    "simple one two three" {

        var counter: Int = 0
        var first: Int? = null
        var second: Int? = null
        var third: Int? = null

        val flowBuilder = FlowBuilder().flow {
            name = "straight-builder"

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

        val myFlow = flowBuilder.build()
        val engine = FlowEngine()

        first shouldBe 1
        second shouldBe 2
        third shouldBe 3
    }

})
