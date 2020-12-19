package io.beansnapper.flow.dsl

import io.beansnapper.flow.engine.FlowContext
import io.beansnapper.flow.engine.FlowProcessor
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe


class BasicTest : StringSpec({

    "simple one two three" {

        var counter = 0
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
        class Data {
            var counter: Int = 0
            var first: Int? = null
            var second: Int? = null
            var third: Int? = null
        }

        val conditionalFlow = FlowBuilder().flow {
            name = "simple-conditional"

            step("First") { context ->
                println("First Operation")
                val data = context["data"] as Data
                data.first = ++data.counter
            }
            step("Second") { context ->
                println("Second Operation")
                val data = context["data"] as Data
                data.second = ++data.counter
            }
            step("Third") { context ->
                println("Third Operation")
                val data = context["data"] as Data
                data.third = ++data.counter
            }

            start("First")
                .thenDo("Third")
                .andTerminate()

            wire("First")
                .thenDoIf("Second") { context ->
                    (context["flag"] ?: false) as Boolean
                }
                .thenDo("Third")

        }.build()

        // flow where condition is false
        run {
            val context = FlowContext()
            val data = Data().also { context["data"] = it }
            FlowProcessor(conditionalFlow).run(context)
            data.first shouldBe 1
            data.second shouldBe null
            data.third shouldBe 2
        }

        // flow where condition is true
        run {
            val context = FlowContext()
            val data = Data().also { context["data"] = it }
            context["flag"] = true
            FlowProcessor(conditionalFlow).run(context)
            data.first shouldBe 1
            data.second shouldBe 2
            data.third shouldBe 3
        }
    }


    "circular workflow" {

        class Data {
            var first: Int = 0
            var second: Int = 0
            var third: Int = 0
        }

        val flowBuilder = FlowBuilder().flow {
            name = "straight-flow"

            step("First") {
                println("First Operation")
                (it["data"] as Data).first++
            }
            step("Second") {
                println("Second Operation")
                (it["data"] as Data).second++
            }
            step("Third") {
                println("Third Operation")
                (it["data"] as Data).third++
            }

            start("First")
                .thenDo("Second")
                .thenDo("Third")
                .andTerminate()

            wire("Third").thenDoIf("First") {
                (it["data"] as Data).third < 10
            }

        }

        val flow = flowBuilder.build()
        val context = FlowContext()
        val data = Data()
        context["data"] = data
        FlowProcessor(flow).run(context)

        data.first shouldBe 10
        data.second shouldBe 10
        data.third shouldBe 10
    }

})
