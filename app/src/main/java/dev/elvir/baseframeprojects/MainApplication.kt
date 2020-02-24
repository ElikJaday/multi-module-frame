package dev.elvir.baseframeprojects

import android.app.Application
import dev.elvir.core.di.feature_reuse_di.FeatureManager

class MainApplication : Application(),FeatureManager {
    lateinit var componentManager: ComponentManager

    override fun onCreate() {
        super.onCreate()
        if (!this::componentManager.isInitialized) {
            createMainComponentManager()
        }
    }

    private fun createMainComponentManager(): ComponentManager =
        ComponentManager().apply { generateMainComponents(this@MainApplication) }

    override fun <T> getDependency(key: Class<T>?): T {
        when(key){
            key is
            else-> throw  RuntimeException(" feature not found")
        }
    }


}