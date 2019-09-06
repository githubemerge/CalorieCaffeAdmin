package emarge.project.caloriecaffe.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import emerge.project.caloriecaffeadmin.model.User
import java.io.Serializable
import java.util.ArrayList

class DietRequest : Serializable {


    @Expose
    @SerializedName("userID")
    var userID: String? = null


    @Expose
    @SerializedName("dietPlanRequestID")
    var dietPlanRequestID: Int? = null


    @Expose
    @SerializedName("age")
    var age: Int? = null


    @Expose
    @SerializedName("weight")
    var weight: Double? = null


    @Expose
    @SerializedName("height")
    var height: Double? = null

    @Expose
    @SerializedName("waist")
    var waist: Double? = null


    @Expose
    @SerializedName("gender")
    var gender: String? = null


    @Expose
    @SerializedName("dietTypeName")
    var dietTypeName: String? = null


    @Expose
    @SerializedName("dateStamp")
    var dateStamp: String? = null

    @Expose
    @SerializedName("dietPlanList")
    var dietPlan: ArrayList<DietPlan>? = null

    @Expose
    @SerializedName("user")
    lateinit var user: User


    @Expose
    @SerializedName("paymentCardCode")
    var paymentCardCode: String? = null


    @Expose
    @SerializedName("paymentCardSerialNumber")
    var paymentCardSerialNumber: String? = null

    constructor() {}


    constructor(
        userID: String?,
        dietPlanRequestID: Int?,
        age: Int?,
        weight: Double?,
        height: Double?,
        waist: Double?,
        gender: String?,
        dietTypeName: String?,
        dateStamp: String?,
        dietPlan: ArrayList<DietPlan>?,
        user: User,
        paymentCardCode: String?,
        paymentCardSerialNumber: String?
    ) {
        this.userID = userID
        this.dietPlanRequestID = dietPlanRequestID
        this.age = age
        this.weight = weight
        this.height = height
        this.waist = waist
        this.gender = gender
        this.dietTypeName = dietTypeName
        this.dateStamp = dateStamp
        this.dietPlan = dietPlan
        this.user = user
        this.paymentCardCode = paymentCardCode
        this.paymentCardSerialNumber = paymentCardSerialNumber
    }
}