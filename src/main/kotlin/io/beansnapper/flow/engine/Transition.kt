package io.beansnapper.flow.engine

/**
 * A transition is an edge or arc that transfers control from on step to another.
 */
class Wire(
        val from: Step,
        val to: Step
)

