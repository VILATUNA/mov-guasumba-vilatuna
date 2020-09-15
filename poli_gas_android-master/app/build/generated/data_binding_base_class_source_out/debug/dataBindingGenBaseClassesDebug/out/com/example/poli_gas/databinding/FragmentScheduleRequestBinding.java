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

public abstract class FragmentScheduleRequestBinding extends ViewDataBinding {
  @NonNull
  public final ImageView cylinderView;

  @NonNull
  public final Button datePickerButton;

  @NonNull
  public final TextView deliveryDateText;

  @NonNull
  public final TextView deliveryHourText;

  @NonNull
  public final TextView quantityText;

  @NonNull
  public final Button scheduleOrderButton;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView11;

  @NonNull
  public final TextView textView12;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final Button timePickerButton;

  protected FragmentScheduleRequestBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ImageView cylinderView, Button datePickerButton,
      TextView deliveryDateText, TextView deliveryHourText, TextView quantityText,
      Button scheduleOrderButton, TextView textView10, TextView textView11, TextView textView12,
      TextView textView7, Button timePickerButton) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cylinderView = cylinderView;
    this.datePickerButton = datePickerButton;
    this.deliveryDateText = deliveryDateText;
    this.deliveryHourText = deliveryHourText;
    this.quantityText = quantityText;
    this.scheduleOrderButton = scheduleOrderButton;
    this.textView10 = textView10;
    this.textView11 = textView11;
    this.textView12 = textView12;
    this.textView7 = textView7;
    this.timePickerButton = timePickerButton;
  }

  @NonNull
  public static FragmentScheduleRequestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_schedule_request, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentScheduleRequestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentScheduleRequestBinding>inflateInternal(inflater, R.layout.fragment_schedule_request, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentScheduleRequestBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_schedule_request, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentScheduleRequestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentScheduleRequestBinding>inflateInternal(inflater, R.layout.fragment_schedule_request, null, false, component);
  }

  public static FragmentScheduleRequestBinding bind(@NonNull View view) {
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
  public static FragmentScheduleRequestBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentScheduleRequestBinding)bind(component, view, R.layout.fragment_schedule_request);
  }
}
