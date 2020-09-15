package com.example.poli_gas.expressorder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/example/poli_gas/expressorder/DataItem;", "", "()V", "id", "", "getId", "()Ljava/lang/String;", "Header", "PoliGasItem", "Lcom/example/poli_gas/expressorder/DataItem$PoliGasItem;", "Lcom/example/poli_gas/expressorder/DataItem$Header;", "app_debug"})
public abstract class DataItem {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getId();
    
    private DataItem() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0006H\u00d6\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/example/poli_gas/expressorder/DataItem$PoliGasItem;", "Lcom/example/poli_gas/expressorder/DataItem;", "poligas", "Lcom/example/poli_gas/database/PoliGas;", "(Lcom/example/poli_gas/database/PoliGas;)V", "id", "", "getId", "()Ljava/lang/String;", "getPoligas", "()Lcom/example/poli_gas/database/PoliGas;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class PoliGasItem extends com.example.poli_gas.expressorder.DataItem {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String id = null;
        @org.jetbrains.annotations.NotNull()
        private final com.example.poli_gas.database.PoliGas poligas = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.poli_gas.database.PoliGas getPoligas() {
            return null;
        }
        
        public PoliGasItem(@org.jetbrains.annotations.NotNull()
        com.example.poli_gas.database.PoliGas poligas) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.poli_gas.database.PoliGas component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.poli_gas.expressorder.DataItem.PoliGasItem copy(@org.jetbrains.annotations.NotNull()
        com.example.poli_gas.database.PoliGas poligas) {
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
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/poli_gas/expressorder/DataItem$Header;", "Lcom/example/poli_gas/expressorder/DataItem;", "()V", "id", "", "getId", "()Ljava/lang/String;", "app_debug"})
    public static final class Header extends com.example.poli_gas.expressorder.DataItem {
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String id = "";
        public static final com.example.poli_gas.expressorder.DataItem.Header INSTANCE = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getId() {
            return null;
        }
        
        private Header() {
            super();
        }
    }
}