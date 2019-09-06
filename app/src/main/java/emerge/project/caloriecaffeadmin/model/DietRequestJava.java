package emerge.project.caloriecaffeadmin.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;



public class DietRequestJava implements Serializable {

    @SerializedName("userID")
    String userID;

    @SerializedName("dietPlanRequestID")
    int dietPlanRequestID;

    @SerializedName("age")
    int age;

    @SerializedName("weight")
    Double weight;

    @SerializedName("height")
    Double height;

    @SerializedName("waist")
    Double waist;

    @SerializedName("gender")
    String gender;

    @Expose
    @SerializedName("dietTypeName")
    String dietTypeName;

    @SerializedName("dateStamp")
    String dateStamp;

    @SerializedName("user")
    UserJava userJava;


    public DietRequestJava(String userID, int dietPlanRequestID, int age, Double weight, Double height, Double waist, String gender, String dietTypeName, String dateStamp, UserJava userJava) {
        this.userID = userID;
        this.dietPlanRequestID = dietPlanRequestID;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.waist = waist;
        this.gender = gender;
        this.dietTypeName = dietTypeName;
        this.dateStamp = dateStamp;
        this.userJava = userJava;

    }


    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public int getDietPlanRequestID() {
        return dietPlanRequestID;
    }

    public void setDietPlanRequestID(int dietPlanRequestID) {
        this.dietPlanRequestID = dietPlanRequestID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWaist() {
        return waist;
    }

    public void setWaist(Double waist) {
        this.waist = waist;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDietTypeName() {
        return dietTypeName;
    }

    public void setDietTypeName(String dietTypeName) {
        this.dietTypeName = dietTypeName;
    }

    public String getDateStamp() {
        return dateStamp;
    }

    public void setDateStamp(String dateStamp) {
        this.dateStamp = dateStamp;
    }

    public UserJava getUserJava() {
        return userJava;
    }

    public void setUserJava(UserJava userJava) {
        this.userJava = userJava;
    }


}
