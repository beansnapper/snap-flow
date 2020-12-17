package io.beansnapper.flow.engine

import io.beansnapper.annotations.ThreadSafe
import java.util.concurrent.locks.ReentrantReadWriteLock
import kotlin.concurrent.read
import kotlin.concurrent.write

@ThreadSafe
class FlowContext {
    private val lock = ReentrantReadWriteLock()
    private val map = mutableMapOf<String, Any>()

    operator fun get(key: String): Any? {
        lock.read {
            @Suppress("UNCHECKED_CAST")
            return map[key]
        }
    }

    operator fun set(key: String, value: Any) {
        lock.write {
            map[key] = value
        }
    }

}
