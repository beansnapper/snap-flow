package io.beansnapper.flow.domain

import java.util.*

typealias Timestamp = Date
typealias ActionLambda = () -> Unit
typealias RawId = String

interface DataObject<T : Any> {
    val id: ObjectId<T>?
    val timestamp: Timestamp?
}


