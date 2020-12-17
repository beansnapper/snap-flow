package io.beansnapper.flow.domain

class ObjectId<T : Any>(val rawId: RawId? = null) {
    internal lateinit var obj: T
    val value: T
        get() {
            if (!this::obj.isInitialized) {
                obj = Cache.fetch(this)
            }
            return obj
        }

    constructor(value: T) : this(null) {
        this.obj = value
    }

    override fun toString(): String {
        return if (this::obj.isInitialized)
            obj.toString()
        else
            rawId ?: "[unknown]"

    }

}
