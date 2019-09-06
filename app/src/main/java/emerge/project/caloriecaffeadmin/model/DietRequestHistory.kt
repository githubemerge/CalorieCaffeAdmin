package emarge.project.caloriecaffe.model

import com.google.gson.annotations.SerializedName
import emerge.project.caloriecaffeadmin.model.User
import java.io.Serializable
import java.util.ArrayList

class DietRequestHistory : Serializable {

    @SerializedName("userID")
    var userID: String? = null

    @SerializedName("dietPlanRequestID")
    var dietPlanRequestID: Int? = null

    @SerializedName("age")
    var age: Int? = null

    @SerializedName("weight")
    var weight: Double? = null

    @SerializedName("height")
    var height: Double? = null

    @SerializedName("waist")
    var waist: Double? = null

    @SerializedName("gender")
    var gender: String? = null

    @SerializedName("paymentCardID")
    var paymentCardID: Long? = null

    @SerializedName("dietTypeID")
    var dietTypeID: Int? = null

    @SerializedName("dietTypeName")
    var dietTypeName: String? = null

    @SerializedName("dateStamp")
    var dateStamp: String? = null


    @SerializedName("dietPlanRequestStatus")
    var dietPlanRequestStatus: Boolean = false


    @SerializedName("isDietPlanSubmitted")
    var isDietPlanSubmitted: Boolean = false

    @SerializedName("dietPlanStatus")
    var dietPlanStatus: Boolean = false

    @SerializedName("error")
    var dietRequestError: Error? = null


    @SerializedName("dietPlanList")
    var dietPlanList: ArrayList<DietPlan>? = null



}