package emarge.project.caloriecaffeadmin.network.api;

import java.lang.System;

/**
 * * Created by kamal on 8/2/18.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u0006H\'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\'\u00a8\u0006\u0010"}, d2 = {"Lemarge/project/caloriecaffeadmin/network/api/APIInterface;", "", "getCurrentPlanForUser", "Lio/reactivex/Observable;", "Lcom/google/gson/JsonArray;", "token", "", "getPaymentCardDetails", "getSubmittedDietPlanRequests", "getUserHistoryDetails", "Lemerge/project/caloriecaffeadmin/model/UserHistory;", "userID", "saveDietPlan", "Lemarge/project/caloriecaffe/model/DietPlan;", "dietInfo", "Lcom/google/gson/JsonObject;", "app_debug"})
public abstract interface APIInterface {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "DietPlan/GetPendingDietPlanRequests")
    public abstract io.reactivex.Observable<com.google.gson.JsonArray> getCurrentPlanForUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "tokenID")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "DietPlan/SaveDietPlan")
    public abstract io.reactivex.Observable<emarge.project.caloriecaffe.model.DietPlan> saveDietPlan(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.google.gson.JsonObject dietInfo);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "DietPlan/GetSubmittedDietPlanRequests")
    public abstract io.reactivex.Observable<com.google.gson.JsonArray> getSubmittedDietPlanRequests(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "tokenID")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "User/GetUserDetailsByID")
    public abstract io.reactivex.Observable<emerge.project.caloriecaffeadmin.model.UserHistory> getUserHistoryDetails(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "userID")
    java.lang.String userID);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "DietPlan/GetPaymentCardDetails")
    public abstract io.reactivex.Observable<com.google.gson.JsonArray> getPaymentCardDetails(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "tokenID")
    java.lang.String token);
}