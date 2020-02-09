package dev.elvir.authorization

import dev.elvir.authorization.di.AuthComponent
import dev.elvir.authorization.di.DaggerAuthComponent
import dev.elvir.chat.ComponentManager

object ComponentManager {
    var authComponent: AuthComponent? = null

    fun plusAuthComponent(): AuthComponent =
        authComponent ?: DaggerAuthComponent
            .builder()
            .chatApi(ComponentManager.plusChatComponent())
            .build()
            .also { authComponent = it }
}