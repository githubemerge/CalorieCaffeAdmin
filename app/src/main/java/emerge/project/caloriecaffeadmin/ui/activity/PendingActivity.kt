package emerge.project.caloriecaffeadmin.ui.activity

import android.Manifest
import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import emarge.project.caloriecaffe.model.DietRequest
import emerge.project.caloriecaffeadmin.R
import emerge.project.caloriecaffeadmin.databinding.ActivityPendingBinding
import emerge.project.caloriecaffeadmin.ui.adaptor.PendingsAdapter
import emerge.project.caloriecaffeadmin.viewModel.PendingViewModel
import kotlinx.android.synthetic.main.activity_pending.*
import android.content.Intent
import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.content.pm.PackageManager

import android.net.Uri
import android.util.Log
import android.view.Window
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.android.gms.tasks.Continuation
import com.google.android.gms.tasks.Task
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.UploadTask
import emarge.project.caloriecaffe.model.DietPlan
import emerge.project.caloriecaffeadmin.model.DietRequestJava
import emerge.project.caloriecaffeadmin.model.UserHistory
import emerge.project.caloriecaffeadmin.ui.adaptor.UserHistoryAdapter





class PendingActivity : AppCompatActivity(), PendingsAdapter.ClickListener {



    val PICK_IMAGE_REQUEST = 900
    lateinit var filePath: Uri

    private lateinit var binding: ActivityPendingBinding

    lateinit var pendingsAdapter: PendingsAdapter

    var selectedDietRequestID: Int? = 0
    var dietPendingList = ArrayList<DietRequest>()
  // var dietPendingList = ArrayList<DietRequestJava>()

    lateinit var dialogFilter: Dialog

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_pending -> {


                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_complete -> {
                val intent = Intent(this@PendingActivity, CompleteActivity::class.java)
                startActivity(intent)
                finish()
            }
            R.id.navigation_user -> {

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_card -> {

                val intent = Intent(this@PendingActivity, CodeActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
        false
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pending)



        binding = DataBindingUtil.setContentView<ActivityPendingBinding>(this, R.layout.activity_pending)
        binding.pending = ViewModelProviders.of(this).get(PendingViewModel::class.java)
        binding.pending!!.setViewListener(this)


       binding.pending!!.getDietPending()

        binding.pending!!.getingDietPendingErorr.observe(this, Observer<String> {
            it?.let { result ->
                Toast.makeText(this, result, Toast.LENGTH_LONG).show()
            }
        })



        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        bottomNavigationView!!.selectedItemId = R.id.navigation_pending



        binding.pending!!.showProgressbar.observe(this, Observer<Boolean> {
            it?.let { result ->
                if (result) {
                    progressBar.visibility = View.VISIBLE
                } else {
                    progressBar.visibility = View.GONE

                }
            }
        })


            val layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
            recyclerview_pending!!.layoutManager = layoutManager
            recyclerview_pending!!.itemAnimator = DefaultItemAnimator()
            recyclerview_pending!!.isNestedScrollingEnabled = false



        binding.pending!!.requestStatus.observe(this, Observer<DietPlan> {
            it?.let { result ->
                if (result.dietPlanStatus) {
                    binding.pending!!.getDietPending()
                    Toast.makeText(this, "Diet plan submit successfully", Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(this, result.dietPlanError!!.description, Toast.LENGTH_LONG).show()
                }

            }
        })


        binding.pending!!.getingUserHistoryErorr.observe(this, Observer<String> {
            it?.let { result ->
                Toast.makeText(this, result, Toast.LENGTH_LONG).show()
            }
        })


        binding.pending!!.dietUserHistoryList.observe(this, Observer<UserHistory> {
            it?.let { result ->
                ditePlneDialog(result)
            }
        })


        binding.pending!!.test.observe(this, Observer<String> {
            it?.let { result ->
                val alertDialogBuilder = AlertDialog.Builder(this)
                alertDialogBuilder.setMessage(result)
                alertDialogBuilder.setPositiveButton("OK"
                ) { _, _ ->
                    return@setPositiveButton
                }
                alertDialogBuilder.show()
            }
        })



   /*     binding.pending!!.dietPendingList.observe(this, Observer<ArrayList<DietRequestJava>> {
            it?.let { result ->
                if (result.isEmpty()) {
                    Toast.makeText(this, "No Diet Request Available", Toast.LENGTH_LONG).show()

                    var req = ArrayList<DietRequestJava>()

                    dietPendingList = result
                    pendingsAdapter = PendingsAdapter(req,this)
                    recyclerview_pending!!.adapter = pendingsAdapter
                } else {





                    dietPendingList = result
                    pendingsAdapter = PendingsAdapter(result,this)
                    recyclerview_pending!!.adapter = pendingsAdapter
                }

            }
        })
    }*/




        binding.pending!!.dietPendingList.observe(this, Observer<ArrayList<DietRequest>> {
            it?.let { result ->
                if (result.isEmpty()) {
                    Toast.makeText(this, "No Diet Request Available", Toast.LENGTH_LONG).show()
                    var req = ArrayList<DietRequest>()
                    dietPendingList = result
                    pendingsAdapter = PendingsAdapter(req,this)
                    recyclerview_pending!!.adapter = pendingsAdapter
                } else {


                    dietPendingList = result
                    pendingsAdapter = PendingsAdapter(result,this)
                   recyclerview_pending!!.adapter = pendingsAdapter
                }

            }
        })
    }

     override fun onFabClick(v: View?, position: Int) {
         binding.pending!!.getSelectedUserHistory(dietPendingList[position].userID.toString())

    }


    override fun onPendingRequestClick(v: View?, position: Int) {

        selectedDietRequestID = dietPendingList[position].dietPlanRequestID

        val permission = ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE)
        if (permission != PackageManager.PERMISSION_GRANTED) {
            makeRequest()
        }else{
            chooseFile()
        }
    }

    private fun makeRequest() {
        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE), PICK_IMAGE_REQUEST)
    }

