package dev.elvir.auth_impl.di

import dagger.Component
import dagger.Module
import dagger.Provides
import dev.elvir.auth_api.AuthApi
import dev.elvir.auth_api.AuthRouter
import dev.elvir.auth_impl.router.AuthRouterImpl
import dev.elvir.auth_impl.ui.AuthActivity
import dev.elvir.support_api.SupportApi
import javax.inject.Scope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class AuthScope


@Component(
    modules = [
        AuthModule::class
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
    fun proideAuthRouter(): AuthRouter = AuthRouterImpl()
}


interface Dependencies {

}