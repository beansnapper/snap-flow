package io.beansnapper.flow.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0004B\u0011\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u0003\u001a\u00028\u0000X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\f\u00a8\u0006\r"}, d2 = {"Lio/beansnapper/flow/domain/RefId;", "T", "", "ref", "(Ljava/lang/Object;)V", "id", "", "(Ljava/lang/String;)V", "fetched", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getId", "()Ljava/lang/String;", "Ljava/lang/Object;", "snap-flow"})
public final class RefId<T extends java.lang.Object> {
    private final java.util.concurrent.atomic.AtomicBoolean fetched = null;
    private T ref;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String id = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId() {
        return null;
    }
    
    public RefId(@org.jetbrains.annotations.Nullable()
    java.lang.String id) {
        super();
    }
    
    public RefId() {
        super();
    }
    
    public RefId(@org.jetbrains.annotations.NotNull()
    T ref) {
        super();
    }
}