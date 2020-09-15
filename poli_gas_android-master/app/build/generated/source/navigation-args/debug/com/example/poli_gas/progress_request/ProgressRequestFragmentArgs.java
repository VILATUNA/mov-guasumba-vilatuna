package com.example.poli_gas.progress_request;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ProgressRequestFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ProgressRequestFragmentArgs() {
  }

  private ProgressRequestFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ProgressRequestFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ProgressRequestFragmentArgs __result = new ProgressRequestFragmentArgs();
    bundle.setClassLoader(ProgressRequestFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("progressState")) {
      boolean progressState;
      progressState = bundle.getBoolean("progressState");
      __result.arguments.put("progressState", progressState);
    } else {
      throw new IllegalArgumentException("Required argument \"progressState\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public boolean getProgressState() {
    return (boolean) arguments.get("progressState");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("progressState")) {
      boolean progressState = (boolean) arguments.get("progressState");
      __result.putBoolean("progressState", progressState);
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
    ProgressRequestFragmentArgs that = (ProgressRequestFragmentArgs) object;
    if (arguments.containsKey("progressState") != that.arguments.containsKey("progressState")) {
      return false;
    }
    if (getProgressState() != that.getProgressState()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getProgressState() ? 1 : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ProgressRequestFragmentArgs{"
        + "progressState=" + getProgressState()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(ProgressRequestFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(boolean progressState) {
      this.arguments.put("progressState", progressState);
    }

    @NonNull
    public ProgressRequestFragmentArgs build() {
      ProgressRequestFragmentArgs result = new ProgressRequestFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setProgressState(boolean progressState) {
      this.arguments.put("progressState", progressState);
      return this;
    }

    @SuppressWarnings("unchecked")
    public boolean getProgressState() {
      return (boolean) arguments.get("progressState");
    }
  }
}
