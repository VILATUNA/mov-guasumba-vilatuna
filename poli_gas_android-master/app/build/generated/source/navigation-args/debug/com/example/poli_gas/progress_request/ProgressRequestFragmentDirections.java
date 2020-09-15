package com.example.poli_gas.progress_request;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.poli_gas.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ProgressRequestFragmentDirections {
  private ProgressRequestFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionProgressRequestFragmentToFeedbackFragment() {
    return new ActionOnlyNavDirections(R.id.action_progressRequestFragment_to_feedbackFragment);
  }

  @NonNull
  public static ActionProgressRequestFragmentToNavigationMapFragment actionProgressRequestFragmentToNavigationMapFragment(@NonNull String latitud,
      @NonNull String longitud) {
    return new ActionProgressRequestFragmentToNavigationMapFragment(latitud, longitud);
  }

  public static class ActionProgressRequestFragmentToNavigationMapFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionProgressRequestFragmentToNavigationMapFragment(@NonNull String latitud,
        @NonNull String longitud) {
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
    public ActionProgressRequestFragmentToNavigationMapFragment setLatitud(@NonNull String latitud) {
      if (latitud == null) {
        throw new IllegalArgumentException("Argument \"latitud\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("latitud", latitud);
      return this;
    }

    @NonNull
    public ActionProgressRequestFragmentToNavigationMapFragment setLongitud(@NonNull String longitud) {
      if (longitud == null) {
        throw new IllegalArgumentException("Argument \"longitud\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("longitud", longitud);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_progressRequestFragment_to_navigationMapFragment;
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

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionProgressRequestFragmentToNavigationMapFragment that = (ActionProgressRequestFragmentToNavigationMapFragment) object;
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
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getLatitud() != null ? getLatitud().hashCode() : 0);
      result = 31 * result + (getLongitud() != null ? getLongitud().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionProgressRequestFragmentToNavigationMapFragment(actionId=" + getActionId() + "){"
          + "latitud=" + getLatitud()
          + ", longitud=" + getLongitud()
          + "}";
    }
  }
}
