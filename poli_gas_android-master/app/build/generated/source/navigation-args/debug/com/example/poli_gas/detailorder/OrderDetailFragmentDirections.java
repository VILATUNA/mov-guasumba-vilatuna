package com.example.poli_gas.detailorder;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.poli_gas.R;

public class OrderDetailFragmentDirections {
  private OrderDetailFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionOrderDetailFragmentToExpressOrderFragment() {
    return new ActionOnlyNavDirections(R.id.action_orderDetailFragment_to_expressOrderFragment);
  }
}
