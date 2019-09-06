package emarge.project.caloriecaffe.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Error : Serializable {

    @SerializedName("code")
    var code: String? = null


    @SerializedName("description")
    var description: String? = null


}