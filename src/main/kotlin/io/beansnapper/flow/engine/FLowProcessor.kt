package io.beansnapper.flow.engine

import io.beansnapper.flow.domain.Flow
import io.beansnapper.flow.domain.Step
import mu.KotlinLogging

private val log = KotlinLogging.logger {}

class FlowProcessor(flow: Flow, private val start: Step? = null) {
    internal val flow = XFlow(flow)

    fun run(context: FlowContext) {
        log.debug { "Starting $flow" }
        if (start != null) {
            flow.steps[start.name]
        }

        var current = if (start != null) {
            flow.steps[start.name] ?: throw Exception("Provided start $start is ")
        } else flow.defaultStart

        do {
            execute(current, context)
            if (current.data.terminalStep) {
                log.debug { "Found Terminal $current" }
                break
            }
            current = next(current, context)
        } while (true)
        log.debug { "$flow terminated normally" }
    }

    private fun execute(current: XStep, context: FlowContext) {
        try {
            log.debug { "Executing $current" }
            current.action.invoke(context)
        } catch (e: Exception) {
            val msg = "Uncaught exception executing $flow:$current - $e"
            log.error { msg }
            throw FlowException()
        }
    }

    /**
     * determine the next step
     */
    private fun next(current: XStep, context: FlowContext): XStep {
        current.wires.forEach { wire ->
            if (wire.data.predicate(context)) {
                return wire.toStep
            }
        }
        throw FlowException("$current has no next step with a positive predicate")
    }

}

