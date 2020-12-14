package io.beansnapper.flow.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001Bg\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00030\n\u0012\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00030\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u001b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\bH\u00c6\u0003J\u0015\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00030\nH\u00c6\u0003J\u0015\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00030\nH\u00c6\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003H\u00c6\u0003Js\u0010 \u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00030\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00030\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003H\u00c6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020\bH\u00d6\u0001R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00030\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00030\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016\u00a8\u0006("}, d2 = {"Lio/beansnapper/flow/domain/Flow;", "Lio/beansnapper/flow/domain/DataObject;", "id", "Lio/beansnapper/flow/domain/RefId;", "timestamp", "Ljava/util/Date;", "Lio/beansnapper/flow/domain/Timestamp;", "name", "", "steps", "", "Lio/beansnapper/flow/domain/Step;", "wires", "Lio/beansnapper/flow/domain/Wire;", "defaultStart", "(Lio/beansnapper/flow/domain/RefId;Ljava/util/Date;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Lio/beansnapper/flow/domain/RefId;)V", "getDefaultStart", "()Lio/beansnapper/flow/domain/RefId;", "getId", "getName", "()Ljava/lang/String;", "getSteps", "()Ljava/util/Collection;", "getTimestamp", "()Ljava/util/Date;", "getWires", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "snap-flow"})
public final class Flow implements io.beansnapper.flow.domain.DataObject<io.beansnapper.flow.domain.Flow> {
    @org.jetbrains.annotations.Nullable()
    private final io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Flow> id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date timestamp = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Collection<io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Step>> steps = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Collection<io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Wire>> wires = null;
    @org.jetbrains.annotations.NotNull()
    private final io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Step> defaultStart = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Flow> getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.util.Date getTimestamp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Collection<io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Step>> getSteps() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Collection<io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Wire>> getWires() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Step> getDefaultStart() {
        return null;
    }
    
    public Flow(@org.jetbrains.annotations.Nullable()
    io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Flow> id, @org.jetbrains.annotations.Nullable()
    java.util.Date timestamp, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.util.Collection<io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Step>> steps, @org.jetbrains.annotations.NotNull()
    java.util.Collection<io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Wire>> wires, @org.jetbrains.annotations.NotNull()
    io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Step> defaultStart) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Flow> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Collection<io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Step>> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Collection<io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Wire>> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Step> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.beansnapper.flow.domain.Flow copy(@org.jetbrains.annotations.Nullable()
    io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Flow> id, @org.jetbrains.annotations.Nullable()
    java.util.Date timestamp, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.util.Collection<io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Step>> steps, @org.jetbrains.annotations.NotNull()
    java.util.Collection<io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Wire>> wires, @org.jetbrains.annotations.NotNull()
    io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Step> defaultStart) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}