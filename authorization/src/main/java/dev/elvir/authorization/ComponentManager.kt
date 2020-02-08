package dev.elvir.authorization

import dev.elvir.authorization.di.AuthComponent
import dev.elvir.authorization.di.DaggerAuthComponent


object ComponentManager {
     var authComponent: AuthComponent? = null

    fun plusAuthComponent(): AuthComponent =
        authComponent ?: DaggerAuthComponent
            .builder()
            .build()
            .also { authComponent = it }
}