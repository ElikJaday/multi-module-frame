package dev.elvir.support_impl

import android.content.Context
import dev.elvir.auth_api.AuthApi
import dev.elvir.core.feature_component.DependencyManager
import dev.elvir.support_api.SupportApi
import dev.elvir.support_impl.di.DaggerSupportComponent
import dev.elvir.support_impl.di.DaggerSupportComponent_SupportDependenciesComponent
import dev.elvir.support_impl.di.SupportComponent


object ComponentManager {

    private lateinit var supportComponent: SupportComponent

    fun plusSupportComponent(context: Context): SupportComponent {
        val dependencies = DaggerSupportComponent_SupportDependenciesComponent.builder()
            .authApi(DependencyManager.getFeatureDependecy(context, AuthApi::class.java))
            .build()
        return DaggerSupportComponent.builder()
            .dependencies(dependencies)
            .build()
            .also { supportComponent = it }
    }


    fun getSupportComponent(context: Context): SupportComponent {
        return if (this::supportComponent.isInitialized) {
            supportComponent
        } else {
            plusSupportComponent(context)
        }
    }

}

