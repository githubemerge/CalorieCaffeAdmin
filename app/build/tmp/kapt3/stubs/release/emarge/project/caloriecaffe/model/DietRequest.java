package emarge.project.caloriecaffe.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u008d\u0001\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0016R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR&\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010\u001aR \u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001d\"\u0004\b\'\u0010\u001fR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u001fR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010.\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R \u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001d\"\u0004\b0\u0010\u001fR \u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001d\"\u0004\b2\u0010\u001fR\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001d\"\u0004\b8\u0010\u001fR\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010.\u001a\u0004\b9\u0010+\"\u0004\b:\u0010-R\"\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010.\u001a\u0004\b;\u0010+\"\u0004\b<\u0010-\u00a8\u0006="}, d2 = {"Lemarge/project/caloriecaffe/model/DietRequest;", "Ljava/io/Serializable;", "()V", "userID", "", "dietPlanRequestID", "", "age", "weight", "", "height", "waist", "gender", "dietTypeName", "dateStamp", "dietPlan", "Ljava/util/ArrayList;", "Lemarge/project/caloriecaffe/model/DietPlan;", "user", "Lemerge/project/caloriecaffeadmin/model/User;", "paymentCardCode", "paymentCardSerialNumber", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lemerge/project/caloriecaffeadmin/model/User;Ljava/lang/String;Ljava/lang/String;)V", "getAge", "()Ljava/lang/Integer;", "setAge", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDateStamp", "()Ljava/lang/String;", "setDateStamp", "(Ljava/lang/String;)V", "getDietPlan", "()Ljava/util/ArrayList;", "setDietPlan", "(Ljava/util/ArrayList;)V", "getDietPlanRequestID", "setDietPlanRequestID", "getDietTypeName", "setDietTypeName", "getGender", "setGender", "getHeight", "()Ljava/lang/Double;", "setHeight", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getPaymentCardCode", "setPaymentCardCode", "getPaymentCardSerialNumber", "setPaymentCardSerialNumber", "getUser", "()Lemerge/project/caloriecaffeadmin/model/User;", "setUser", "(Lemerge/project/caloriecaffeadmin/model/User;)V", "getUserID", "setUserID", "getWaist", "setWaist", "getWeight", "setWeight", "app_release"})
public final class DietRequest implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "userID")
    @com.google.gson.annotations.Expose()
    private java.lang.String userID;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "dietPlanRequestID")
    @com.google.gson.annotations.Expose()
    private java.lang.Integer dietPlanRequestID;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "age")
    @com.google.gson.annotations.Expose()
    private java.lang.Integer age;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "weight")
    @com.google.gson.annotations.Expose()
    private java.lang.Double weight;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "height")
    @com.google.gson.annotations.Expose()
    private java.lang.Double height;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "waist")
    @com.google.gson.annotations.Expose()
    private java.lang.Double waist;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "gender")
    @com.google.gson.annotations.Expose()
    private java.lang.String gender;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "dietTypeName")
    @com.google.gson.annotations.Expose()
    private java.lang.String dietTypeName;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "dateStamp")
    @com.google.gson.annotations.Expose()
    private java.lang.String dateStamp;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "dietPlanList")
    @com.google.gson.annotations.Expose()
    private java.util.ArrayList<emarge.project.caloriecaffe.model.DietPlan> dietPlan;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "user")
    @com.google.gson.annotations.Expose()
    public emerge.project.caloriecaffeadmin.model.User user;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "paymentCardCode")
    @com.google.gson.annotations.Expose()
    private java.lang.String paymentCardCode;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "paymentCardSerialNumber")
    @com.google.gson.annotations.Expose()
    private java.lang.String paymentCardSerialNumber;
    
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<emarge.project.caloriecaffe.model.DietPlan> getDietPlan() {
        return null;
    }
    
    public final void setDietPlan(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<emarge.project.caloriecaffe.model.DietPlan> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final emerge.project.caloriecaffeadmin.model.User getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull()
    emerge.project.caloriecaffeadmin.model.User p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPaymentCardCode() {
        return null;
    }
    
    public final void setPaymentCardCode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPaymentCardSerialNumber() {
        return null;
    }
    
    public final void setPaymentCardSerialNumber(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public DietRequest() {
        super();
    }
    
    public DietRequest(@org.jetbrains.annotations.Nullable()
    java.lang.String userID, @org.jetbrains.annotations.Nullable()
    java.lang.Integer dietPlanRequestID, @org.jetbrains.annotations.Nullable()
    java.lang.Integer age, @org.jetbrains.annotations.Nullable()
    java.lang.Double weight, @org.jetbrains.annotations.Nullable()
    java.lang.Double height, @org.jetbrains.annotations.Nullable()
    java.lang.Double waist, @org.jetbrains.annotations.Nullable()
    java.lang.String gender, @org.jetbrains.annotations.Nullable()
    java.lang.String dietTypeName, @org.jetbrains.annotations.Nullable()
    java.lang.String dateStamp, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<emarge.project.caloriecaffe.model.DietPlan> dietPlan, @org.jetbrains.annotations.NotNull()
    emerge.project.caloriecaffeadmin.model.User user, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentCardCode, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentCardSerialNumber) {
        super();
    }
}