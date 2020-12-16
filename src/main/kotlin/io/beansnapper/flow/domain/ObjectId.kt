package io.beansnapper.flow.domain

class ObjectId<T : Any>(val id: RawId? = null) {
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


}
