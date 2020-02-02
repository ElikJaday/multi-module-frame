package dev.elvir.baseframeprojects

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.elvir.baseframeprojects.di.DaggerDragonComponent
import dev.elvir.baseframeprojects.di.DragonComponent
import dev.elvir.baseframeprojects.model.BlueDragon
import dev.elvir.baseframeprojects.model.RedDragon
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    lateinit var component: DragonComponent
    @Inject
    lateinit var redDragon: RedDragon
    @Inject
    lateinit var blueDragon: BlueDragon


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        component = DaggerDragonComponent.create()
        component.inject(this)
        redDragon.doSomething()
        blueDragon.doSomething()

    }
}
