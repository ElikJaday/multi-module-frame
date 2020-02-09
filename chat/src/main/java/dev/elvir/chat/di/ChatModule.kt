package dev.elvir.chat.di

import dagger.Module
import dagger.Provides

@Module
class ChatModule {

    @Provides
    @ChatScope
    fun chatepository(): ChatRepository =
        ChatRepository("Chat Api shared depdendecies ")

}

data class ChatRepository(var name: String)