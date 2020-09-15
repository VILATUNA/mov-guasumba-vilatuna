package com.example.poli_gas.mapnavigation;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.poli_gas.R;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class NavigationMapFragmentDirections {
  private NavigationMapFragmentDirections() {
  }

  @NonNull
  public static ActionNavigationMapFragmentToProgressRequestFragment actionNavigationMapFragmentToProgressRequestFragment(boolean progressState) {
    return new ActionNavigationMapFragmentToProgressRequestFragment(progressState);
  }

  public static class ActionNavigationMapFragmentToProgressRequestFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionNavigationMapFragmentToProgressRequestFragment(boolean progressState) {
      this.arguments.put("progressState", progressState);
    }

    @NonNull
    public ActionNavigationMapFragmentToProgressRequestFragment setProgressState(boolean progressState) {
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
      return R.id.action_navigationMapFragment_to_progressRequestFragment;
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
      ActionNavigationMapFragmentToProgressRequestFragment that = (ActionNavigationMapFragmentToProgressRequestFragment) object;
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
      return "ActionNavigationMapFragmentToProgressRequestFragment(actionId=" + getActionId() + "){"
          + "progressState=" + getProgressState()
          + "}";
    }
  }
}
