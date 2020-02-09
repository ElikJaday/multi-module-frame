package dev.elvir.chat.di

import dagger.Component
import dev.elvir.chat.ui.ChatActivity
import javax.inject.Scope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class ChatScope

interface ChatApi{
    fun provideChatRepository():ChatRepository
}

@Component(
    modules = [
        ChatModule::class
    ]
)
@ChatScope
interface ChatComponent : ChatApi {

    fun inject(chatActivity: ChatActivity)
}
