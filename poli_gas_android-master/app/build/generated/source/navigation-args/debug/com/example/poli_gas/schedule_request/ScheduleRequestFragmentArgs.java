package com.example.poli_gas.schedule_request;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ScheduleRequestFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ScheduleRequestFragmentArgs() {
  }

  private ScheduleRequestFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ScheduleRequestFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ScheduleRequestFragmentArgs __result = new ScheduleRequestFragmentArgs();
    bundle.setClassLoader(ScheduleRequestFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("totalCylinder")) {
      String totalCylinder;
      totalCylinder = bundle.getString("totalCylinder");
      if (totalCylinder == null) {
        throw new IllegalArgumentException("Argument \"totalCylinder\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("totalCylinder", totalCylinder);
    } else {
      throw new IllegalArgumentException("Required argument \"totalCylinder\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("typeCylinder")) {
      int typeCylinder;
      typeCylinder = bundle.getInt("typeCylinder");
      __result.arguments.put("typeCylinder", typeCylinder);
    } else {
      throw new IllegalArgumentException("Required argument \"typeCylinder\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getTotalCylinder() {
    return (String) arguments.get("totalCylinder");
  }

  @SuppressWarnings("unchecked")
  public int getTypeCylinder() {
    return (int) arguments.get("typeCylinder");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("totalCylinder")) {
      String totalCylinder = (String) arguments.get("totalCylinder");
      __result.putString("totalCylinder", totalCylinder);
    }
    if (arguments.containsKey("typeCylinder")) {
      int typeCylinder = (int) arguments.get("typeCylinder");
      __result.putInt("typeCylinder", typeCylinder);
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
    ScheduleRequestFragmentArgs that = (ScheduleRequestFragmentArgs) object;
    if (arguments.containsKey("totalCylinder") != that.arguments.containsKey("totalCylinder")) {
      return false;
    }
    if (getTotalCylinder() != null ? !getTotalCylinder().equals(that.getTotalCylinder()) : that.getTotalCylinder() != null) {
      return false;
    }
    if (arguments.containsKey("typeCylinder") != that.arguments.containsKey("typeCylinder")) {
      return false;
    }
    if (getTypeCylinder() != that.getTypeCylinder()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getTotalCylinder() != null ? getTotalCylinder().hashCode() : 0);
    result = 31 * result + getTypeCylinder();
    return result;
  }

  @Override
  public String toString() {
    return "ScheduleRequestFragmentArgs{"
        + "totalCylinder=" + getTotalCylinder()
        + ", typeCylinder=" + getTypeCylinder()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(ScheduleRequestFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull String totalCylinder, int typeCylinder) {
      if (totalCylinder == null) {
        throw new IllegalArgumentException("Argument \"totalCylinder\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("totalCylinder", totalCylinder);
      this.arguments.put("typeCylinder", typeCylinder);
    }

    @NonNull
    public ScheduleRequestFragmentArgs build() {
      ScheduleRequestFragmentArgs result = new ScheduleRequestFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setTotalCylinder(@NonNull String totalCylinder) {
      if (totalCylinder == null) {
        throw new IllegalArgumentException("Argument \"totalCylinder\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("totalCylinder", totalCylinder);
      return this;
    }

    @NonNull
    public Builder setTypeCylinder(int typeCylinder) {
      this.arguments.put("typeCylinder", typeCylinder);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getTotalCylinder() {
      return (String) arguments.get("totalCylinder");
    }

    @SuppressWarnings("unchecked")
    public int getTypeCylinder() {
      return (int) arguments.get("typeCylinder");
    }
  }
}
