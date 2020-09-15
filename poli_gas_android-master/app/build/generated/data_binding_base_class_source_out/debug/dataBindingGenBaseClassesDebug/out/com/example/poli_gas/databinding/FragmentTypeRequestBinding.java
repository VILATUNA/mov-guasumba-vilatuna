// Generated by data binding compiler. Do not edit!
package com.example.poli_gas.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.poli_gas.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentTypeRequestBinding extends ViewDataBinding {
  @NonNull
  public final ImageView cylinderView;

  @NonNull
  public final Button expressOrderButton;

  @NonNull
  public final TextView quantityText;

  @NonNull
  public final Button scheduleOrderButton;

  @NonNull
  public final TextView textView11;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final TextView textView9;

  protected FragmentTypeRequestBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView cylinderView, Button expressOrderButton, TextView quantityText,
      Button scheduleOrderButton, TextView textView11, TextView textView7, TextView textView9) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cylinderView = cylinderView;
    this.expressOrderButton = expressOrderButton;
    this.quantityText = quantityText;
    this.scheduleOrderButton = scheduleOrderButton;
    this.textView11 = textView11;
    this.textView7 = textView7;
    this.textView9 = textView9;
  }

  @NonNull
  public static FragmentTypeRequestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_type_request, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentTypeRequestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentTypeRequestBinding>inflateInternal(inflater, R.layout.fragment_type_request, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentTypeRequestBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_type_request, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentTypeRequestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentTypeRequestBinding>inflateInternal(inflater, R.layout.fragment_type_request, null, false, component);
  }

  public static FragmentTypeRequestBinding bind(@NonNull View view) {
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
  public static FragmentTypeRequestBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentTypeRequestBinding)bind(component, view, R.layout.fragment_type_request);
  }
}