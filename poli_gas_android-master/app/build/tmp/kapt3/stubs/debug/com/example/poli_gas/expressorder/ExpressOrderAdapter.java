package com.example.poli_gas.expressorder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0019\u001aB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001b"}, d2 = {"Lcom/example/poli_gas/expressorder/ExpressOrderAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/poli_gas/expressorder/DataItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "clickListener", "Lcom/example/poli_gas/expressorder/PoliGasListener;", "(Lcom/example/poli_gas/expressorder/PoliGasListener;)V", "adapterScope", "Lkotlinx/coroutines/CoroutineScope;", "getClickListener", "()Lcom/example/poli_gas/expressorder/PoliGasListener;", "addHeaderAndSubmitList", "", "list", "", "Lcom/example/poli_gas/database/PoliGas;", "getItemViewType", "", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "TextViewHolder", "ViewHolder", "app_debug"})
public final class ExpressOrderAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.poli_gas.expressorder.DataItem, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final kotlinx.coroutines.CoroutineScope adapterScope = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.poli_gas.expressorder.PoliGasListener clickListener = null;
    
    public final void addHeaderAndSubmitList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.poli_gas.database.PoliGas> list) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.poli_gas.expressorder.PoliGasListener getClickListener() {
        return null;
    }
    
    public ExpressOrderAdapter(@org.jetbrains.annotations.NotNull()
    com.example.poli_gas.expressorder.PoliGasListener clickListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0006"}, d2 = {"Lcom/example/poli_gas/expressorder/ExpressOrderAdapter$TextViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "Companion", "app_debug"})
    public static final class TextViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public static final com.example.poli_gas.expressorder.ExpressOrderAdapter.TextViewHolder.Companion Companion = null;
        
        public TextViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/poli_gas/expressorder/ExpressOrderAdapter$TextViewHolder$Companion;", "", "()V", "from", "Lcom/example/poli_gas/expressorder/ExpressOrderAdapter$TextViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.poli_gas.expressorder.ExpressOrderAdapter.TextViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/example/poli_gas/expressorder/ExpressOrderAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/poli_gas/databinding/ListItemPoligasExpressBinding;", "(Lcom/example/poli_gas/databinding/ListItemPoligasExpressBinding;)V", "getBinding", "()Lcom/example/poli_gas/databinding/ListItemPoligasExpressBinding;", "bind", "", "clickListener", "Lcom/example/poli_gas/expressorder/PoliGasListener;", "item", "Lcom/example/poli_gas/database/PoliGas;", "Companion", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.poli_gas.databinding.ListItemPoligasExpressBinding binding = null;
        public static final com.example.poli_gas.expressorder.ExpressOrderAdapter.ViewHolder.Companion Companion = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.poli_gas.expressorder.PoliGasListener clickListener, @org.jetbrains.annotations.NotNull()
        com.example.poli_gas.database.PoliGas item) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.poli_gas.databinding.ListItemPoligasExpressBinding getBinding() {
            return null;
        }
        
        private ViewHolder(com.example.poli_gas.databinding.ListItemPoligasExpressBinding binding) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/poli_gas/expressorder/ExpressOrderAdapter$ViewHolder$Companion;", "", "()V", "from", "Lcom/example/poli_gas/expressorder/ExpressOrderAdapter$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.poli_gas.expressorder.ExpressOrderAdapter.ViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}