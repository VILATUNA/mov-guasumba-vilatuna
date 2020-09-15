package com.example.poli_gas.type_request;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class TypeRequestFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private TypeRequestFragmentArgs() {
  }

  private TypeRequestFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static TypeRequestFragmentArgs fromBundle(@NonNull Bundle bundle) {
    TypeRequestFragmentArgs __result = new TypeRequestFragmentArgs();
    bundle.setClassLoader(TypeRequestFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("typeCylinder")) {
      int typeCylinder;
      typeCylinder = bundle.getInt("typeCylinder");
      __result.arguments.put("typeCylinder", typeCylinder);
    } else {
      throw new IllegalArgumentException("Required argument \"typeCylinder\" is missing and does not have an android:defaultValue");
    }
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
    return __result;
  }

  @SuppressWarnings("unchecked")
  public int getTypeCylinder() {
    return (int) arguments.get("typeCylinder");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getTotalCylinder() {
    return (String) arguments.get("totalCylinder");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("typeCylinder")) {
      int typeCylinder = (int) arguments.get("typeCylinder");
      __result.putInt("typeCylinder", typeCylinder);
    }
    if (arguments.containsKey("totalCylinder")) {
      String totalCylinder = (String) arguments.get("totalCylinder");
      __result.putString("totalCylinder", totalCylinder);
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
    TypeRequestFragmentArgs that = (TypeRequestFragmentArgs) object;
    if (arguments.containsKey("typeCylinder") != that.arguments.containsKey("typeCylinder")) {
      return false;
    }
    if (getTypeCylinder() != that.getTypeCylinder()) {
      return false;
    }
    if (arguments.containsKey("totalCylinder") != that.arguments.containsKey("totalCylinder")) {
      return false;
    }
    if (getTotalCylinder() != null ? !getTotalCylinder().equals(that.getTotalCylinder()) : that.getTotalCylinder() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getTypeCylinder();
    result = 31 * result + (getTotalCylinder() != null ? getTotalCylinder().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "TypeRequestFragmentArgs{"
        + "typeCylinder=" + getTypeCylinder()
        + ", totalCylinder=" + getTotalCylinder()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(TypeRequestFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(int typeCylinder, @NonNull String totalCylinder) {
      this.arguments.put("typeCylinder", typeCylinder);
      if (totalCylinder == null) {
        throw new IllegalArgumentException("Argument \"totalCylinder\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("totalCylinder", totalCylinder);
    }

    @NonNull
    public TypeRequestFragmentArgs build() {
      TypeRequestFragmentArgs result = new TypeRequestFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setTypeCylinder(int typeCylinder) {
      this.arguments.put("typeCylinder", typeCylinder);
      return this;
    }

    @NonNull
    public Builder setTotalCylinder(@NonNull String totalCylinder) {
      if (totalCylinder == null) {
        throw new IllegalArgumentException("Argument \"totalCylinder\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("totalCylinder", totalCylinder);
      return this;
    }

    @SuppressWarnings("unchecked")
    public int getTypeCylinder() {
      return (int) arguments.get("typeCylinder");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getTotalCylinder() {
      return (String) arguments.get("totalCylinder");
    }
  }
}
