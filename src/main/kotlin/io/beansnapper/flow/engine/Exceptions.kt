package io.beansnapper.flow.engine


open class FlowException(message: String = "", cause: Throwable? = null) : Exception(message, cause)

class ObjectNotFound(message: String = "", cause: Throwable? = null) : FlowException(message, cause)