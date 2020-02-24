package dev.elvir.chat.di

import dagger.Component
import dev.elvir.chat.ui.ChatActivity
import dev.elvir.chat_api.api.ChatApi
import javax.inject.Scope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class ChatScope

@Component(
    modules = [
        ChatModule::class
    ]
)
@ChatScope
interface ChatComponent : ChatApi {

    fun inject(chatActivity: ChatActivity)
}
