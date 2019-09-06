package emerge.project.caloriecaffeadmin.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R \u0010\u001a\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R \u0010\u001d\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016\u00a8\u0006 "}, d2 = {"Lemerge/project/caloriecaffeadmin/model/UserHistory;", "Ljava/io/Serializable;", "()V", "dietRequestHistory", "Ljava/util/ArrayList;", "Lemarge/project/caloriecaffe/model/DietRequestHistory;", "getDietRequestHistory", "()Ljava/util/ArrayList;", "setDietRequestHistory", "(Ljava/util/ArrayList;)V", "dietUserHistoryError", "Ljava/lang/Error;", "Lkotlin/Error;", "getDietUserHistoryError", "()Ljava/lang/Error;", "setDietUserHistoryError", "(Ljava/lang/Error;)V", "email", "", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "fullName", "getFullName", "setFullName", "nic", "getNic", "setNic", "userID", "getUserID", "setUserID", "app_release"})
public final class UserHistory implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "userID")
    private java.lang.String userID;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "nic")
    private java.lang.String nic;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "fullName")
    private java.lang.String fullName;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "email")
    private java.lang.String email;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "dietPlanRequest")
    private java.util.ArrayList<emarge.project.caloriecaffe.model.DietRequestHistory> dietRequestHistory;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "error")
    private java.lang.Error dietUserHistoryError;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserID() {
        return null;
    }
    
    public final void setUserID(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNic() {
        return null;
    }
    
    public final void setNic(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFullName() {
        return null;
    }
    
    public final void setFullName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<emarge.project.caloriecaffe.model.DietRequestHistory> getDietRequestHistory() {
        return null;
    }
    
    public final void setDietRequestHistory(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<emarge.project.caloriecaffe.model.DietRequestHistory> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Error getDietUserHistoryError() {
        return null;
    }
    
    public final void setDietUserHistoryError(@org.jetbrains.annotations.Nullable()
    java.lang.Error p0) {
    }
    
    public UserHistory() {
        super();
    }
}