package emarge.project.caloriecaffeadmin.network.api


import com.google.gson.JsonArray
import com.google.gson.JsonObject
import emarge.project.caloriecaffe.model.DietPlan
import emarge.project.caloriecaffe.model.DietRequest
import emerge.project.caloriecaffeadmin.model.DietRequestJava
import emerge.project.caloriecaffeadmin.model.UserHistory

import io.reactivex.Observable
import org.json.JSONArray
import org.json.JSONObject
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

import java.util.ArrayList

/**
 * Created by kamal on 8/2/18.
 */
interface APIInterface{

    @GET("DietPlan/GetPendingDietPlanRequests")
   fun getCurrentPlanForUser(@Query("tokenID") token: String): Observable<JsonArray>


  /* @GET("DietPlan/GetPendingDietPlanRequests")
   fun getCurrentPlanForUser(@Query("tokenID") token: String): Observable<List<DietRequestJava>>
*/

    @POST("DietPlan/SaveDietPlan")
    fun saveDietPlan(@Body dietInfo: JsonObject): Observable<DietPlan>


  /*  @GET("DietPlan/GetSubmittedDietPlanRequests")
    fun getSubmittedDietPlanRequests(@Query("tokenID") token: String): Observable<ArrayList<DietRequest>>
    */

    @GET("DietPlan/GetSubmittedDietPlanRequests")
    fun getSubmittedDietPlanRequests(@Query("tokenID") token: String): Observable<JsonArray>


    @GET("User/GetUserDetailsByID")
    fun getUserHistoryDetails(@Query("userID") userID: String): Observable<UserHistory>



    @GET("DietPlan/GetPaymentCardDetails")
    fun getPaymentCardDetails(@Query("tokenID") token: String): Observable<JsonArray>


}
