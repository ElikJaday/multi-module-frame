package dev.elvir.core.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CoreModule(
    private val context: Context
){

    @Provides
    @Singleton
    fun getContext() = context

}