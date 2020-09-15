package com.example.poli_gas.type_request;

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

public class TypeRequestFragmentDirections {
  private TypeRequestFragmentDirections() {
  }

  @NonNull
  public static ActionTypeRequestFragmentToProgressRequestFragment actionTypeRequestFragmentToProgressRequestFragment(boolean progressState) {
    return new ActionTypeRequestFragmentToProgressRequestFragment(progressState);
  }

  @NonNull
  public static ActionTypeRequestFragmentToScheduleRequestFragment actionTypeRequestFragmentToScheduleRequestFragment(@NonNull String totalCylinder,
      int typeCylinder) {
    return new ActionTypeRequestFragmentToScheduleRequestFragment(totalCylinder, typeCylinder);
  }

  public static class ActionTypeRequestFragmentToProgressRequestFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionTypeRequestFragmentToProgressRequestFragment(boolean progressState) {
      this.arguments.put("progressState", progressState);
    }

    @NonNull
    public ActionTypeRequestFragmentToProgressRequestFragment setProgressState(boolean progressState) {
      this.arguments.put("progressState", progressState);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("progressState")) {
        boolean progressState = (boolean) arguments.get("progressState");
        __result.putBoolean("progressState", progressState);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_typeRequestFragment_to_progressRequestFragment;
    }

    @SuppressWarnings("unchecked")
    public boolean getProgressState() {
      return (boolean) arguments.get("progressState");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionTypeRequestFragmentToProgressRequestFragment that = (ActionTypeRequestFragmentToProgressRequestFragment) object;
      if (arguments.containsKey("progressState") != that.arguments.containsKey("progressState")) {
        return false;
      }
      if (getProgressState() != that.getProgressState()) {
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
      result = 31 * result + (getProgressState() ? 1 : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionTypeRequestFragmentToProgressRequestFragment(actionId=" + getActionId() + "){"
          + "progressState=" + getProgressState()
          + "}";
    }
  }

  public static class ActionTypeRequestFragmentToScheduleRequestFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionTypeRequestFragmentToScheduleRequestFragment(@NonNull String totalCylinder,
        int typeCylinder) {
      if (totalCylinder == null) {
        throw new IllegalArgumentException("Argument \"totalCylinder\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("totalCylinder", totalCylinder);
      this.arguments.put("typeCylinder", typeCylinder);
    }

    @NonNull
    public ActionTypeRequestFragmentToScheduleRequestFragment setTotalCylinder(@NonNull String totalCylinder) {
      if (totalCylinder == null) {
        throw new IllegalArgumentException("Argument \"totalCylinder\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("totalCylinder", totalCylinder);
      return this;
    }

    @NonNull
    public ActionTypeRequestFragmentToScheduleRequestFragment setTypeCylinder(int typeCylinder) {
      this.arguments.put("typeCylinder", typeCylinder);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_typeRequestFragment_to_scheduleRequestFragment;
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

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionTypeRequestFragmentToScheduleRequestFragment that = (ActionTypeRequestFragmentToScheduleRequestFragment) object;
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
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getTotalCylinder() != null ? getTotalCylinder().hashCode() : 0);
      result = 31 * result + getTypeCylinder();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionTypeRequestFragmentToScheduleRequestFragment(actionId=" + getActionId() + "){"
          + "totalCylinder=" + getTotalCylinder()
          + ", typeCylinder=" + getTypeCylinder()
          + "}";
    }
  }
}
