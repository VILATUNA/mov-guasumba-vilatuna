package com.example.poli_gas.mapnavigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0010H\u0016J\b\u0010\u001f\u001a\u00020\u0010H\u0016J\b\u0010 \u001a\u00020\u0010H\u0016J\u0010\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0010H\u0016J\b\u0010%\u001a\u00020\u0010H\u0016J\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020\u0010H\u0016J\u0010\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u001dH\u0016J\b\u0010.\u001a\u00020\u0010H\u0016J\b\u0010/\u001a\u00020\u0010H\u0016J\u001a\u00100\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u00102\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u00103\u001a\u00020\u0010H\u0002J\b\u00104\u001a\u00020\u0010H\u0002J\u0010\u00105\u001a\u00020\u00102\u0006\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u00020\u0010H\u0003J\u0010\u00109\u001a\u00020\u00102\u0006\u0010:\u001a\u00020#H\u0002J\u000e\u0010;\u001a\u00020\u00102\u0006\u0010<\u001a\u00020#J\b\u0010:\u001a\u00020#H\u0002J\b\u0010<\u001a\u00020#H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2 = {"Lcom/example/poli_gas/mapnavigation/NavigationMapFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/mapbox/services/android/navigation/ui/v5/OnNavigationReadyCallback;", "Lcom/mapbox/services/android/navigation/ui/v5/listeners/NavigationListener;", "Lcom/mapbox/services/android/navigation/v5/routeprogress/ProgressChangeListener;", "()V", "DESTINATION_LATITUDE", "", "DESTINATION_LONGITUDE", "ORIGIN_LATITUDE", "ORIGIN_LONGITUDE", "directionsRoute", "Lcom/mapbox/api/directions/v5/models/DirectionsRoute;", "navigationView", "Lcom/mapbox/services/android/navigation/ui/v5/NavigationView;", "fetchRoute", "", "origin", "Lcom/mapbox/geojson/Point;", "destination", "initDestinationCoordinates", "onCancelNavigation", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onLowMemory", "onNavigationFinished", "onNavigationReady", "isRunning", "", "onNavigationRunning", "onPause", "onProgressChange", "location", "Landroid/location/Location;", "routeProgress", "Lcom/mapbox/services/android/navigation/v5/routeprogress/RouteProgress;", "onResume", "onSaveInstanceState", "outState", "onStart", "onStop", "onViewCreated", "view", "onViewStateRestored", "startNavigation", "stopNavigation", "updateCurrentNightMode", "nightMode", "", "updateNightMode", "updateWasInTunnel", "wasInTunnel", "updateWasNavigationStopped", "wasNavigationStopped", "app_debug"})
public final class NavigationMapFragment extends androidx.fragment.app.Fragment implements com.mapbox.services.android.navigation.ui.v5.OnNavigationReadyCallback, com.mapbox.services.android.navigation.ui.v5.listeners.NavigationListener, com.mapbox.services.android.navigation.v5.routeprogress.ProgressChangeListener {
    private com.mapbox.services.android.navigation.ui.v5.NavigationView navigationView;
    private com.mapbox.api.directions.v5.models.DirectionsRoute directionsRoute;
    private double ORIGIN_LONGITUDE;
    private double ORIGIN_LATITUDE;
    private double DESTINATION_LONGITUDE;
    private double DESTINATION_LATITUDE;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initDestinationCoordinates() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onViewStateRestored(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onLowMemory() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onNavigationReady(boolean isRunning) {
    }
    
    @java.lang.Override()
    public void onCancelNavigation() {
    }
    
    @java.lang.Override()
    public void onNavigationFinished() {
    }
    
    @java.lang.Override()
    public void onNavigationRunning() {
    }
    
    @java.lang.Override()
    public void onProgressChange(@org.jetbrains.annotations.NotNull()
    android.location.Location location, @org.jetbrains.annotations.NotNull()
    com.mapbox.services.android.navigation.v5.routeprogress.RouteProgress routeProgress) {
    }
    
    @android.annotation.SuppressLint(value = {"WrongConstant"})
    private final void updateNightMode() {
    }
    
    private final void fetchRoute(com.mapbox.geojson.Point origin, com.mapbox.geojson.Point destination) {
    }
    
    private final void startNavigation() {
    }
    
    private final void stopNavigation() {
    }
    
    private final boolean wasInTunnel() {
        return false;
    }
    
    private final void updateWasInTunnel(boolean wasInTunnel) {
    }
    
    private final void updateCurrentNightMode(int nightMode) {
    }
    
    private final boolean wasNavigationStopped() {
        return false;
    }
    
    public final void updateWasNavigationStopped(boolean wasNavigationStopped) {
    }
    
    public NavigationMapFragment() {
        super();
    }
}