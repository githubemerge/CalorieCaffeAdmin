package emerge.project.caloriecaffeadmin.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010/\u001a\u000200J\u000e\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR \u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001cR \u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001a\"\u0004\b\'\u0010\u001cR \u0010(\u001a\b\u0012\u0004\u0012\u00020\u00180\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010\u001cR \u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001c\u00a8\u00063"}, d2 = {"Lemerge/project/caloriecaffeadmin/viewModel/CompleteViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "apiInterface", "Lemarge/project/caloriecaffeadmin/network/api/APIInterface;", "getApiInterface", "()Lemarge/project/caloriecaffeadmin/network/api/APIInterface;", "setApiInterface", "(Lemarge/project/caloriecaffeadmin/network/api/APIInterface;)V", "cm", "Landroid/net/ConnectivityManager;", "getCm", "()Landroid/net/ConnectivityManager;", "setCm", "(Landroid/net/ConnectivityManager;)V", "contx", "Landroid/content/Context;", "getContx", "()Landroid/content/Context;", "setContx", "(Landroid/content/Context;)V", "dietComplteleList", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lemarge/project/caloriecaffe/model/DietRequest;", "getDietComplteleList", "()Landroidx/lifecycle/MutableLiveData;", "setDietComplteleList", "(Landroidx/lifecycle/MutableLiveData;)V", "dietUserHistoryList", "Lemerge/project/caloriecaffeadmin/model/UserHistory;", "getDietUserHistoryList", "setDietUserHistoryList", "getingDietPendingErorr", "", "getGetingDietPendingErorr", "setGetingDietPendingErorr", "getingUserHistoryErorr", "getGetingUserHistoryErorr", "setGetingUserHistoryErorr", "requestStatus", "getRequestStatus", "setRequestStatus", "showProgressbar", "", "getShowProgressbar", "setShowProgressbar", "getDietComplete", "", "setViewListener", "con", "app_release"})
public final class CompleteViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<emarge.project.caloriecaffe.model.DietRequest> requestStatus;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> getingDietPendingErorr;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showProgressbar;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<emarge.project.caloriecaffe.model.DietRequest>> dietComplteleList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<emerge.project.caloriecaffeadmin.model.UserHistory> dietUserHistoryList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> getingUserHistoryErorr;
    @org.jetbrains.annotations.Nullable()
    private emarge.project.caloriecaffeadmin.network.api.APIInterface apiInterface;
    @org.jetbrains.annotations.Nullable()
    private android.net.ConnectivityManager cm;
    @org.jetbrains.annotations.Nullable()
    private android.content.Context contx;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<emarge.project.caloriecaffe.model.DietRequest> getRequestStatus() {
        return null;
    }
    
    public final void setRequestStatus(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<emarge.project.caloriecaffe.model.DietRequest> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getGetingDietPendingErorr() {
        return null;
    }
    
    public final void setGetingDietPendingErorr(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowProgressbar() {
        return null;
    }
    
    public final void setShowProgressbar(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<emarge.project.caloriecaffe.model.DietRequest>> getDietComplteleList() {
        return null;
    }
    
    public final void setDietComplteleList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<emarge.project.caloriecaffe.model.DietRequest>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<emerge.project.caloriecaffeadmin.model.UserHistory> getDietUserHistoryList() {
        return null;
    }
    
    public final void setDietUserHistoryList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<emerge.project.caloriecaffeadmin.model.UserHistory> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getGetingUserHistoryErorr() {
        return null;
    }
    
    public final void setGetingUserHistoryErorr(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final emarge.project.caloriecaffeadmin.network.api.APIInterface getApiInterface() {
        return null;
    }
    
    public final void setApiInterface(@org.jetbrains.annotations.Nullable()
    emarge.project.caloriecaffeadmin.network.api.APIInterface p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.ConnectivityManager getCm() {
        return null;
    }
    
    public final void setCm(@org.jetbrains.annotations.Nullable()
    android.net.ConnectivityManager p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Context getContx() {
        return null;
    }
    
    public final void setContx(@org.jetbrains.annotations.Nullable()
    android.content.Context p0) {
    }
    
    public final void setViewListener(@org.jetbrains.annotations.NotNull()
    android.content.Context con) {
    }
    
    public final void getDietComplete() {
    }
    
    public CompleteViewModel() {
        super();
    }
}