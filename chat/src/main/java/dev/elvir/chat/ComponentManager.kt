package dev.elvir.chat

import dev.elvir.chat.di.ChatComponent
import dev.elvir.chat.di.DaggerChatComponent
import dev.elvir.core.ComponentManager

object ComponentManager {

    lateinit var coreComponentManager: ComponentManager
    var chatComponent: ChatComponent? = null

    fun injectCoreComponentManager(componentManager: ComponentManager){
        coreComponentManager = componentManager
    }

    fun plusChatComponent(): ChatComponent =
        chatComponent ?: DaggerChatComponent
            .builder()
            .build()
            .also { chatComponent = it }
}