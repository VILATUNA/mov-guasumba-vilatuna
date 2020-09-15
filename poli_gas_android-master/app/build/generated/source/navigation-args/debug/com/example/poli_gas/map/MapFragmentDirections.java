package com.example.poli_gas.map;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.poli_gas.R;

public class MapFragmentDirections {
  private MapFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionMapFragmentToHomeFragment() {
    return new ActionOnlyNavDirections(R.id.action_mapFragment_to_homeFragment);
  }
}
