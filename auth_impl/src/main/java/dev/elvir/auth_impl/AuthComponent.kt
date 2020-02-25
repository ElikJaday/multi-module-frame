package dev.elvir.auth_impl

import dagger.Component
import dagger.Module
import dagger.Provides
import dev.elvir.auth_api.AuthApi
import dev.elvir.support_api.SupportApi
import javax.inject.Scope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class AuthScope


@Component(
    modules = [
        AuthModule::class
    ],
    dependencies = [
        SupportApi::class
    ]
)
@AuthScope
interface AuthComponent : AuthApi {
    fun inject(authActivity: AuthActivity)
}


@Module
class AuthModule {
    @Provides
    @AuthScope
    fun provideString() = "Hello Auth "
}