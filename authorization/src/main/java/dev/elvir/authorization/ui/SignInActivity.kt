package dev.elvir.authorization.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.elvir.authorization.ComponentManager
import dev.elvir.authorization.R
import kotlinx.android.synthetic.main.activity_sign_in.*

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        var comp = ComponentManager.authComponent!!.inject(this)


        btnEnter.setOnClickListener {
            // Toast.makeText(this, authComponent!!.helloWorld(), Toast.LENGTH_LONG).show()
        }

    }
}
