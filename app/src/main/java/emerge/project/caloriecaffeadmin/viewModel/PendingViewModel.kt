package emerge.project.caloriecaffeadmin.viewModel


import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import io.reactivex.Observer
import androidx.lifecycle.ViewModel
import com.google.gson.JsonArray
import com.google.gson.JsonObject
import emarge.project.caloriecaffe.model.DietPlan
import emarge.project.caloriecaffe.model.DietRequest
import emarge.project.caloriecaffeadmin.network.api.APIInterface
import emarge.project.caloriecaffeadmin.network.api.ApiClient
import emerge.project.caloriecaffeadmin.model.DietRequestJava
import emerge.project.caloriecaffeadmin.model.User
import emerge.project.caloriecaffeadmin.model.UserHistory
import emerge.project.caloriecaffeadmin.model.UserJava
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import org.json.JSONArray
import org.json.JSONObject
import java.util.ArrayList

class PendingViewModel : ViewModel() {



    var requestStatus = MutableLiveData<DietPlan>()

    var getingDietPendingErorr = MutableLiveData<String>()

    var showProgressbar = MutableLiveData<Boolean>()

    var dietPendingList = MutableLiveData<ArrayList<DietRequest>>()
   // var dietPendingList = MutableLiveData<ArrayList<DietRequestJava>>()


    var dietUserHistoryList = MutableLiveData<UserHistory>()
    var getingUserHistoryErorr = MutableLiveData<String>()


    var test = MutableLiveData<String>()


    var apiInterface : APIInterface? = null
    var cm: ConnectivityManager? = null

    var contx: Context? = null

    private val list = mutableListOf<String>()
    private val _items = MutableLiveData<List<String>>().apply { value = list }

    private var nextItem = 1

    val items: LiveData<List<String>>
        get() = _items

    fun setViewListener(con : Context) {
        apiInterface = ApiClient.client()
        contx = con
        cm = con.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    }


    fun getItemsPage(pageSize: Int = 20): List<String> {

        val items = mutableListOf<String>()
        val lastItem = nextItem + pageSize - 1

        for (i in nextItem..lastItem) {
            items.add("Item $i")
        }

        nextItem = lastItem + 1

        return items
    }

    fun fetchItems() {

        val position = list.size
        val newItems = getItemsPage()
        list.addAll(newItems)

    }



/*
    fun getDietPending(){
        val activeNetwork: NetworkInfo? = cm!!.activeNetworkInfo
        val isConnected: Boolean = activeNetwork?.isConnectedOrConnecting == true

        if(!isConnected){
            getingDietPendingErorr.value="No internet connection !"
        }else{
            showProgressbar.value = true
            var dList: ArrayList<DietRequestJava>? = null

            apiInterface!!.getCurrentPlanForUser("5050")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : Observer<List<DietRequestJava>> {
                    override fun onSubscribe(d: Disposable) {}
                    override fun onNext(districts: List<DietRequestJava>) {
                      //  dList = districts

                      //  test.value =districts[0].userID

                        dietPendingList.value =districts

                      //  Toast.makeText(contx, districts[0].testFullname, Toast.LENGTH_LONG).show()



                    }
                    override fun onError(e: Throwable) {
                        getingDietPendingErorr.value= "Something went wrong, Please try again"
                        showProgressbar.value = false

                    }
                    override fun onComplete() {
                    //   test.value = dList?.get(0)?.userJava?.fullName


                        showProgressbar.value = false
                    }
                })

        }

    }
*/



    fun getDietPending(){
        val activeNetwork: NetworkInfo? = cm!!.activeNetworkInfo
        val isConnected: Boolean = activeNetwork?.isConnectedOrConnecting == true

        if(!isConnected){
            getingDietPendingErorr.value="No internet connection !"
        }else{
            showProgressbar.value = true


            val dList = ArrayList<DietRequest>()

            apiInterface!!.getCurrentPlanForUser("5050")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : Observer<JsonArray> {
                    override fun onSubscribe(d: Disposable) {}
                    override fun onNext(districts: JsonArray) {
                        var registration: JSONArray? = null
                        registration = JSONArray(districts.toString())


                        for (i in 0 until registration.length()) {
                            val actor = registration.getJSONObject(i)
                            val actorUser = registration.getJSONObject(i).getJSONObject("user")
                            val dListPlna = ArrayList<DietPlan>()

                            var user: User = User()
                            user.fullName = actorUser.getString("fullName")
                            user.userID = actorUser.getString("userID")
                            user.nic = actorUser.getString("nic")
                            user.email = actorUser.getString("email")


                            dList?.add(DietRequest(actor.getString("userID"),actor.getInt("dietPlanRequestID"),actor.getInt("age"),actor.getDouble("weight"),
                                actor.getDouble("height"),actor.getDouble("waist"),actor.getString("gender"),
                                    actor.getString("dietTypeName"),actor.getString("dateStamp"),dListPlna,user,actor.getString("paymentCardCode"),actor.getString("paymentCardSerialNumber")))


                        }


                    }
                    override fun onError(e: Throwable) {
                        getingDietPendingErorr.value= "Something went wrong, Please try again"
                        showProgressbar.value = false


                    }
                    override fun onComplete() {
                        dietPendingList.value =dList
                       showProgressbar.value = false

                    }
                })

        }

    }




    fun getSelectedUserHistory(userID : String){
        val activeNetwork: NetworkInfo? = cm!!.activeNetworkInfo
        val isConnected: Boolean = activeNetwork?.isConnectedOrConnecting == true

        if(!isConnected){
            getingUserHistoryErorr.value="No internet connection !"
        }else{
            showProgressbar.value = true
            var dList: UserHistory? = null

            apiInterface!!.getUserHistoryDetails(userID)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : Observer<UserHistory> {
                    override fun onSubscribe(d: Disposable) {}
                    override fun onNext(list: UserHistory) {
                        dList = list
                        dietUserHistoryList.value =list
                    }
                    override fun onError(e: Throwable) {
                        getingUserHistoryErorr.value="Something went wrong, Please try again$e"


                    }
                    override fun onComplete() {


                    }
                })

        }

    }


    fun sendDietPlanToServer(requestID : Int?,pdfurl : String?){

        showProgressbar.value = true

        var dietRequestResult: DietPlan? = null
        val jsonObject = JsonObject()




        jsonObject.addProperty("DietPlanRequestID",requestID)
        jsonObject.addProperty("ExpiryDate", "04-04-2022")
        jsonObject.addProperty("DietPlanUrl", pdfurl)


        apiInterface!!.saveDietPlan(jsonObject)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<DietPlan> {
                override fun onSubscribe(d: Disposable) {}
                override fun onNext(request: DietPlan) {
                    dietRequestResult = request
                }
                override fun onError(e: Throwable) {
                    dietRequestResult!!.dietPlanError!!.description="Something went wrong, Please try again"
                    requestStatus.value = dietRequestResult
                    showProgressbar.value = false
                }
                override fun onComplete() {
                    requestStatus.value = dietRequestResult
                    showProgressbar.value = false

                }
            })


    }


}