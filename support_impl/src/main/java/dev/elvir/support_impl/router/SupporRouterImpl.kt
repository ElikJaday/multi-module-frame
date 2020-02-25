package dev.elvir.support_impl.router

import android.content.Context
import android.content.Intent
import dev.elvir.support_api.SupportRouter
import dev.elvir.support_impl.ui.SupportActivity

class SupporRouterImpl : SupportRouter {
    override fun startSupportScreen(context: Context) {
        context.startActivity(
            Intent(
                context,
                SupportActivity::class.java
            )
        )
    }

}