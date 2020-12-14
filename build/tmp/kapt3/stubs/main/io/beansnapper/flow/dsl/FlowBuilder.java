package io.beansnapper.flow.dsl;

import java.lang.System;

/**
 * intended for single-thread building of a flow
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003()*B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001b\u001a\u00020\u001cJ\u001f\u0010\u001d\u001a\u00020\u00002\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020 0\u001f\u00a2\u0006\u0002\b!J\u000e\u0010\"\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010#\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\rJ \u0010$\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0010\u0010%\u001a\f\u0012\u0004\u0012\u00020 0&j\u0002`\'R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006+"}, d2 = {"Lio/beansnapper/flow/dsl/FlowBuilder;", "", "()V", "defaultStart", "Lio/beansnapper/flow/dsl/FlowBuilder$StepBuilder;", "getDefaultStart", "()Lio/beansnapper/flow/dsl/FlowBuilder$StepBuilder;", "setDefaultStart", "(Lio/beansnapper/flow/dsl/FlowBuilder$StepBuilder;)V", "defaultTerminal", "getDefaultTerminal", "setDefaultTerminal", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "steps", "", "getSteps", "()Ljava/util/Map;", "wires", "", "Lio/beansnapper/flow/dsl/FlowBuilder$WireBuilder;", "getWires", "()Ljava/util/List;", "build", "Lio/beansnapper/flow/domain/Flow;", "flow", "builder", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "getStep", "start", "step", "action", "Lkotlin/Function0;", "Lio/beansnapper/flow/domain/ActionLambda;", "BuilderException", "StepBuilder", "WireBuilder", "snap-flow"})
@io.beansnapper.annotations.NotThreadSafe()
public final class FlowBuilder {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name = "unknown";
    @org.jetbrains.annotations.Nullable()
    private io.beansnapper.flow.dsl.FlowBuilder.StepBuilder defaultStart;
    @org.jetbrains.annotations.NotNull()
    private io.beansnapper.flow.dsl.FlowBuilder.StepBuilder defaultTerminal;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, io.beansnapper.flow.dsl.FlowBuilder.StepBuilder> steps = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.beansnapper.flow.dsl.FlowBuilder.WireBuilder> wires = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.beansnapper.flow.dsl.FlowBuilder.StepBuilder getDefaultStart() {
        return null;
    }
    
    public final void setDefaultStart(@org.jetbrains.annotations.Nullable()
    io.beansnapper.flow.dsl.FlowBuilder.StepBuilder p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.beansnapper.flow.dsl.FlowBuilder.StepBuilder getDefaultTerminal() {
        return null;
    }
    
    public final void setDefaultTerminal(@org.jetbrains.annotations.NotNull()
    io.beansnapper.flow.dsl.FlowBuilder.StepBuilder p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, io.beansnapper.flow.dsl.FlowBuilder.StepBuilder> getSteps() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.beansnapper.flow.dsl.FlowBuilder.WireBuilder> getWires() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.beansnapper.flow.dsl.FlowBuilder.StepBuilder getStep(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.beansnapper.flow.dsl.FlowBuilder flow(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super io.beansnapper.flow.dsl.FlowBuilder, kotlin.Unit> builder) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.beansnapper.flow.dsl.FlowBuilder.StepBuilder step(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.beansnapper.flow.dsl.FlowBuilder.WireBuilder start(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.beansnapper.flow.domain.Flow build() {
        return null;
    }
    
    public FlowBuilder() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lio/beansnapper/flow/dsl/FlowBuilder$BuilderException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "getMessage", "()Ljava/lang/String;", "snap-flow"})
    public static final class BuilderException extends java.lang.Exception {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String message = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Throwable cause = null;
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.String getMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.Throwable getCause() {
            return null;
        }
        
        public BuilderException(@org.jetbrains.annotations.Nullable()
        java.lang.String message, @org.jetbrains.annotations.Nullable()
        java.lang.Throwable cause) {
            super();
        }
        
        public BuilderException() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0010\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\rJ\u0006\u0010 \u001a\u00020\u001fR$\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lio/beansnapper/flow/dsl/FlowBuilder$StepBuilder;", "", "flow", "Lio/beansnapper/flow/dsl/FlowBuilder;", "name", "", "action", "Lkotlin/Function0;", "", "Lio/beansnapper/flow/domain/ActionLambda;", "startStep", "", "terminalStep", "(Lio/beansnapper/flow/dsl/FlowBuilder;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZZ)V", "getAction", "()Lkotlin/jvm/functions/Function0;", "setAction", "(Lkotlin/jvm/functions/Function0;)V", "getFlow", "()Lio/beansnapper/flow/dsl/FlowBuilder;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getStartStep", "()Z", "setStartStep", "(Z)V", "getTerminalStep", "setTerminalStep", "theStep", "Lio/beansnapper/flow/domain/Step;", "build", "snap-flow"})
    public static final class StepBuilder {
        private io.beansnapper.flow.domain.Step theStep;
        @org.jetbrains.annotations.NotNull()
        private final io.beansnapper.flow.dsl.FlowBuilder flow = null;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String name;
        @org.jetbrains.annotations.NotNull()
        private kotlin.jvm.functions.Function0<kotlin.Unit> action;
        private boolean startStep;
        private boolean terminalStep;
        
        @org.jetbrains.annotations.NotNull()
        public final io.beansnapper.flow.domain.Step build() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.beansnapper.flow.dsl.FlowBuilder getFlow() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> getAction() {
            return null;
        }
        
        public final void setAction(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
        }
        
        public final boolean getStartStep() {
            return false;
        }
        
        public final void setStartStep(boolean p0) {
        }
        
        public final boolean getTerminalStep() {
            return false;
        }
        
        public final void setTerminalStep(boolean p0) {
        }
        
        public StepBuilder(@org.jetbrains.annotations.NotNull()
        io.beansnapper.flow.dsl.FlowBuilder flow, @org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> action, boolean startStep, boolean terminalStep) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\r\u0010\u0014\u001a\u00020\u0015H\u0000\u00a2\u0006\u0002\b\u0016J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lio/beansnapper/flow/dsl/FlowBuilder$WireBuilder;", "", "flow", "Lio/beansnapper/flow/dsl/FlowBuilder;", "fromStep", "Lio/beansnapper/flow/dsl/FlowBuilder$StepBuilder;", "toStep", "(Lio/beansnapper/flow/dsl/FlowBuilder;Lio/beansnapper/flow/dsl/FlowBuilder$StepBuilder;Lio/beansnapper/flow/dsl/FlowBuilder$StepBuilder;)V", "getFlow", "()Lio/beansnapper/flow/dsl/FlowBuilder;", "getFromStep", "()Lio/beansnapper/flow/dsl/FlowBuilder$StepBuilder;", "setFromStep", "(Lio/beansnapper/flow/dsl/FlowBuilder$StepBuilder;)V", "getToStep", "setToStep", "andTerminate", "", "stepName", "", "build", "Lio/beansnapper/flow/domain/Wire;", "build$snap_flow", "thenDo", "snap-flow"})
    public static final class WireBuilder {
        @org.jetbrains.annotations.NotNull()
        private final io.beansnapper.flow.dsl.FlowBuilder flow = null;
        @org.jetbrains.annotations.Nullable()
        private io.beansnapper.flow.dsl.FlowBuilder.StepBuilder fromStep;
        @org.jetbrains.annotations.Nullable()
        private io.beansnapper.flow.dsl.FlowBuilder.StepBuilder toStep;
        
        @org.jetbrains.annotations.NotNull()
        public final io.beansnapper.flow.dsl.FlowBuilder.WireBuilder thenDo(@org.jetbrains.annotations.NotNull()
        java.lang.String stepName) {
            return null;
        }
        
        public final void andTerminate(@org.jetbrains.annotations.Nullable()
        java.lang.String stepName) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.beansnapper.flow.domain.Wire build$snap_flow() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.beansnapper.flow.dsl.FlowBuilder getFlow() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.beansnapper.flow.dsl.FlowBuilder.StepBuilder getFromStep() {
            return null;
        }
        
        public final void setFromStep(@org.jetbrains.annotations.Nullable()
        io.beansnapper.flow.dsl.FlowBuilder.StepBuilder p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.beansnapper.flow.dsl.FlowBuilder.StepBuilder getToStep() {
            return null;
        }
        
        public final void setToStep(@org.jetbrains.annotations.Nullable()
        io.beansnapper.flow.dsl.FlowBuilder.StepBuilder p0) {
        }
        
        public WireBuilder(@org.jetbrains.annotations.NotNull()
        io.beansnapper.flow.dsl.FlowBuilder flow, @org.jetbrains.annotations.Nullable()
        io.beansnapper.flow.dsl.FlowBuilder.StepBuilder fromStep, @org.jetbrains.annotations.Nullable()
        io.beansnapper.flow.dsl.FlowBuilder.StepBuilder toStep) {
            super();
        }
    }
}