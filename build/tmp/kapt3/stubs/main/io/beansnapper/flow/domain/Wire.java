package io.beansnapper.flow.domain;

import java.lang.System;

/**
 * A wire represents a directed transition from one step to another.  It's often
 * based on a condition.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BE\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\u0002\u0010\nJ\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0012\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u00c6\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u00c6\u0003JM\u0010\u0015\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f\u00a8\u0006\u001e"}, d2 = {"Lio/beansnapper/flow/domain/Wire;", "Lio/beansnapper/flow/domain/DataObject;", "id", "Lio/beansnapper/flow/domain/RefId;", "timestamp", "Ljava/util/Date;", "Lio/beansnapper/flow/domain/Timestamp;", "from", "Lio/beansnapper/flow/domain/Step;", "to", "(Lio/beansnapper/flow/domain/RefId;Ljava/util/Date;Lio/beansnapper/flow/domain/RefId;Lio/beansnapper/flow/domain/RefId;)V", "getFrom", "()Lio/beansnapper/flow/domain/RefId;", "getId", "getTimestamp", "()Ljava/util/Date;", "getTo", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "snap-flow"})
public final class Wire implements io.beansnapper.flow.domain.DataObject<io.beansnapper.flow.domain.Wire> {
    @org.jetbrains.annotations.Nullable()
    private final io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Wire> id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date timestamp = null;
    @org.jetbrains.annotations.NotNull()
    private final io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Step> from = null;
    @org.jetbrains.annotations.NotNull()
    private final io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Step> to = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Wire> getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.util.Date getTimestamp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Step> getFrom() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Step> getTo() {
        return null;
    }
    
    public Wire(@org.jetbrains.annotations.Nullable()
    io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Wire> id, @org.jetbrains.annotations.Nullable()
    java.util.Date timestamp, @org.jetbrains.annotations.NotNull()
    io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Step> from, @org.jetbrains.annotations.NotNull()
    io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Step> to) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Wire> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Step> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Step> component4() {
        return null;
    }
    
    /**
     * A wire represents a directed transition from one step to another.  It's often
     * based on a condition.
     */
    @org.jetbrains.annotations.NotNull()
    public final io.beansnapper.flow.domain.Wire copy(@org.jetbrains.annotations.Nullable()
    io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Wire> id, @org.jetbrains.annotations.Nullable()
    java.util.Date timestamp, @org.jetbrains.annotations.NotNull()
    io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Step> from, @org.jetbrains.annotations.NotNull()
    io.beansnapper.flow.domain.RefId<io.beansnapper.flow.domain.Step> to) {
        return null;
    }
    
    /**
     * A wire represents a directed transition from one step to another.  It's often
     * based on a condition.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * A wire represents a directed transition from one step to another.  It's often
     * based on a condition.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A wire represents a directed transition from one step to another.  It's often
     * based on a condition.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}