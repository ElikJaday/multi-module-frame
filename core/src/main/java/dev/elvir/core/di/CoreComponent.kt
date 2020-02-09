package dev.elvir.core.di

import android.content.Context
import dagger.Component
import dev.elvir.core.di.module.CoreModule
import dev.elvir.core.di.module.HttpClient
import dev.elvir.core.di.module.NetworModule
import javax.inject.Scope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class CoreScope

interface CoreAndroidApi{
    fun provideContext():Context
}

interface CoreNetworkApi{
    fun provideHttpClient():HttpClient
}

@Component(
    modules = [
        CoreModule::class,
        NetworModule::class
    ]
)
@CoreScope
interface CoreComponent : CoreAndroidApi,CoreNetworkApi {

}