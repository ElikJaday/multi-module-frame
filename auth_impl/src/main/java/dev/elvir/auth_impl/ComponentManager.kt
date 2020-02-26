package dev.elvir.auth_impl

import android.content.Context
import dev.elvir.auth_api.AuthApi
import dev.elvir.auth_impl.di.AuthComponent
import dev.elvir.auth_impl.di.DaggerAuthComponent
import dev.elvir.auth_impl.di.DaggerAuthComponent_AuthInnerComponent
import dev.elvir.auth_impl.ui.AuthActivity
import dev.elvir.core.feature_component.DependencyManager
import dev.elvir.support_api.SupportApi


object ComponentManager {

    private lateinit var authComponent: AuthComponent

    fun plusAuthComponent(context: Context): AuthComponent {
        return DaggerAuthComponent.builder()
            .build()
            .also { authComponent = it }
    }


    fun getAuthComponent(context: Context): AuthComponent {
        return if (this::authComponent.isInitialized) {
            authComponent
        } else {
            plusAuthComponent(context)
        }
    }

    fun inject(authActivity: AuthActivity) {
        DaggerAuthComponent_AuthInnerComponent.builder()
            .supportApi(DependencyManager.getFeatureDependecy(authActivity, SupportApi::class.java))
            .authApi(DependencyManager.getFeatureDependecy(authActivity, AuthApi::class.java))
            .build()
            .inject(authActivity)
    }


}

