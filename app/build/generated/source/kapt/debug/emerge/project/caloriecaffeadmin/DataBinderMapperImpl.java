package emerge.project.caloriecaffeadmin;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import emerge.project.caloriecaffeadmin.databinding.ActivityCodeBindingImpl;
import emerge.project.caloriecaffeadmin.databinding.ActivityCompleteBindingImpl;
import emerge.project.caloriecaffeadmin.databinding.ActivityPendingBindingImpl;
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
  private static final int LAYOUT_ACTIVITYCODE = 1;

  private static final int LAYOUT_ACTIVITYCOMPLETE = 2;

  private static final int LAYOUT_ACTIVITYPENDING = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(emerge.project.caloriecaffeadmin.R.layout.activity_code, LAYOUT_ACTIVITYCODE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(emerge.project.caloriecaffeadmin.R.layout.activity_complete, LAYOUT_ACTIVITYCOMPLETE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(emerge.project.caloriecaffeadmin.R.layout.activity_pending, LAYOUT_ACTIVITYPENDING);
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
        case  LAYOUT_ACTIVITYCODE: {
          if ("layout/activity_code_0".equals(tag)) {
            return new ActivityCodeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_code is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYCOMPLETE: {
          if ("layout/activity_complete_0".equals(tag)) {
            return new ActivityCompleteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_complete is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPENDING: {
          if ("layout/activity_pending_0".equals(tag)) {
            return new ActivityPendingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_pending is invalid. Received: " + tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "pending");
      sKeys.put(2, "complete");
      sKeys.put(3, "card");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/activity_code_0", emerge.project.caloriecaffeadmin.R.layout.activity_code);
      sKeys.put("layout/activity_complete_0", emerge.project.caloriecaffeadmin.R.layout.activity_complete);
      sKeys.put("layout/activity_pending_0", emerge.project.caloriecaffeadmin.R.layout.activity_pending);
    }
  }
}