    fun ditePlneDialog(userHistory : UserHistory){

        dialogFilter = Dialog(this)
        dialogFilter.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialogFilter.window!!.setBackgroundDrawableResource(android.R.color.transparent)
        dialogFilter.setContentView(R.layout.dialog_user_history)
        dialogFilter.setCancelable(true)


        var recyclerviewDiteplane : RecyclerView = dialogFilter.findViewById<RecyclerView>(R.id.recyclerview_history)


        val layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        recyclerviewDiteplane.layoutManager = layoutManager
        recyclerviewDiteplane.itemAnimator = DefaultItemAnimator()
        recyclerviewDiteplane.isNestedScrollingEnabled = false

        var userHistoryAdapter: UserHistoryAdapter = UserHistoryAdapter(userHistory.dietRequestHistory)

        recyclerviewDiteplane.adapter = userHistoryAdapter

        progressBar.visibility = View.GONE
        dialogFilter.show()

    }






    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode != Activity.RESULT_OK) {
            return
        }
        when (requestCode) {
            PICK_IMAGE_REQUEST -> {
                filePath = data!!.data
                uploadFile()

            }
        }
    }


    private fun chooseFile() {
        val intent = Intent().apply {
           // type = "application/pdf"
            type = "application/pdf"
            action = Intent.ACTION_GET_CONTENT
        }
        startActivityForResult(Intent.createChooser(intent, "Select PDF"), PICK_IMAGE_REQUEST)
    }


    private fun uploadFile() {

        progressBar.visibility = View.VISIBLE
        var fileName = "${selectedDietRequestID.toString()}.pdf"

        val data = FirebaseStorage.getInstance()
        var storage = data.reference.child(fileName).putFile(filePath)
            .continueWithTask(Continuation<UploadTask.TaskSnapshot, Task<Uri>> { task ->
                if (!task.isSuccessful) {
                    task.exception?.let { throw it }
                }
                return@Continuation data.reference.child(fileName).downloadUrl
            }).addOnCompleteListener { task ->
            if (task.isSuccessful) {
                val downloadUri = task.result
                Log.v("Download File", "File..$downloadUri")
                binding.pending!!.sendDietPlanToServer(selectedDietRequestID, downloadUri.toString())
                progressBar.visibility = View.GONE
            } else {
                Toast.makeText(this@PendingActivity, "Please try again", Toast.LENGTH_SHORT).show()
            }
        }.addOnFailureListener { exception ->
            exception.printStackTrace()
            Toast.makeText(this@PendingActivity, exception.message, Toast.LENGTH_SHORT).show()
            progressBar.visibility = View.GONE
        }

    }

    override fun onBackPressed() {
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setTitle("Exit!")
        alertDialogBuilder.setMessage("Do you really want to exit ?")
        alertDialogBuilder.setPositiveButton(
            "YES"
        ) { dialog, _ ->
            dialog.dismiss()
            finish()
        }
        alertDialogBuilder.setNegativeButton("NO", DialogInterface.OnClickListener { _, _ -> return@OnClickListener })
        alertDialogBuilder.show()
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        when (requestCode) {
            PICK_IMAGE_REQUEST -> {
                // If request is cancelled, the result arrays are empty.
                if ((grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
                    // permission was granted, yay! Do the
                    // contacts-related task you need to do.
                    chooseFile()
                } else {
                    // permission denied, boo! Disable the
                    // functionality that depends on this permission.
                    Toast.makeText(this@PendingActivity, "Oops! Permission Denied!!", Toast.LENGTH_SHORT).show()
                }
                return
            }

            // Add other 'when' lines to check for other
            // permissions this app might request.
            else -> {
                // Ignore all other requests.
            }
        }
    }
}
