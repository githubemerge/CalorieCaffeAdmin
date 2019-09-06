package emerge.project.caloriecaffeadmin.viewModel


import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import io.reactivex.Observer
import androidx.lifecycle.ViewModel
import com.google.gson.JsonArray
import com.google.gson.JsonObject
import emarge.project.caloriecaffe.model.DietPlan
import emarge.project.caloriecaffe.model.DietRequest
import emarge.project.caloriecaffeadmin.network.api.APIInterface
import emarge.project.caloriecaffeadmin.network.api.ApiClient
import emerge.project.caloriecaffeadmin.model.User
import emerge.project.caloriecaffeadmin.model.UserHistory
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import org.json.JSONArray
import java.util.ArrayList

class CompleteViewModel : ViewModel() {



    var requestStatus = MutableLiveData<DietRequest>()

    var getingDietPendingErorr = MutableLiveData<String>()

    var showProgressbar = MutableLiveData<Boolean>()

    var dietComplteleList = MutableLiveData<ArrayList<DietRequest>>()
    var dietUserHistoryList = MutableLiveData<UserHistory>()
    var getingUserHistoryErorr = MutableLiveData<String>()

    var apiInterface : APIInterface? = null
    var cm: ConnectivityManager? = null

    var contx: Context? = null





    fun setViewListener(con : Context) {
        apiInterface = ApiClient.client()
        contx = con
        cm = con.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    }


    fun getDietComplete(){
        val activeNetwork: NetworkInfo? = cm!!.activeNetworkInfo
        val isConnected: Boolean = activeNetwork?.isConnectedOrConnecting == true

        if(!isConnected){
            getingDietPendingErorr.value="No internet connection !"
        }else{
            showProgressbar.value = true
            val dList = ArrayList<DietRequest>()

            apiInterface!!.getSubmittedDietPlanRequests("5050")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : Observer<JsonArray> {
                    override fun onSubscribe(d: Disposable) {}
                    override fun onNext(districts:JsonArray) {

                        var registration: JSONArray? = null
                        registration = JSONArray(districts.toString())

                        for (i in 0 until registration.length()) {
                            val actor = registration.getJSONObject(i)
                            val actorUser = registration.getJSONObject(i).getJSONObject("user")
                            val actorPlan = registration.getJSONObject(i).getJSONArray("dietPlanList")


                            var user: User = User()
                            user.fullName = actorUser.getString("fullName")
                            user.userID = actorUser.getString("userID")
                            user.nic = actorUser.getString("nic")
                            user.email = actorUser.getString("email")



                            val dPlan = ArrayList<DietPlan>()

                            val plan = actorPlan.getJSONObject(0)


                            dPlan?.add(DietPlan(plan.getInt("dietPlanID"),plan.getInt("dietPlanRequestID"),plan.getString("dietPlanUrl"),
                                plan.getString("submitDate"),plan.getString("expiryDate"),plan.getBoolean("dietPlanStatus")))


                            dList?.add(DietRequest(actor.getString("userID"),actor.getInt("dietPlanRequestID"),actor.getInt("age"),actor.getDouble("weight"),
                                actor.getDouble("height"),actor.getDouble("waist"),actor.getString("gender"),
                                    actor.getString("dietTypeName"),
                                    actor.getString("dateStamp"),dPlan,user,actor.getString("paymentCardCode"),actor.getString("paymentCardSerialNumber")))


                        }



                    }
                    override fun onError(e: Throwable) {
                        getingDietPendingErorr.value="Something went wrong, Please try again"
                        showProgressbar.value = false

                    }
                    override fun onComplete() {
                        dietComplteleList.value =dList
                        showProgressbar.value = false
                    }
                })

        }

    }


/*
    fun getDietComplete(){
        val activeNetwork: NetworkInfo? = cm!!.activeNetworkInfo
        val isConnected: Boolean = activeNetwork?.isConnectedOrConnecting == true

        if(!isConnected){
            getingDietPendingErorr.value="No internet connection !"
        }else{
            showProgressbar.value = true
            var dList: ArrayList<DietRequest>? = null

            apiInterface!!.getSubmittedDietPlanRequests("5050")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : Observer<ArrayList<DietRequest>> {
                    override fun onSubscribe(d: Disposable) {}
                    override fun onNext(districts: ArrayList<DietRequest>) {
                        dList = districts
                        dietComplteleList.value =districts
                    }
                    override fun onError(e: Throwable) {
                        getingDietPendingErorr.value="Something went wrong, Please try again"
                        showProgressbar.value = false

                    }
                    override fun onComplete() {

                       showProgressbar.value = false
                    }
                })

        }

    }
*/




}