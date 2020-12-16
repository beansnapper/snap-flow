package io.beansnapper.flow.domain

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
    private val cache = HashMap<ObjectId<Any>, DataObject<Any>>()
    private val lock = ReentrantReadWriteLock()

    private fun genId(): String = UUID.randomUUID().toString()

    fun <T : Any> fetch(rawId: RawId): T {
        lock.read {
            @Suppress("UNCHECKED_CAST", "TYPE_INFERENCE_ONLY_INPUT_TYPES_WARNING")
            return (cache.get(rawId) ?: throw ObjectNotFound("Id = $rawId")) as T
        }
    }

    fun <T : Any> fetch(id: ObjectId<T>): T {
        // TODO: looks like a kotlin bug.
        val t: T = fetch(id.id ?: throw Exception("Id is unset for $id"))
        t.also { id.obj = it }
        return t
    }

    /**
     * for a collection of ObjectIds - make sure all references have been resolved
     */
    fun <T : Any> fetch(ids: Collection<ObjectId<T>>) =
        lock.read { ids.forEach { fetch<T>(it) } }

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