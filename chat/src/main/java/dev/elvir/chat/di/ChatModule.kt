package dev.elvir.chat.di

import android.content.Context
import android.content.Intent
import dagger.Module
import dagger.Provides
import dev.elvir.chat.ui.ChatActivity
import dev.elvir.chat_api.repository.IChatRepository
import dev.elvir.chat_api.router.IRouter

@Module
class ChatModule {

    @Provides
    @ChatScope
    fun chatepository(): IChatRepository =
        ChatRepository("Chat Api shared depdendecies ")

    @Provides
    @ChatScope
    fun provideRouter(): IRouter =
        ChatRouter()

}


data class ChatRepository(override var name: String) : IChatRepository

class ChatRouter : IRouter {
    override fun start(context: Context) {
        context.startActivity(
            Intent(context, ChatActivity::class.java)
        )
    }


}