package com.example.poli_gas.detailorder;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.poli_gas.R;

public class SchedulerOrderDetailFragmentDirections {
  private SchedulerOrderDetailFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSchedulerOrderDetailFragmentToSchedulerOrderFragment() {
    return new ActionOnlyNavDirections(R.id.action_schedulerOrderDetailFragment_to_schedulerOrderFragment);
  }
}
