package io.beansnapper.flow.domain

import java.util.concurrent.atomic.AtomicBoolean

class RefId<T : Any>(val id: String? = null) {
    private val fetched = AtomicBoolean()
    private lateinit var ref: T

    constructor(ref: T) : this(null) {
        this.ref = ref
        fetched.lazySet(true)
    }

}
