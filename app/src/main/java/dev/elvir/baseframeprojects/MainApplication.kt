package dev.elvir.baseframeprojects

import android.app.Application

class MainApplication : Application() {
    lateinit var componentManager: ComponentManager

    override fun onCreate() {
        super.onCreate()
        if (!this::componentManager.isInitialized) {
            createMainComponentManager()
        }
    }

    private fun createMainComponentManager(): ComponentManager =
        ComponentManager().apply { generateMainComponents(this@MainApplication) }

}