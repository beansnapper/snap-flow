package io.beansnapper.flow.engine

import io.beansnapper.flow.domain.Flow
import io.beansnapper.flow.domain.Step
import mu.KotlinLogging

private val log = KotlinLogging.logger {}

class FlowProcessor(flow: Flow, val context: FlowContext = FlowContext(), private val start: Step? = null) {
    internal val flow = XFlow(flow)

    fun run() {
        log.debug { "Starting $flow" }
        if (start != null) {
            flow.steps[start.name]
        }

        var current = if (start != null) {
            flow.steps[start.name] ?: throw Exception("Provided start $start is ")
        } else flow.defaultStart

        do {
            execute(current)
            if (current.data.terminalStep) {
                log.debug { "Found Terminal $current" }
                break
            }
            current = next(current)
        } while (true)
        log.debug { "$flow terminated normally" }
    }

    private fun execute(current: XFlow.XStep) {
        try {
            log.debug { "Executing $current" }
            current.action.invoke()
        } catch (e: Exception) {
            val msg = "Uncaught exception executing $flow:$current - $e"
            log.error { msg }
            throw FlowException()
        }
    }

    /**
     * determine the next step
     */
    private fun next(current: XFlow.XStep): XFlow.XStep {
        current.wires.forEach { wire ->
            if (wire.data.predicate.test(context)) return wire.toStep;
        }
        throw FlowException("$current has no next step with a positive predicate")
    }

}

