package dev.elvir.auth_impl

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import dev.elvir.support_api.SupportRouter
import kotlinx.android.synthetic.main.activity_auth.*
import javax.inject.Inject

class AuthActivity : AppCompatActivity() {
    @Inject
    lateinit var hello: String

    @Inject
    lateinit var supportRouter: SupportRouter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        ComponentManager.getAuthComponent(this).inject(this)
        Toast.makeText(this, hello, Toast.LENGTH_LONG).show()
        btnGoToSupport.setOnClickListener {
            supportRouter.startSupportScreen(this)
        }
    }

}
