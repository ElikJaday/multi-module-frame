package dev.elvir.baseframeprojects.di

import dagger.Component
import dev.elvir.authorization.di.AuthApi
import dev.elvir.baseframeprojects.MainApplication
import javax.inject.Scope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class AppScope

@Component(
    modules = [
        AppModule::class
    ], dependencies = [
        AuthApi::class
    ]
)

@AppScope
interface AppComponent {
    fun inject(application: MainApplication)
}