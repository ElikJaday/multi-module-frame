package dev.elvir.baseframeprojects

import android.app.Application

class MainApplication : Application(), dev.elvir.core.feature_component.ComponentManager {

    lateinit var componentManager: ComponentManager

    override fun onCreate() {
        super.onCreate()
        if (!this::componentManager.isInitialized) {
            createMainComponentManager()
        }
    }

    override fun <T> getDependency(key: Class<T>): T =
        componentManager.componentBuilder(key, this)


    private fun createMainComponentManager(): ComponentManager =
        ComponentManager()
            .apply { plusAppComponent() }
            .also { componentManager = it }

}