package emarge.project.caloriecaffe.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR \u0010#\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\"\u0010)\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\bR \u0010,\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\r\"\u0004\b.\u0010\u000fR \u0010/\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\r\"\u0004\b1\u0010\u000fR\"\u00102\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00108\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001e\u00109\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001d\"\u0004\b:\u0010\u001fR\"\u0010;\u001a\u0004\u0018\u00010<8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010A\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R \u0010B\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\r\"\u0004\bD\u0010\u000fR\"\u0010E\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00108\u001a\u0004\bF\u00105\"\u0004\bG\u00107R\"\u0010H\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00108\u001a\u0004\bI\u00105\"\u0004\bJ\u00107\u00a8\u0006K"}, d2 = {"Lemarge/project/caloriecaffe/model/DietRequestHistory;", "Ljava/io/Serializable;", "()V", "age", "", "getAge", "()Ljava/lang/Integer;", "setAge", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "dateStamp", "", "getDateStamp", "()Ljava/lang/String;", "setDateStamp", "(Ljava/lang/String;)V", "dietPlanList", "Ljava/util/ArrayList;", "Lemarge/project/caloriecaffe/model/DietPlan;", "getDietPlanList", "()Ljava/util/ArrayList;", "setDietPlanList", "(Ljava/util/ArrayList;)V", "dietPlanRequestID", "getDietPlanRequestID", "setDietPlanRequestID", "dietPlanRequestStatus", "", "getDietPlanRequestStatus", "()Z", "setDietPlanRequestStatus", "(Z)V", "dietPlanStatus", "getDietPlanStatus", "setDietPlanStatus", "dietRequestError", "Lemarge/project/caloriecaffe/model/Error;", "getDietRequestError", "()Lemarge/project/caloriecaffe/model/Error;", "setDietRequestError", "(Lemarge/project/caloriecaffe/model/Error;)V", "dietTypeID", "getDietTypeID", "setDietTypeID", "dietTypeName", "getDietTypeName", "setDietTypeName", "gender", "getGender", "setGender", "height", "", "getHeight", "()Ljava/lang/Double;", "setHeight", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "isDietPlanSubmitted", "setDietPlanSubmitted", "paymentCardID", "", "getPaymentCardID", "()Ljava/lang/Long;", "setPaymentCardID", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "userID", "getUserID", "setUserID", "waist", "getWaist", "setWaist", "weight", "getWeight", "setWeight", "app_release"})
public final class DietRequestHistory implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "userID")
    private java.lang.String userID;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "dietPlanRequestID")
    private java.lang.Integer dietPlanRequestID;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "age")
    private java.lang.Integer age;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "weight")
    private java.lang.Double weight;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "height")
    private java.lang.Double height;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "waist")
    private java.lang.Double waist;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "gender")
    private java.lang.String gender;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "paymentCardID")
    private java.lang.Long paymentCardID;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "dietTypeID")
    private java.lang.Integer dietTypeID;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "dietTypeName")
    private java.lang.String dietTypeName;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "dateStamp")
    private java.lang.String dateStamp;
    @com.google.gson.annotations.SerializedName(value = "dietPlanRequestStatus")
    private boolean dietPlanRequestStatus;
    @com.google.gson.annotations.SerializedName(value = "isDietPlanSubmitted")
    private boolean isDietPlanSubmitted;
    @com.google.gson.annotations.SerializedName(value = "dietPlanStatus")
    private boolean dietPlanStatus;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "error")
    private emarge.project.caloriecaffe.model.Error dietRequestError;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "dietPlanList")
    private java.util.ArrayList<emarge.project.caloriecaffe.model.DietPlan> dietPlanList;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserID() {
        return null;
    }
    
    public final void setUserID(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDietPlanRequestID() {
        return null;
    }
    
    public final void setDietPlanRequestID(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getAge() {
        return null;
    }
    
    public final void setAge(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getWeight() {
        return null;
    }
    
    public final void setWeight(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getHeight() {
        return null;
    }
    
    public final void setHeight(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getWaist() {
        return null;
    }
    
    public final void setWaist(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGender() {
        return null;
    }
    
    public final void setGender(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getPaymentCardID() {
        return null;
    }
    
    public final void setPaymentCardID(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDietTypeID() {
        return null;
    }
    
    public final void setDietTypeID(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDietTypeName() {
        return null;
    }
    
    public final void setDietTypeName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDateStamp() {
        return null;
    }
    
    public final void setDateStamp(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getDietPlanRequestStatus() {
        return false;
    }
    
    public final void setDietPlanRequestStatus(boolean p0) {
    }
    
    public final boolean isDietPlanSubmitted() {
        return false;
    }
    
    public final void setDietPlanSubmitted(boolean p0) {
    }
    
    public final boolean getDietPlanStatus() {
        return false;
    }
    
    public final void setDietPlanStatus(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final emarge.project.caloriecaffe.model.Error getDietRequestError() {
        return null;
    }
    
    public final void setDietRequestError(@org.jetbrains.annotations.Nullable()
    emarge.project.caloriecaffe.model.Error p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<emarge.project.caloriecaffe.model.DietPlan> getDietPlanList() {
        return null;
    }
    
    public final void setDietPlanList(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<emarge.project.caloriecaffe.model.DietPlan> p0) {
    }
    
    public DietRequestHistory() {
        super();
    }
}