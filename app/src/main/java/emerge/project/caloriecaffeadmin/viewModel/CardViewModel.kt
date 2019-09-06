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
import emarge.project.caloriecaffe.model.DietCard
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

class CardViewModel : ViewModel() {


    var showProgressbar = MutableLiveData<Boolean>()
    var getingCardErorr = MutableLiveData<String>()


    var cardList = MutableLiveData<ArrayList<DietCard>>()


    var apiInterface: APIInterface? = null
    var cm: ConnectivityManager? = null

    var contx: Context? = null


    fun setViewListener(con: Context) {
        apiInterface = ApiClient.client()
        contx = con
        cm = con.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    }


    fun getCardDetails() {


        val activeNetwork: NetworkInfo? = cm!!.activeNetworkInfo
        val isConnected: Boolean = activeNetwork?.isConnectedOrConnecting == true

        if(!isConnected){
            getingCardErorr.value="No internet connection !"
        }else{

            showProgressbar.value = true
            val dList = ArrayList<DietCard>()


            apiInterface!!.getPaymentCardDetails("5050")
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(object : Observer<JsonArray> {
                        override fun onSubscribe(d: Disposable) {}
                        override fun onNext(districts:JsonArray) {

                            var registration: JSONArray? = null
                            registration = JSONArray(districts.toString())

                            for (i in 0 until registration.length()) {
                                val actor = registration.getJSONObject(i)
                                dList?.add(DietCard(actor.getString("paymentCardCode"),actor.getString("paymentCardSerialNumber")
                                        ,actor.getString("fullName"),actor.getBoolean("isDietPlanSubmitted"),actor.getString("dateStamp").substring(0,10) ))

                            }



                        }
                        override fun onError(e: Throwable) {
                            getingCardErorr.value="Something went wrong, Please try again"
                            showProgressbar.value = false

                        }
                        override fun onComplete() {
                           cardList.value =dList
                            showProgressbar.value = false
                        }
                    })


        }







    }




}