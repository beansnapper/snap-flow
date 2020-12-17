package io.beansnapper.flow.domain

import io.beansnapper.flow.engine.FlowContext
import java.util.*

typealias Timestamp = Date
typealias ActionLambda = (FlowContext) -> Unit
typealias RawId = String

interface DataObject<T : Any> {
    val id: ObjectId<T>?
    val timestamp: Timestamp?
}


