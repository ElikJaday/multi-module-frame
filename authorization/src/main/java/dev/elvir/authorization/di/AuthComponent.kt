package dev.elvir.authorization.di

import dagger.Component
import dev.elvir.authorization.ui.SignInActivity
import javax.inject.Scope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class AuthScope

interface AuthApi

@Component(
    modules = [
        AuthModule::class
    ]
)
@AuthScope
interface AuthComponent : AuthApi {
    fun inject(signInActivity: SignInActivity)
}