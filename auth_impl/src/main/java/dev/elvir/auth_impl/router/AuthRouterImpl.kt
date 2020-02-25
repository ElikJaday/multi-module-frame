package dev.elvir.auth_impl.router

import android.content.Context
import android.content.Intent
import dev.elvir.auth_api.AuthRouter
import dev.elvir.auth_impl.ui.AuthActivity

class AuthRouterImpl : AuthRouter {
    override fun startAuthScreen(context: Context) {
        context.startActivity(
            Intent(
                context,
                AuthActivity::class.java
            )
        )
    }

}