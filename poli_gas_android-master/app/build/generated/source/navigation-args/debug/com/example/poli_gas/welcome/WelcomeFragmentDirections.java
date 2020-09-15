package com.example.poli_gas.welcome;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.poli_gas.R;

public class WelcomeFragmentDirections {
  private WelcomeFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionStartFragmentToAuthUserFragment() {
    return new ActionOnlyNavDirections(R.id.action_startFragment_to_authUserFragment);
  }
}
