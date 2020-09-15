package com.example.poli_gas.expressorder;

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

public class ExpressOrderFragmentDirections {
  private ExpressOrderFragmentDirections() {
  }

  @NonNull
  public static ActionExpressOrderFragmentToOrderDetailFragment actionExpressOrderFragmentToOrderDetailFragment(@NonNull String orderId) {
    return new ActionExpressOrderFragmentToOrderDetailFragment(orderId);
  }

  public static class ActionExpressOrderFragmentToOrderDetailFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionExpressOrderFragmentToOrderDetailFragment(@NonNull String orderId) {
      if (orderId == null) {
        throw new IllegalArgumentException("Argument \"orderId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("orderId", orderId);
    }

    @NonNull
    public ActionExpressOrderFragmentToOrderDetailFragment setOrderId(@NonNull String orderId) {
      if (orderId == null) {
        throw new IllegalArgumentException("Argument \"orderId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("orderId", orderId);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("orderId")) {
        String orderId = (String) arguments.get("orderId");
        __result.putString("orderId", orderId);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_expressOrderFragment_to_orderDetailFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getOrderId() {
      return (String) arguments.get("orderId");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionExpressOrderFragmentToOrderDetailFragment that = (ActionExpressOrderFragmentToOrderDetailFragment) object;
      if (arguments.containsKey("orderId") != that.arguments.containsKey("orderId")) {
        return false;
      }
      if (getOrderId() != null ? !getOrderId().equals(that.getOrderId()) : that.getOrderId() != null) {
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
      result = 31 * result + (getOrderId() != null ? getOrderId().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionExpressOrderFragmentToOrderDetailFragment(actionId=" + getActionId() + "){"
          + "orderId=" + getOrderId()
          + "}";
    }
  }
}
