package com.example.poli_gas.feedback;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.poli_gas.R;

public class FeedbackFragmentDirections {
  private FeedbackFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionFeedbackFragmentToHomeFragment() {
    return new ActionOnlyNavDirections(R.id.action_feedbackFragment_to_homeFragment);
  }
}
