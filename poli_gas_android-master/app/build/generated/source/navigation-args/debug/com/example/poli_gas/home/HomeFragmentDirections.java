package com.example.poli_gas.home;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.poli_gas.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static ActionHomeFragmentToTypeRequestFragment actionHomeFragmentToTypeRequestFragment(int typeCylinder,
      @NonNull String totalCylinder) {
    return new ActionHomeFragmentToTypeRequestFragment(typeCylinder, totalCylinder);
  }

  public static class ActionHomeFragmentToTypeRequestFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionHomeFragmentToTypeRequestFragment(int typeCylinder,
        @NonNull String totalCylinder) {
      this.arguments.put("typeCylinder", typeCylinder);
      if (totalCylinder == null) {
        throw new IllegalArgumentException("Argument \"totalCylinder\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("totalCylinder", totalCylinder);
    }

    @NonNull
    public ActionHomeFragmentToTypeRequestFragment setTypeCylinder(int typeCylinder) {
      this.arguments.put("typeCylinder", typeCylinder);
      return this;
    }

    @NonNull
    public ActionHomeFragmentToTypeRequestFragment setTotalCylinder(@NonNull String totalCylinder) {
      if (totalCylinder == null) {
        throw new IllegalArgumentException("Argument \"totalCylinder\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("totalCylinder", totalCylinder);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_homeFragment_to_typeRequestFragment;
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

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionHomeFragmentToTypeRequestFragment that = (ActionHomeFragmentToTypeRequestFragment) object;
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
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getTypeCylinder();
      result = 31 * result + (getTotalCylinder() != null ? getTotalCylinder().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionHomeFragmentToTypeRequestFragment(actionId=" + getActionId() + "){"
          + "typeCylinder=" + getTypeCylinder()
          + ", totalCylinder=" + getTotalCylinder()
          + "}";
    }
  }
}
