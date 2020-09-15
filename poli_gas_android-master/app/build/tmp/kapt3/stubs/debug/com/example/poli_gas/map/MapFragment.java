package com.example.poli_gas.map;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00015B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000fH\u0002J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u0015H\u0016J\u0018\u0010#\u001a\u00020\u00152\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\u0015H\u0016J\u0010\u0010\'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020)H\u0016J+\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010.\u001a\u00020/H\u0016\u00a2\u0006\u0002\u00100J\b\u00101\u001a\u00020\u0015H\u0016J\b\u00102\u001a\u00020\u0015H\u0016J\b\u00103\u001a\u00020\u0015H\u0016J\b\u00104\u001a\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lcom/example/poli_gas/map/MapFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/mapbox/android/core/permissions/PermissionsListener;", "()V", "db", "Lcom/google/firebase/firestore/FirebaseFirestore;", "droppedMarkerLayer", "Lcom/mapbox/mapboxsdk/style/layers/Layer;", "hoveringMarker", "Landroid/widget/ImageView;", "latLong", "", "", "[Ljava/lang/String;", "map", "Lcom/mapbox/mapboxsdk/maps/MapboxMap;", "mapView", "Lcom/mapbox/mapboxsdk/maps/MapView;", "permissionsManager", "Lcom/mapbox/android/core/permissions/PermissionsManager;", "enableLocationPlugin", "", "loadedMapStyle", "Lcom/mapbox/mapboxsdk/maps/Style;", "mapboxMap", "initDroppedMarker", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onExplanationNeeded", "permissionsToExplain", "", "onPause", "onPermissionResult", "granted", "", "onRequestPermissionsResult", "requestCode", "", "permissions", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onStart", "onStop", "saveCoordinates", "Companion", "app_debug"})
public final class MapFragment extends androidx.fragment.app.Fragment implements com.mapbox.android.core.permissions.PermissionsListener {
    private com.mapbox.mapboxsdk.maps.MapView mapView;
    private com.mapbox.mapboxsdk.maps.MapboxMap map;
    private com.mapbox.android.core.permissions.PermissionsManager permissionsManager;
    private android.widget.ImageView hoveringMarker;
    private com.mapbox.mapboxsdk.style.layers.Layer droppedMarkerLayer;
    private java.lang.String[] latLong;
    private final com.google.firebase.firestore.FirebaseFirestore db = null;
    private static final java.lang.String DROPPED_MARKER_LAYER_ID = "DROPPED_MARKER_LAYER_ID";
    public static final com.example.poli_gas.map.MapFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void saveCoordinates() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onExplanationNeeded(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> permissionsToExplain) {
    }
    
    @java.lang.Override()
    public void onPermissionResult(boolean granted) {
    }
    
    private final void initDroppedMarker(com.mapbox.mapboxsdk.maps.Style loadedMapStyle) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void enableLocationPlugin(com.mapbox.mapboxsdk.maps.Style loadedMapStyle, com.mapbox.mapboxsdk.maps.MapboxMap mapboxMap) {
    }
    
    public MapFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/poli_gas/map/MapFragment$Companion;", "", "()V", "DROPPED_MARKER_LAYER_ID", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}