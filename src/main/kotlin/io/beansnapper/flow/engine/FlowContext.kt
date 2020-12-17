package io.beansnapper.flow.engine

import java.util.concurrent.locks.ReentrantReadWriteLock
import kotlin.concurrent.read
import kotlin.concurrent.write

//TODO: there may be a better Kotlin-friendly way to do this
class FlowContext {
    private val lock = ReentrantReadWriteLock()
    private val map = mutableMapOf<String, Any>()

    fun put(key: String, value: Any) {
        lock.write {
            map[key] = value
        }
    }

    operator fun get(key: String): Any? {
        lock.read {
            @Suppress("UNCHECKED_CAST")
            return map[key]
        }
    }


}
