package io.beansnapper.flow.engine

import java.util.*

typealias ActionLambda = () -> Unit

object FlowDefinitions {

    const val defaultName = "no-name"
    val defaultIdGenerator: () -> String = { UUID.randomUUID().toString() }

}
