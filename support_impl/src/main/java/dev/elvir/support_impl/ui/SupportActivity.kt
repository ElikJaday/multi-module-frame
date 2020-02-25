package dev.elvir.support_impl.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.elvir.auth_api.AuthApi
import dev.elvir.core.feature_component.DependencyManager
import dev.elvir.support_api.SupportApi
import dev.elvir.support_impl.ComponentManager
import dev.elvir.support_impl.R
import kotlinx.android.synthetic.main.activity_support.*

class SupportActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        ComponentManager.getSupportComponent(this).inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_support)
        btnGoToAuth.setOnClickListener {
            DependencyManager.getFeatureDependecy(this, AuthApi::class.java)
                .provideAuthRouter().startAuthScreen(this)
        }
    }
}
