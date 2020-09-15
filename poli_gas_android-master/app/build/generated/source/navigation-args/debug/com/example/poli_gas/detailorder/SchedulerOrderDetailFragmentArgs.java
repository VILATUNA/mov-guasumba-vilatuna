package com.example.poli_gas.detailorder;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class SchedulerOrderDetailFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private SchedulerOrderDetailFragmentArgs() {
  }

  private SchedulerOrderDetailFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static SchedulerOrderDetailFragmentArgs fromBundle(@NonNull Bundle bundle) {
    SchedulerOrderDetailFragmentArgs __result = new SchedulerOrderDetailFragmentArgs();
    bundle.setClassLoader(SchedulerOrderDetailFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("orderId")) {
      String orderId;
      orderId = bundle.getString("orderId");
      if (orderId == null) {
        throw new IllegalArgumentException("Argument \"orderId\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("orderId", orderId);
    } else {
      throw new IllegalArgumentException("Required argument \"orderId\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getOrderId() {
    return (String) arguments.get("orderId");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("orderId")) {
      String orderId = (String) arguments.get("orderId");
      __result.putString("orderId", orderId);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    SchedulerOrderDetailFragmentArgs that = (SchedulerOrderDetailFragmentArgs) object;
    if (arguments.containsKey("orderId") != that.arguments.containsKey("orderId")) {
      return false;
    }
    if (getOrderId() != null ? !getOrderId().equals(that.getOrderId()) : that.getOrderId() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getOrderId() != null ? getOrderId().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "SchedulerOrderDetailFragmentArgs{"
        + "orderId=" + getOrderId()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(SchedulerOrderDetailFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull String orderId) {
      if (orderId == null) {
        throw new IllegalArgumentException("Argument \"orderId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("orderId", orderId);
    }

    @NonNull
    public SchedulerOrderDetailFragmentArgs build() {
      SchedulerOrderDetailFragmentArgs result = new SchedulerOrderDetailFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setOrderId(@NonNull String orderId) {
      if (orderId == null) {
        throw new IllegalArgumentException("Argument \"orderId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("orderId", orderId);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getOrderId() {
      return (String) arguments.get("orderId");
    }
  }
}
