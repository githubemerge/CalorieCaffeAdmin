package emarge.project.caloriecaffe.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001BA\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bR \u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u0015R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR \u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001a\u00a8\u0006%"}, d2 = {"Lemarge/project/caloriecaffe/model/DietPlan;", "Ljava/io/Serializable;", "dietPlanID", "", "dietPlanRequestID", "dietPlanImage", "", "submitDate", "expiryDate", "dietPlanStatus", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "dietPlanError", "Lemarge/project/caloriecaffe/model/Error;", "getDietPlanError", "()Lemarge/project/caloriecaffe/model/Error;", "setDietPlanError", "(Lemarge/project/caloriecaffe/model/Error;)V", "getDietPlanID", "()Ljava/lang/Integer;", "setDietPlanID", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDietPlanImage", "()Ljava/lang/String;", "setDietPlanImage", "(Ljava/lang/String;)V", "getDietPlanRequestID", "setDietPlanRequestID", "getDietPlanStatus", "()Z", "setDietPlanStatus", "(Z)V", "getExpiryDate", "setExpiryDate", "getSubmitDate", "setSubmitDate", "app_debug"})
public final class DietPlan implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "dietPlanID")
    private java.lang.Integer dietPlanID;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "dietPlanRequestID")
    private java.lang.Integer dietPlanRequestID;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "dietPlanUrl")
    private java.lang.String dietPlanImage;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "submitDate")
    private java.lang.String submitDate;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "expiryDate")
    private java.lang.String expiryDate;
    @com.google.gson.annotations.SerializedName(value = "dietPlanStatus")
    private boolean dietPlanStatus;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "error")
    private emarge.project.caloriecaffe.model.Error dietPlanError;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDietPlanID() {
        return null;
    }
    
    public final void setDietPlanID(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDietPlanRequestID() {
        return null;
    }
    
    public final void setDietPlanRequestID(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDietPlanImage() {
        return null;
    }
    
    public final void setDietPlanImage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubmitDate() {
        return null;
    }
    
    public final void setSubmitDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getExpiryDate() {
        return null;
    }
    
    public final void setExpiryDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getDietPlanStatus() {
        return false;
    }
    
    public final void setDietPlanStatus(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final emarge.project.caloriecaffe.model.Error getDietPlanError() {
        return null;
    }
    
    public final void setDietPlanError(@org.jetbrains.annotations.Nullable()
    emarge.project.caloriecaffe.model.Error p0) {
    }
    
    public DietPlan(@org.jetbrains.annotations.Nullable()
    java.lang.Integer dietPlanID, @org.jetbrains.annotations.Nullable()
    java.lang.Integer dietPlanRequestID, @org.jetbrains.annotations.Nullable()
    java.lang.String dietPlanImage, @org.jetbrains.annotations.Nullable()
    java.lang.String submitDate, @org.jetbrains.annotations.Nullable()
    java.lang.String expiryDate, boolean dietPlanStatus) {
        super();
    }
}