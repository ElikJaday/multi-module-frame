package dev.elvir.baseframeprojects.di

import dagger.Component
import dev.elvir.baseframeprojects.MainActivity
import dev.elvir.baseframeprojects.model.BlueDragon
import dev.elvir.baseframeprojects.model.RedDragon

@Component
interface DragonComponent {

    fun inject(activity: MainActivity)
    fun getRedDragon(): RedDragon
    fun getBlueDragon(): BlueDragon

}