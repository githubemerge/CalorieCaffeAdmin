package emerge.project.caloriecaffeadmin.model

import com.google.gson.annotations.SerializedName
import emarge.project.caloriecaffe.model.DietPlan
import emarge.project.caloriecaffe.model.DietRequestHistory


import java.io.Serializable
import java.util.ArrayList


class UserHistory : Serializable {


    @SerializedName("userID")
    var userID: String? = null

    @SerializedName("nic")
    var nic: String? = null

    @SerializedName("fullName")
    var fullName: String? = null

    @SerializedName("email")
    var email: String? = null


    @SerializedName("dietPlanRequest")
    var dietRequestHistory: ArrayList<DietRequestHistory>? = null


    @SerializedName("error")
    var dietUserHistoryError: Error? = null



}