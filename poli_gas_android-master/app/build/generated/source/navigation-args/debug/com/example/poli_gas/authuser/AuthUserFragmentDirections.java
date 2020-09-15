package com.example.poli_gas.authuser;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.poli_gas.R;

public class AuthUserFragmentDirections {
  private AuthUserFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionAuthUserFragmentToMapFragment() {
    return new ActionOnlyNavDirections(R.id.action_authUserFragment_to_mapFragment);
  }
}
