package dev.elvir.authorization.di

import dagger.Module
import dagger.Provides

@Module
class AuthModule {

    @Provides
    @AuthScope
    fun provideAuthString(): String = "Helloo auth"

}