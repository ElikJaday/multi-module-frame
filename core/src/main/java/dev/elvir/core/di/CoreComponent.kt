package dev.elvir.core.di

import dagger.Component
import dev.elvir.core.di.module.CoreModule
import dev.elvir.core.di.module.NetworModule
import javax.inject.Scope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class CoreScope

interface CoreApi

@Component(
    modules = [
        CoreModule::class,
        NetworModule::class
    ]
)
@CoreScope
interface CoreComponent : CoreApi {

}