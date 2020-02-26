package dev.elvir.support_impl.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.elvir.auth_api.AuthRouter
import dev.elvir.support_impl.ComponentManager
import dev.elvir.support_impl.R
import kotlinx.android.synthetic.main.activity_support.*
import javax.inject.Inject

class SupportActivity : AppCompatActivity() {
    @Inject
    lateinit var authRouter: AuthRouter


    override fun onCreate(savedInstanceState: Bundle?) {
        ComponentManager.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_support)
        btnGoToAuth.setOnClickListener {
            authRouter.startAuthScreen(this)
        }
    }
}
