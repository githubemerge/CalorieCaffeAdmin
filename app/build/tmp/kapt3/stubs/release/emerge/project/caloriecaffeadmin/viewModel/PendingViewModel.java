package emerge.project.caloriecaffeadmin.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010=\u001a\u00020>J\u0006\u0010?\u001a\u00020>J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010A\u001a\u000201J\u000e\u0010B\u001a\u00020>2\u0006\u0010C\u001a\u00020\u0006J\u001f\u0010D\u001a\u00020>2\b\u0010E\u001a\u0004\u0018\u0001012\b\u0010F\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010GJ\u000e\u0010H\u001a\u00020>2\u0006\u0010I\u001a\u00020\u0014R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R&\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001d\"\u0004\b&\u0010\u001fR \u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u001fR\u001d\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050+8F\u00a2\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060/X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u00102\u001a\b\u0012\u0004\u0012\u0002030\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001d\"\u0004\b5\u0010\u001fR \u00106\u001a\b\u0012\u0004\u0012\u0002070\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001d\"\u0004\b9\u0010\u001fR \u0010:\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001d\"\u0004\b<\u0010\u001f\u00a8\u0006J"}, d2 = {"Lemerge/project/caloriecaffeadmin/viewModel/PendingViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_items", "Landroidx/lifecycle/MutableLiveData;", "", "", "apiInterface", "Lemarge/project/caloriecaffeadmin/network/api/APIInterface;", "getApiInterface", "()Lemarge/project/caloriecaffeadmin/network/api/APIInterface;", "setApiInterface", "(Lemarge/project/caloriecaffeadmin/network/api/APIInterface;)V", "cm", "Landroid/net/ConnectivityManager;", "getCm", "()Landroid/net/ConnectivityManager;", "setCm", "(Landroid/net/ConnectivityManager;)V", "contx", "Landroid/content/Context;", "getContx", "()Landroid/content/Context;", "setContx", "(Landroid/content/Context;)V", "dietPendingList", "Ljava/util/ArrayList;", "Lemarge/project/caloriecaffe/model/DietRequest;", "getDietPendingList", "()Landroidx/lifecycle/MutableLiveData;", "setDietPendingList", "(Landroidx/lifecycle/MutableLiveData;)V", "dietUserHistoryList", "Lemerge/project/caloriecaffeadmin/model/UserHistory;", "getDietUserHistoryList", "setDietUserHistoryList", "getingDietPendingErorr", "getGetingDietPendingErorr", "setGetingDietPendingErorr", "getingUserHistoryErorr", "getGetingUserHistoryErorr", "setGetingUserHistoryErorr", "items", "Landroidx/lifecycle/LiveData;", "getItems", "()Landroidx/lifecycle/LiveData;", "list", "", "nextItem", "", "requestStatus", "Lemarge/project/caloriecaffe/model/DietPlan;", "getRequestStatus", "setRequestStatus", "showProgressbar", "", "getShowProgressbar", "setShowProgressbar", "test", "getTest", "setTest", "fetchItems", "", "getDietPending", "getItemsPage", "pageSize", "getSelectedUserHistory", "userID", "sendDietPlanToServer", "requestID", "pdfurl", "(Ljava/lang/Integer;Ljava/lang/String;)V", "setViewListener", "con", "app_release"})
public final class PendingViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<emarge.project.caloriecaffe.model.DietPlan> requestStatus;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> getingDietPendingErorr;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showProgressbar;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<emarge.project.caloriecaffe.model.DietRequest>> dietPendingList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<emerge.project.caloriecaffeadmin.model.UserHistory> dietUserHistoryList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> getingUserHistoryErorr;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> test;
    @org.jetbrains.annotations.Nullable()
    private emarge.project.caloriecaffeadmin.network.api.APIInterface apiInterface;
    @org.jetbrains.annotations.Nullable()
    private android.net.ConnectivityManager cm;
    @org.jetbrains.annotations.Nullable()
    private android.content.Context contx;
    private final java.util.List<java.lang.String> list = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> _items = null;
    private int nextItem;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<emarge.project.caloriecaffe.model.DietPlan> getRequestStatus() {
        return null;
    }
    
    public final void setRequestStatus(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<emarge.project.caloriecaffe.model.DietPlan> p0) {
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
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<emarge.project.caloriecaffe.model.DietRequest>> getDietPendingList() {
        return null;
    }
    
    public final void setDietPendingList(@org.jetbrains.annotations.NotNull()
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
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getTest() {
        return null;
    }
    
    public final void setTest(@org.jetbrains.annotations.NotNull()
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
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<java.lang.String>> getItems() {
        return null;
    }
    
    public final void setViewListener(@org.jetbrains.annotations.NotNull()
    android.content.Context con) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getItemsPage(int pageSize) {
        return null;
    }
    
    public final void fetchItems() {
    }
    
    public final void getDietPending() {
    }
    
    public final void getSelectedUserHistory(@org.jetbrains.annotations.NotNull()
    java.lang.String userID) {
    }
    
    public final void sendDietPlanToServer(@org.jetbrains.annotations.Nullable()
    java.lang.Integer requestID, @org.jetbrains.annotations.Nullable()
    java.lang.String pdfurl) {
    }
    
    public PendingViewModel() {
        super();
    }
}