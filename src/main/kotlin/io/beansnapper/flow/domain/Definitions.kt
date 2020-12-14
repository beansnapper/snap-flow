package io.beansnapper.flow.domain

import java.util.*

typealias Timestamp = Date
typealias ActionLambda = () -> Unit

interface DataObject<T : Any> {
    val id: RefId<T>?
    val timestamp: Timestamp?
}


