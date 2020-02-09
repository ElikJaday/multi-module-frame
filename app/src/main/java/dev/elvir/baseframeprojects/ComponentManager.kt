package dev.elvir.baseframeprojects

import android.content.Context
import dev.elvir.baseframeprojects.di.AppComponent
import dev.elvir.baseframeprojects.di.DaggerAppComponent
import dev.elvir.core.di.CoreComponent

/**
 * @author Elvir
 * Created by ElikJaday on 08/02/2020.
 * @see
 * Visit my GitHub
 * https://github.com/ElikJaday
 */
class ComponentManager {

    /**
     * @param lazy initialization  module managers
     */
    private val coreComponentManager by lazy {
        dev.elvir.core.ComponentManager
    }
    private val authComponentManager by lazy {
        dev.elvir.authorization.ComponentManager
    }
    private val chatComponentManager by lazy {
        dev.elvir.chat.ComponentManager.apply {
            injectCoreComponentManager(this@ComponentManager.coreComponentManager)
        }
    }

    /**
     * @param main component fields
     */
    private var appComponent: AppComponent? = null
    private var coreComponent: CoreComponent? = null

    /**
     * @param main component builder with module components API
     */
    fun generateMainComponents(context: Context) {
        plusCoreComponent(context)
        plusAppComponent()
    }

    private fun plusAppComponent(): AppComponent = DaggerAppComponent
        .builder()
        .chatApi(chatComponentManager.plusChatComponent())
        .authApi(authComponentManager.plusAuthComponent())
        .build().also { appComponent = it }

    fun plusCoreComponent(
        context: Context
    ): CoreComponent =
        coreComponentManager
            .plusCoreComponent(context)
            .also { coreComponent = it }

}