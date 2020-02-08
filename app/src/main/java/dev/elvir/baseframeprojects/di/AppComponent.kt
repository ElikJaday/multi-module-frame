package dev.elvir.baseframeprojects.di

import dagger.Component
import dev.elvir.authorization.di.AuthApi
import dev.elvir.baseframeprojects.MainApplication
import dev.elvir.chat.di.ChatApi
import javax.inject.Scope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class AppScope

@Component(
    modules = [
        AppModule::class
    ],
    dependencies = [
        AuthApi::class,
        ChatApi::class
    ]
)
@AppScope
interface AppComponent {
    fun inject(application: MainApplication)
}