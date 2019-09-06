package emerge.project.caloriecaffeadmin.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010%\u001a\u00020&J\u000e\u0010\'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0018R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010R \u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000e\"\u0004\b$\u0010\u0010\u00a8\u0006)"}, d2 = {"Lemerge/project/caloriecaffeadmin/viewModel/CardViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "apiInterface", "Lemarge/project/caloriecaffeadmin/network/api/APIInterface;", "getApiInterface", "()Lemarge/project/caloriecaffeadmin/network/api/APIInterface;", "setApiInterface", "(Lemarge/project/caloriecaffeadmin/network/api/APIInterface;)V", "cardList", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lemarge/project/caloriecaffe/model/DietCard;", "getCardList", "()Landroidx/lifecycle/MutableLiveData;", "setCardList", "(Landroidx/lifecycle/MutableLiveData;)V", "cm", "Landroid/net/ConnectivityManager;", "getCm", "()Landroid/net/ConnectivityManager;", "setCm", "(Landroid/net/ConnectivityManager;)V", "contx", "Landroid/content/Context;", "getContx", "()Landroid/content/Context;", "setContx", "(Landroid/content/Context;)V", "getingCardErorr", "", "getGetingCardErorr", "setGetingCardErorr", "showProgressbar", "", "getShowProgressbar", "setShowProgressbar", "getCardDetails", "", "setViewListener", "con", "app_release"})
public final class CardViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showProgressbar;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> getingCardErorr;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<emarge.project.caloriecaffe.model.DietCard>> cardList;
    @org.jetbrains.annotations.Nullable()
    private emarge.project.caloriecaffeadmin.network.api.APIInterface apiInterface;
    @org.jetbrains.annotations.Nullable()
    private android.net.ConnectivityManager cm;
    @org.jetbrains.annotations.Nullable()
    private android.content.Context contx;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowProgressbar() {
        return null;
    }
    
    public final void setShowProgressbar(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getGetingCardErorr() {
        return null;
    }
    
    public final void setGetingCardErorr(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<emarge.project.caloriecaffe.model.DietCard>> getCardList() {
        return null;
    }
    
    public final void setCardList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<emarge.project.caloriecaffe.model.DietCard>> p0) {
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
    
    public final void getCardDetails() {
    }
    
    public CardViewModel() {
        super();
    }
}