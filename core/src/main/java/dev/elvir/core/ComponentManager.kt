package dev.elvir.core

import android.content.Context
import dev.elvir.core.di.CoreComponent
import dev.elvir.core.di.DaggerCoreComponent
import dev.elvir.core.di.module.CoreModule

/**
 * @author Elvir
 * Created by ElikJaday on 08/02/2020.
 * @see
 * Visit my GitHub
 * https://github.com/ElikJaday
 */
object ComponentManager {

    private var coreComponent: CoreComponent? = null

    fun plusCoreComponent(
        context: Context
    ): CoreComponent = DaggerCoreComponent
        .builder()
        .coreModule(CoreModule(context))
        .build()
        .also { coreComponent = it }
}