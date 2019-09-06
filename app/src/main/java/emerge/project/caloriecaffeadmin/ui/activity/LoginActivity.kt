package emerge.project.caloriecaffeadmin.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import emerge.project.caloriecaffeadmin.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

       button2.setOnClickListener {
            when {
                editText.text.isEmpty() -> Toast.makeText(this, "Login code empty", Toast.LENGTH_LONG).show()
                editText.text.toString() == "Doc@777" -> {
                    val intent = Intent(this@LoginActivity, PendingActivity::class.java)
                    startActivity(intent)
                    finish()
                }
                else -> Toast.makeText(this, "Login code error", Toast.LENGTH_LONG).show()
            }
        }


    }
}
