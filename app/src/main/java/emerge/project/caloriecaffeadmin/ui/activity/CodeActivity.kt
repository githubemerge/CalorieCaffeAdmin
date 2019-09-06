package emerge.project.caloriecaffeadmin.ui.activity


import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import emarge.project.caloriecaffe.model.DietCard
import emerge.project.caloriecaffeadmin.R
import emerge.project.caloriecaffeadmin.databinding.ActivityCodeBinding
import emerge.project.caloriecaffeadmin.ui.adaptor.CardAdapter
import emerge.project.caloriecaffeadmin.viewModel.CardViewModel
import kotlinx.android.synthetic.main.activity_code.*
import kotlinx.android.synthetic.main.activity_pending.*
import kotlinx.android.synthetic.main.activity_pending.bottomNavigationView

class CodeActivity : AppCompatActivity() {




    private lateinit var binding:ActivityCodeBinding

    lateinit var cardAdapter: CardAdapter



    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_pending -> {

                val intent = Intent(this@CodeActivity, PendingActivity::class.java)
                startActivity(intent)
                finish()

            }
            R.id.navigation_complete -> {
                val intent = Intent(this@CodeActivity, CompleteActivity::class.java)
                startActivity(intent)
                finish()

            }
            R.id.navigation_user -> {

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_card -> {

                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code)


        binding = DataBindingUtil.setContentView<ActivityCodeBinding>(this, R.layout.activity_code)
        binding.card = ViewModelProviders.of(this).get(CardViewModel::class.java)
        binding.card!!.setViewListener(this)



        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        bottomNavigationView!!.selectedItemId = R.id.navigation_card


        val layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        recyclerview_card!!.layoutManager = layoutManager
        recyclerview_card!!.itemAnimator = DefaultItemAnimator()
        recyclerview_card!!.isNestedScrollingEnabled = false


        binding.card!!.getCardDetails()


        binding.card!!.showProgressbar.observe(this, Observer<Boolean> {
            it?.let { result ->
                if(result){
                    progressBarCard.visibility= View.VISIBLE
                }else{
                    progressBarCard.visibility= View.GONE

                }
            }
        })




        binding.card!!.getingCardErorr.observe(this, Observer<String> {
            it?.let { result ->
                Toast.makeText(this, result, Toast.LENGTH_LONG).show()
            }
        })


        binding.card!!.cardList.observe(this, Observer<ArrayList<DietCard>> {
            it?.let { result ->
                if(result.isEmpty()){
                    Toast.makeText(this,"No Diet Plans Available", Toast.LENGTH_LONG).show()
                    cardAdapter = CardAdapter(result)
                    recyclerview_card!!.adapter = cardAdapter
                }else{
                    cardAdapter = CardAdapter(result)
                    recyclerview_card!!.adapter = cardAdapter
                }

            }
        })



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
}
