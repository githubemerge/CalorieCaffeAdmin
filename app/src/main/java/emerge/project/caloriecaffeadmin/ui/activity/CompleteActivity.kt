package emerge.project.caloriecaffeadmin.ui.activity

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.webkit.WebView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import emarge.project.caloriecaffe.model.DietRequest
import emerge.project.caloriecaffeadmin.R
import emerge.project.caloriecaffeadmin.databinding.ActivityCompleteBinding
import emerge.project.caloriecaffeadmin.model.UserHistory
import emerge.project.caloriecaffeadmin.ui.adaptor.CompleteAdapter
import emerge.project.caloriecaffeadmin.viewModel.CompleteViewModel
import kotlinx.android.synthetic.main.activity_complete.*
import android.webkit.WebViewClient




class CompleteActivity : AppCompatActivity(),CompleteAdapter.ClickListener {



    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_pending -> {
                val intent = Intent(this@CompleteActivity, PendingActivity::class.java)
                startActivity(intent)
                finish()

            }
            R.id.navigation_complete -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_user -> {

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_card -> {

                val intent = Intent(this@CompleteActivity, CodeActivity::class.java)
                startActivity(intent)
                finish()
            }


        }
        false
    }

    private lateinit var binding:ActivityCompleteBinding

    lateinit var completeAdapter: CompleteAdapter

    var dietCompleteList = ArrayList<DietRequest>()
    lateinit var dialogFilter: Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_complete)

        binding = DataBindingUtil.setContentView<ActivityCompleteBinding>(this, R.layout.activity_complete)
        binding.complete = ViewModelProviders.of(this).get(CompleteViewModel::class.java)
        binding.complete!!.setViewListener(this)



        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        bottomNavigationView!!.selectedItemId = R.id.navigation_complete


        binding.complete!!.getDietComplete()


        val layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        recyclerview_complete!!.layoutManager = layoutManager
        recyclerview_complete!!.itemAnimator = DefaultItemAnimator()
        recyclerview_complete!!.isNestedScrollingEnabled = false



        binding.complete!!.showProgressbar.observe(this, Observer<Boolean> {
            it?.let { result ->
                if(result){
                    progressBar.visibility= View.VISIBLE
                }else{
                    progressBar.visibility= View.GONE

                }
            }
        })








        binding.complete!!.dietComplteleList.observe(this, Observer<ArrayList<DietRequest>> {
            it?.let { result ->
                if(result.isEmpty()){
                    dietCompleteList = result
                   Toast.makeText(this,"No Diet Plans Available", Toast.LENGTH_LONG).show()
                    completeAdapter = CompleteAdapter(result)
                    recyclerview_complete!!.adapter = completeAdapter
                }else{
                    dietCompleteList = result
                    completeAdapter = CompleteAdapter(result)
                    completeAdapter.setClickListener(this)
                    recyclerview_complete!!.adapter = completeAdapter
                }

            }
        })


        binding.complete!!.getingUserHistoryErorr.observe(this, Observer<String> {
            it?.let { result ->
                Toast.makeText(this, result, Toast.LENGTH_LONG).show()
            }
        })

        binding.complete!!.dietUserHistoryList.observe(this, Observer<UserHistory> {
            it?.let { result ->
                Toast.makeText(this, result.email, Toast.LENGTH_LONG).show()

            }
        })

    }


    override fun onPendingRequestClick(v: View?, position: Int) {
        progressBar.visibility= View.VISIBLE
        ditePlneDialog(dietCompleteList[position].dietPlan?.get(0)?.dietPlanImage.toString())
    }



    fun ditePlneDialog(url : String){

        dialogFilter = Dialog(this)
        dialogFilter.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialogFilter.window!!.setBackgroundDrawableResource(android.R.color.transparent)
        dialogFilter.setContentView(R.layout.dialog_complete_pdf_view)
        dialogFilter.setCancelable(true)


        var webView : WebView = dialogFilter.findViewById<WebView>(R.id.webview1)


        webView.settings.javaScriptEnabled = true
        webView.webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView, url: String) {
                progressBar.visibility= View.GONE
                dialogFilter.show()
            }
        }

        webView.loadUrl("http://docs.google.com/gview?embedded=true&url=$url.pdf")
      //  webView.loadUrl("http://docs.google.com/gview?embedded=true&url=$url.pdf")



    }


    override fun onBackPressed() {
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setTitle("Exit!")
        alertDialogBuilder.setMessage("Do you really want to exit ?")
        alertDialogBuilder.setPositiveButton("YES"
        ) { dialog, _ ->
            dialog.dismiss()
            finish()
        }
        alertDialogBuilder.setNegativeButton("NO", DialogInterface.OnClickListener { _, _ -> return@OnClickListener })
        alertDialogBuilder.show()
    }
}
