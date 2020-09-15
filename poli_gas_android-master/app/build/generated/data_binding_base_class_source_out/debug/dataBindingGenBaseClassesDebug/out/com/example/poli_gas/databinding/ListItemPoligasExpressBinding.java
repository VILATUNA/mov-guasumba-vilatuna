// Generated by data binding compiler. Do not edit!
package com.example.poli_gas.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.poli_gas.R;
import com.example.poli_gas.database.PoliGas;
import com.example.poli_gas.expressorder.PoliGasListener;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ListItemPoligasExpressBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final ImageView qualityImage;

  @NonNull
  public final TextView qualityString;

  @Bindable
  protected PoliGas mPoligas;

  @Bindable
  protected PoliGasListener mClickListener;

  protected ListItemPoligasExpressBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ImageView imageView2, ImageView qualityImage, TextView qualityString) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageView2 = imageView2;
    this.qualityImage = qualityImage;
    this.qualityString = qualityString;
  }

  public abstract void setPoligas(@Nullable PoliGas poligas);

  @Nullable
  public PoliGas getPoligas() {
    return mPoligas;
  }

  public abstract void setClickListener(@Nullable PoliGasListener clickListener);

  @Nullable
  public PoliGasListener getClickListener() {
    return mClickListener;
  }

  @NonNull
  public static ListItemPoligasExpressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_poligas_express, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemPoligasExpressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItemPoligasExpressBinding>inflateInternal(inflater, R.layout.list_item_poligas_express, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemPoligasExpressBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_poligas_express, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemPoligasExpressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemPoligasExpressBinding>inflateInternal(inflater, R.layout.list_item_poligas_express, null, false, component);
  }

  public static ListItemPoligasExpressBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ListItemPoligasExpressBinding bind(@NonNull View view, @Nullable Object component) {
    return (ListItemPoligasExpressBinding)bind(component, view, R.layout.list_item_poligas_express);
  }
}
