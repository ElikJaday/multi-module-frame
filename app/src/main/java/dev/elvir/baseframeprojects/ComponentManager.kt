package dev.elvir.baseframeprojects

import dev.elvir.baseframeprojects.di.AppComponent
import dev.elvir.baseframeprojects.di.DaggerAppComponent

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

    /**
     * @param main component builder with module components API
     */
    fun plusAppComponent(): AppComponent = DaggerAppComponent
        .builder()
        .chatApi(chatComponentManager.plusChatComponent())
        .authApi(authComponentManager.plusAuthComponent())
        .build().also { appComponent = it }

}