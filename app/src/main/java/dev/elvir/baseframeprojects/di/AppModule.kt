package dev.elvir.baseframeprojects.di

import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @Provides
    fun provideAppString(): String = "hello Application"

}