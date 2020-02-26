package dev.elvir.support_impl

import android.content.Context
import dev.elvir.auth_api.AuthApi
import dev.elvir.core.feature_component.DependencyManager
import dev.elvir.support_api.SupportApi
import dev.elvir.support_impl.di.DaggerSupportComponent
import dev.elvir.support_impl.di.DaggerSupportComponent_SupportInnerComponent
import dev.elvir.support_impl.di.SupportComponent
import dev.elvir.support_impl.ui.SupportActivity


object ComponentManager {

    private lateinit var supportComponent: SupportComponent

    fun plusSupportComponent(context: Context): SupportComponent {
        return DaggerSupportComponent.builder()
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

    fun inject(supportActivity: SupportActivity) {
        DaggerSupportComponent_SupportInnerComponent.builder()
            .supportApi(DependencyManager.getFeatureDependecy(supportActivity, SupportApi::class.java))
            .authApi(DependencyManager.getFeatureDependecy(supportActivity, AuthApi::class.java))
            .build()
            .inject(supportActivity)
    }

}

