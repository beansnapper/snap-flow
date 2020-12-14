package io.beansnapper.flow.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002R\u001a\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lio/beansnapper/flow/domain/DataObject;", "T", "", "id", "Lio/beansnapper/flow/domain/RefId;", "getId", "()Lio/beansnapper/flow/domain/RefId;", "timestamp", "Ljava/util/Date;", "Lio/beansnapper/flow/domain/Timestamp;", "getTimestamp", "()Ljava/util/Date;", "snap-flow"})
public abstract interface DataObject<T extends java.lang.Object> {
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.beansnapper.flow.domain.RefId<T> getId();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.util.Date getTimestamp();
}