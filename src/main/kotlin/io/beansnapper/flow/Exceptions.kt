package io.beansnapper.flow


class FlowException(
    override val message : String = "",
    override val cause : Throwable? = null
) : Exception(message, cause)

