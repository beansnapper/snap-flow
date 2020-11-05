package io.beansnapper.flow

import mu.KotlinLogging

private val log = KotlinLogging.logger {}

class Flow(
    val name : String = "no-name",
    val steps : Collection<Step>,
    val transitions : Collection<Transition>
) {
    val stepMap = steps.map { StepWrapper(it) }.map { it.key to it }.toMap()
    val starts = stepMap.entries.map { it.value }.filter { it.step is Start }

    class StepWrapper(
            val step : Step
    ){
        val key get() = step.key
        val name get() = step.name

        fun execute() {
            step.execute()
        }

    }


    fun execute() {
       when (starts.count()) {
            0 -> throw FlowException("Flow $name doesn't have a start")
            1 -> starts.first()
            else -> throw FlowException("Flow has multiple entry start points")
        }
    }

    fun execute(step : StepWrapper) {

        log.info { "Starting Step: $name" }
        step.execute()

    }


}