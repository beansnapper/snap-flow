package io.beansnapper.flow.engine

import mu.KotlinLogging

private val log = KotlinLogging.logger {}

///**
// *
// */
//class FlowEngine(val flowData: FlowData) {
//    private val steps:
//
//            private
//    val stepMap = steps.map { StepWrapper(it) }.map { it.key to it }.toMap()
//    private val startWrapper = stepMap[defaultStart.key] ?: throw FlowException("$defaultStart is not part of the flow")
//
//    internal class StepWrapper(
//        val step: Step,
//    ) {
//        val key get() = step.key
//        val name get() = step.name
//
//        fun run() {
//            log.info { "$step running..." }
//            step.action.invoke()
//            log.info { "$step finished" }
//        }
//
//        fun next(): StepWrapper? {
//            return null
//        }
//
//    }
//
//    fun run() {
//        log.info { }
//        run(startWrapper)
//    }
//
//    private fun run(step: StepWrapper?) {
//        if (step == null) return
//        step.run()
//        run(step.next())
//    }
//
//    override fun toString(): String = "Flow [$name]"
//
//}