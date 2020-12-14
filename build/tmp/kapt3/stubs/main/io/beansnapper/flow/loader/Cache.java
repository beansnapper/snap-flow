package io.beansnapper.flow.loader;

import java.lang.System;

/**
 * FUTURE: convert this to abstract to support persistence
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J+\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u00012\u0014\u0010\u000b\u001a\u0010\u0012\f\b\u0000\u0012\b\u0012\u0004\u0012\u0002H\n0\u00060\u0005\u00a2\u0006\u0002\u0010\fJ2\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\n0\r\"\b\b\u0000\u0010\n*\u00020\u00012\u001a\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\b\u0000\u0012\b\u0012\u0004\u0012\u0002H\n0\u00060\u00050\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J#\u0010\u0012\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\n0\u0006\u00a2\u0006\u0002\u0010\u0014R.\u0010\u0003\u001a\"\u0012\u0012\u0012\u0010\u0012\f\b\u0000\u0012\b\u0012\u0004\u0012\u00020\u00010\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lio/beansnapper/flow/loader/Cache;", "", "()V", "cache", "Ljava/util/HashMap;", "Lio/beansnapper/flow/domain/RefId;", "Lio/beansnapper/flow/domain/DataObject;", "lock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "fetch", "T", "id", "(Lio/beansnapper/flow/domain/RefId;)Ljava/lang/Object;", "", "ids", "", "genId", "", "insert", "obj", "(Lio/beansnapper/flow/domain/DataObject;)Ljava/lang/Object;", "snap-flow"})
public final class Cache {
    private static final java.util.HashMap<io.beansnapper.flow.domain.RefId<? super io.beansnapper.flow.domain.DataObject<java.lang.Object>>, io.beansnapper.flow.domain.DataObject<java.lang.Object>> cache = null;
    private static final java.util.concurrent.locks.ReentrantReadWriteLock lock = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.beansnapper.flow.loader.Cache INSTANCE = null;
    
    private final java.lang.String genId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>T fetch(@org.jetbrains.annotations.NotNull()
    io.beansnapper.flow.domain.RefId<? super io.beansnapper.flow.domain.DataObject<T>> id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>java.util.List<T> fetch(@org.jetbrains.annotations.NotNull()
    java.util.Collection<? extends io.beansnapper.flow.domain.RefId<? super io.beansnapper.flow.domain.DataObject<T>>> ids) {
        return null;
    }
    
    /**
     * insert object
     *
     * @return mutated copy of obj that contains the new object
     */
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>T insert(@org.jetbrains.annotations.NotNull()
    io.beansnapper.flow.domain.DataObject<T> obj) {
        return null;
    }
    
    private Cache() {
        super();
    }
}