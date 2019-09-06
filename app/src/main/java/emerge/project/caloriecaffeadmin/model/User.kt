package emerge.project.caloriecaffeadmin.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


import java.io.Serializable


class User : Serializable {

    @Expose
    @SerializedName("userID")
    lateinit var userID: String

    @Expose
    @SerializedName("nic")
    lateinit var nic: String

    @Expose
    @SerializedName("fullName")
    lateinit var fullName: String

    @Expose
    @SerializedName("email")
    lateinit var email: String




    constructor(userID: String, nic: String, fullName: String, email: String) {
        this.userID = userID
        this.nic = nic
        this.fullName = fullName
        this.email = email
    }

    constructor()


}