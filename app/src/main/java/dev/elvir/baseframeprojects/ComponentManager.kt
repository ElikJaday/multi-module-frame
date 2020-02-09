package dev.elvir.baseframeprojects

import android.content.Context
import dev.elvir.baseframeprojects.di.AppComponent
import dev.elvir.baseframeprojects.di.DaggerAppComponent
import dev.elvir.core.di.CoreComponent
import dev.elvir.core.di.DaggerCoreComponent
import dev.elvir.core.di.module.CoreModule

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
        dev.elvir.chat.ComponentManager
    }

    /**
     * @param main component fields
     */
    private var appComponent: AppComponent? = null
    private var coreComponent: CoreComponent? = null

    /**
     * @param main component builder with module components API
     */
    fun plusAppComponent(): AppComponent {

     return  DaggerAppComponent
            .builder()
            .chatApi(chatComponentManager.plusChatComponent())
            .authApi(authComponentManager.plusAuthComponent())
            .build().also { appComponent = it }

    }

    fun plusCoreComponent(
        context: Context
    ): CoreComponent = DaggerCoreComponent
        .builder()
        .coreModule(CoreModule(context))
        .build()
        .also { coreComponent = it }

}