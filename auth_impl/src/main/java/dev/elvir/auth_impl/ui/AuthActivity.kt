package dev.elvir.auth_impl.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import dev.elvir.auth_impl.ComponentManager
import dev.elvir.auth_impl.R
import dev.elvir.support_api.SupportRouter
import kotlinx.android.synthetic.main.activity_auth.*
import javax.inject.Inject

class AuthActivity : AppCompatActivity() {
//    @Inject
    lateinit var supportRouter: SupportRouter

    override fun onCreate(savedInstanceState: Bundle?) {
        ComponentManager.getAuthComponent(this).inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        btnGoToSupport.setOnClickListener {
            supportRouter.startSupportScreen(this)
        }
    }

}
