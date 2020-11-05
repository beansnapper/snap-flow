package io.beansnapper.flow

/**
 * A transition is an edge or arc that transfers control from on step to another.
 */
class Transition(
        val from: Step,
        val to: Step
)
