package com.example.poli_gas;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.poli_gas.databinding.FragmentAccountBindingImpl;
import com.example.poli_gas.databinding.FragmentAuthUserBindingImpl;
import com.example.poli_gas.databinding.FragmentExpressOrderBindingImpl;
import com.example.poli_gas.databinding.FragmentFeedbackBindingImpl;
import com.example.poli_gas.databinding.FragmentHomeBindingImpl;
import com.example.poli_gas.databinding.FragmentInfoUserBindingImpl;
import com.example.poli_gas.databinding.FragmentMapBindingImpl;
import com.example.poli_gas.databinding.FragmentNavigationMapBindingImpl;
import com.example.poli_gas.databinding.FragmentOrderDetailBindingImpl;
import com.example.poli_gas.databinding.FragmentProgressRequestBindingImpl;
import com.example.poli_gas.databinding.FragmentScheduleRequestBindingImpl;
import com.example.poli_gas.databinding.FragmentSchedulerOrderBindingImpl;
import com.example.poli_gas.databinding.FragmentSchedulerOrderDetailBindingImpl;
import com.example.poli_gas.databinding.FragmentSettingsBindingImpl;
import com.example.poli_gas.databinding.FragmentTypeRequestBindingImpl;
import com.example.poli_gas.databinding.FragmentWelcomeBindingImpl;
import com.example.poli_gas.databinding.ListItemPoligasExpressBindingImpl;
import com.example.poli_gas.databinding.ListItemPoligasSchedulerBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTWELCOME = 1;

  private static final int LAYOUT_FRAGMENTACCOUNT = 2;

  private static final int LAYOUT_FRAGMENTAUTHUSER = 3;

  private static final int LAYOUT_FRAGMENTEXPRESSORDER = 4;

  private static final int LAYOUT_FRAGMENTFEEDBACK = 5;

  private static final int LAYOUT_FRAGMENTHOME = 6;

  private static final int LAYOUT_FRAGMENTINFOUSER = 7;

  private static final int LAYOUT_FRAGMENTMAP = 8;

  private static final int LAYOUT_FRAGMENTNAVIGATIONMAP = 9;

  private static final int LAYOUT_FRAGMENTORDERDETAIL = 10;

  private static final int LAYOUT_FRAGMENTPROGRESSREQUEST = 11;

  private static final int LAYOUT_FRAGMENTSCHEDULEREQUEST = 12;

  private static final int LAYOUT_FRAGMENTSCHEDULERORDER = 13;

  private static final int LAYOUT_FRAGMENTSCHEDULERORDERDETAIL = 14;

  private static final int LAYOUT_FRAGMENTSETTINGS = 15;

  private static final int LAYOUT_FRAGMENTTYPEREQUEST = 16;

  private static final int LAYOUT_LISTITEMPOLIGASEXPRESS = 17;

  private static final int LAYOUT_LISTITEMPOLIGASSCHEDULER = 18;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(18);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.poli_gas.R.layout.fragment__welcome, LAYOUT_FRAGMENTWELCOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.poli_gas.R.layout.fragment_account, LAYOUT_FRAGMENTACCOUNT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.poli_gas.R.layout.fragment_auth_user, LAYOUT_FRAGMENTAUTHUSER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.poli_gas.R.layout.fragment_express_order, LAYOUT_FRAGMENTEXPRESSORDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.poli_gas.R.layout.fragment_feedback, LAYOUT_FRAGMENTFEEDBACK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.poli_gas.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.poli_gas.R.layout.fragment_info_user, LAYOUT_FRAGMENTINFOUSER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.poli_gas.R.layout.fragment_map, LAYOUT_FRAGMENTMAP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.poli_gas.R.layout.fragment_navigation_map, LAYOUT_FRAGMENTNAVIGATIONMAP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.poli_gas.R.layout.fragment_order_detail, LAYOUT_FRAGMENTORDERDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.poli_gas.R.layout.fragment_progress_request, LAYOUT_FRAGMENTPROGRESSREQUEST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.poli_gas.R.layout.fragment_schedule_request, LAYOUT_FRAGMENTSCHEDULEREQUEST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.poli_gas.R.layout.fragment_scheduler_order, LAYOUT_FRAGMENTSCHEDULERORDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.poli_gas.R.layout.fragment_scheduler_order_detail, LAYOUT_FRAGMENTSCHEDULERORDERDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.poli_gas.R.layout.fragment_settings, LAYOUT_FRAGMENTSETTINGS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.poli_gas.R.layout.fragment_type_request, LAYOUT_FRAGMENTTYPEREQUEST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.poli_gas.R.layout.list_item_poligas_express, LAYOUT_LISTITEMPOLIGASEXPRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.poli_gas.R.layout.list_item_poligas_scheduler, LAYOUT_LISTITEMPOLIGASSCHEDULER);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTWELCOME: {
          if ("layout/fragment__welcome_0".equals(tag)) {
            return new FragmentWelcomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment__welcome is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTACCOUNT: {
          if ("layout/fragment_account_0".equals(tag)) {
            return new FragmentAccountBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_account is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTAUTHUSER: {
          if ("layout/fragment_auth_user_0".equals(tag)) {
            return new FragmentAuthUserBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_auth_user is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEXPRESSORDER: {
          if ("layout/fragment_express_order_0".equals(tag)) {
            return new FragmentExpressOrderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_express_order is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFEEDBACK: {
          if ("layout/fragment_feedback_0".equals(tag)) {
            return new FragmentFeedbackBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_feedback is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTINFOUSER: {
          if ("layout/fragment_info_user_0".equals(tag)) {
            return new FragmentInfoUserBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_info_user is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMAP: {
          if ("layout/fragment_map_0".equals(tag)) {
            return new FragmentMapBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_map is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNAVIGATIONMAP: {
          if ("layout/fragment_navigation_map_0".equals(tag)) {
            return new FragmentNavigationMapBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_navigation_map is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTORDERDETAIL: {
          if ("layout/fragment_order_detail_0".equals(tag)) {
            return new FragmentOrderDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_order_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROGRESSREQUEST: {
          if ("layout/fragment_progress_request_0".equals(tag)) {
            return new FragmentProgressRequestBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_progress_request is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSCHEDULEREQUEST: {
          if ("layout/fragment_schedule_request_0".equals(tag)) {
            return new FragmentScheduleRequestBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_schedule_request is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSCHEDULERORDER: {
          if ("layout/fragment_scheduler_order_0".equals(tag)) {
            return new FragmentSchedulerOrderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_scheduler_order is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSCHEDULERORDERDETAIL: {
          if ("layout/fragment_scheduler_order_detail_0".equals(tag)) {
            return new FragmentSchedulerOrderDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_scheduler_order_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSETTINGS: {
          if ("layout/fragment_settings_0".equals(tag)) {
            return new FragmentSettingsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_settings is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTYPEREQUEST: {
          if ("layout/fragment_type_request_0".equals(tag)) {
            return new FragmentTypeRequestBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_type_request is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMPOLIGASEXPRESS: {
          if ("layout/list_item_poligas_express_0".equals(tag)) {
            return new ListItemPoligasExpressBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_poligas_express is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMPOLIGASSCHEDULER: {
          if ("layout/list_item_poligas_scheduler_0".equals(tag)) {
            return new ListItemPoligasSchedulerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_poligas_scheduler is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(8);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "expressOrderViewModel");
      sKeys.put(2, "orderDetail");
      sKeys.put(3, "poligas");
      sKeys.put(4, "schedulerOrderViewModel");
      sKeys.put(5, "clickListener");
      sKeys.put(6, "homeViewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(18);

    static {
      sKeys.put("layout/fragment__welcome_0", com.example.poli_gas.R.layout.fragment__welcome);
      sKeys.put("layout/fragment_account_0", com.example.poli_gas.R.layout.fragment_account);
      sKeys.put("layout/fragment_auth_user_0", com.example.poli_gas.R.layout.fragment_auth_user);
      sKeys.put("layout/fragment_express_order_0", com.example.poli_gas.R.layout.fragment_express_order);
      sKeys.put("layout/fragment_feedback_0", com.example.poli_gas.R.layout.fragment_feedback);
      sKeys.put("layout/fragment_home_0", com.example.poli_gas.R.layout.fragment_home);
      sKeys.put("layout/fragment_info_user_0", com.example.poli_gas.R.layout.fragment_info_user);
      sKeys.put("layout/fragment_map_0", com.example.poli_gas.R.layout.fragment_map);
      sKeys.put("layout/fragment_navigation_map_0", com.example.poli_gas.R.layout.fragment_navigation_map);
      sKeys.put("layout/fragment_order_detail_0", com.example.poli_gas.R.layout.fragment_order_detail);
      sKeys.put("layout/fragment_progress_request_0", com.example.poli_gas.R.layout.fragment_progress_request);
      sKeys.put("layout/fragment_schedule_request_0", com.example.poli_gas.R.layout.fragment_schedule_request);
      sKeys.put("layout/fragment_scheduler_order_0", com.example.poli_gas.R.layout.fragment_scheduler_order);
      sKeys.put("layout/fragment_scheduler_order_detail_0", com.example.poli_gas.R.layout.fragment_scheduler_order_detail);
      sKeys.put("layout/fragment_settings_0", com.example.poli_gas.R.layout.fragment_settings);
      sKeys.put("layout/fragment_type_request_0", com.example.poli_gas.R.layout.fragment_type_request);
      sKeys.put("layout/list_item_poligas_express_0", com.example.poli_gas.R.layout.list_item_poligas_express);
      sKeys.put("layout/list_item_poligas_scheduler_0", com.example.poli_gas.R.layout.list_item_poligas_scheduler);
    }
  }
}
