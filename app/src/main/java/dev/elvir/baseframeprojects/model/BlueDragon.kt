package dev.elvir.baseframeprojects.model

import android.util.Log
import javax.inject.Inject

class BlueDragon @Inject constructor() {
    fun doSomething() {
        Log.i("InfoDragon", "Blue dragon is flying")
    }
}