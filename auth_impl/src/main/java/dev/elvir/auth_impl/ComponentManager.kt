package dev.elvir.auth_impl

import android.content.Context
import dev.elvir.core.feature_component.DependencyManager
import dev.elvir.support_api.SupportApi


object ComponentManager {

    private lateinit var authComponent: AuthComponent

    fun plusAuthComponent(context: Context): AuthComponent {
        return DaggerAuthComponent.builder()
            .supportApi(
                DependencyManager.getFeatureDependecy(context, SupportApi::class.java)
            )
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

}

