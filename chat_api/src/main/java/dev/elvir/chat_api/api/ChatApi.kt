package dev.elvir.chat_api.api

import dev.elvir.chat_api.repository.IChatRepository
import dev.elvir.chat_api.router.IRouter

interface ChatApi {

    fun provideChatRepository(): IChatRepository
    fun router(): IRouter

}