package emerge.project.caloriecaffeadmin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import emerge.project.caloriecaffeadmin.viewModel.CardViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityCodeBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout AppBarLayout;

  @NonNull
  public final BottomNavigationView bottomNavigationView;

  @NonNull
  public final ProgressBar progressBarCard;

  @NonNull
  public final RecyclerView recyclerviewCard;

  @NonNull
  public final TextView textView3;

  @Bindable
  protected CardViewModel mCard;

  protected ActivityCodeBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppBarLayout AppBarLayout, BottomNavigationView bottomNavigationView,
      ProgressBar progressBarCard, RecyclerView recyclerviewCard, TextView textView3) {
    super(_bindingComponent, _root, _localFieldCount);
    this.AppBarLayout = AppBarLayout;
    this.bottomNavigationView = bottomNavigationView;
    this.progressBarCard = progressBarCard;
    this.recyclerviewCard = recyclerviewCard;
    this.textView3 = textView3;
  }

  public abstract void setCard(@Nullable CardViewModel card);

  @Nullable
  public CardViewModel getCard() {
    return mCard;
  }

  @NonNull
  public static ActivityCodeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_code, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityCodeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityCodeBinding>inflateInternal(inflater, emerge.project.caloriecaffeadmin.R.layout.activity_code, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityCodeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_code, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityCodeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityCodeBinding>inflateInternal(inflater, emerge.project.caloriecaffeadmin.R.layout.activity_code, null, false, component);
  }

  public static ActivityCodeBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityCodeBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityCodeBinding)bind(component, view, emerge.project.caloriecaffeadmin.R.layout.activity_code);
  }
}
