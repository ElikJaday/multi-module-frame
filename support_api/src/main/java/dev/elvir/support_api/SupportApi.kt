package dev.elvir.support_api

import android.content.Context

interface SupportApi {
    fun provideSupportRouter() : SupportRouter

}

interface SupportRouter {
    fun startSupportScreen(context: Context)
}

