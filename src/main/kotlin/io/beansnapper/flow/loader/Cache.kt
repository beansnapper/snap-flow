package io.beansnapper.flow.loader

import io.beansnapper.flow.domain.DataObject
import io.beansnapper.flow.domain.RefId
import io.beansnapper.flow.engine.FlowException
import io.beansnapper.flow.engine.ObjectNotFound
import java.util.*
import java.util.concurrent.locks.ReentrantReadWriteLock
import kotlin.collections.HashMap
import kotlin.concurrent.read

/**
 * FUTURE: convert this to abstract to support persistence
 */
object Cache {
    private val cache = HashMap<RefId<in DataObject<Any>>, DataObject<Any>>()
    private val lock = ReentrantReadWriteLock()

    private fun genId(): String = UUID.randomUUID().toString()

    fun <T : Any> fetch(id: RefId<in DataObject<T>>): T {
        lock.read {
            @Suppress("UNCHECKED_CAST", "TYPE_INFERENCE_ONLY_INPUT_TYPES_WARNING")
            return (cache.get(id) ?: throw ObjectNotFound("Id = $id")) as T
        }
    }

    fun <T : Any> fetch(ids: Collection<RefId<in DataObject<T>>>) = lock.read { ids.map { fetch<T>(it) } }

    /**
     * insert object
     *
     * @return mutated copy of obj that contains the new object
     */
    fun <T : Any> insert(obj: DataObject<T>): T {
        obj.id ?: throw FlowException("can't insert $obj as it already has an ID")
//        lock.writeLock() {
//            val obj = obj.toBuilder().apply { id = genId() }.build()
//            val time
//        }
        // TODO: implement
        @Suppress("UNCHECKED_CAST")
        return obj as T
    }

}