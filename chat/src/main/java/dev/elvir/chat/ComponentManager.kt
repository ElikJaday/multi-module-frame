package dev.elvir.chat

import dev.elvir.chat.di.ChatComponent
import dev.elvir.chat.di.DaggerChatComponent

object ComponentManager {
    var chatComponent: ChatComponent? = null

    fun plusChatComponent(): ChatComponent =
        chatComponent ?: DaggerChatComponent
            .builder()
            .build()
            .also { chatComponent = it }
}