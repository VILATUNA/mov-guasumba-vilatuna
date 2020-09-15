package com.example.poli_gas.mapnavigation;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class NavigationMapFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private NavigationMapFragmentArgs() {
  }

  private NavigationMapFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static NavigationMapFragmentArgs fromBundle(@NonNull Bundle bundle) {
    NavigationMapFragmentArgs __result = new NavigationMapFragmentArgs();
    bundle.setClassLoader(NavigationMapFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("latitud")) {
      String latitud;
      latitud = bundle.getString("latitud");
      if (latitud == null) {
        throw new IllegalArgumentException("Argument \"latitud\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("latitud", latitud);
    } else {
      throw new IllegalArgumentException("Required argument \"latitud\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("longitud")) {
      String longitud;
      longitud = bundle.getString("longitud");
      if (longitud == null) {
        throw new IllegalArgumentException("Argument \"longitud\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("longitud", longitud);
    } else {
      throw new IllegalArgumentException("Required argument \"longitud\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getLatitud() {
    return (String) arguments.get("latitud");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getLongitud() {
    return (String) arguments.get("longitud");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("latitud")) {
      String latitud = (String) arguments.get("latitud");
      __result.putString("latitud", latitud);
    }
    if (arguments.containsKey("longitud")) {
      String longitud = (String) arguments.get("longitud");
      __result.putString("longitud", longitud);
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
    NavigationMapFragmentArgs that = (NavigationMapFragmentArgs) object;
    if (arguments.containsKey("latitud") != that.arguments.containsKey("latitud")) {
      return false;
    }
    if (getLatitud() != null ? !getLatitud().equals(that.getLatitud()) : that.getLatitud() != null) {
      return false;
    }
    if (arguments.containsKey("longitud") != that.arguments.containsKey("longitud")) {
      return false;
    }
    if (getLongitud() != null ? !getLongitud().equals(that.getLongitud()) : that.getLongitud() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getLatitud() != null ? getLatitud().hashCode() : 0);
    result = 31 * result + (getLongitud() != null ? getLongitud().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "NavigationMapFragmentArgs{"
        + "latitud=" + getLatitud()
        + ", longitud=" + getLongitud()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(NavigationMapFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull String latitud, @NonNull String longitud) {
      if (latitud == null) {
        throw new IllegalArgumentException("Argument \"latitud\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("latitud", latitud);
      if (longitud == null) {
        throw new IllegalArgumentException("Argument \"longitud\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("longitud", longitud);
    }

    @NonNull
    public NavigationMapFragmentArgs build() {
      NavigationMapFragmentArgs result = new NavigationMapFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setLatitud(@NonNull String latitud) {
      if (latitud == null) {
        throw new IllegalArgumentException("Argument \"latitud\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("latitud", latitud);
      return this;
    }

    @NonNull
    public Builder setLongitud(@NonNull String longitud) {
      if (longitud == null) {
        throw new IllegalArgumentException("Argument \"longitud\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("longitud", longitud);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getLatitud() {
      return (String) arguments.get("latitud");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getLongitud() {
      return (String) arguments.get("longitud");
    }
  }
}
