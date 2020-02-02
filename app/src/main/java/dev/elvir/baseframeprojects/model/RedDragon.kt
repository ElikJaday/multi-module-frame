package dev.elvir.baseframeprojects.model

import android.util.Log
import javax.inject.Inject

class RedDragon @Inject constructor() {
    fun doSomething() {
        Log.i("InfoDragon", "Red dragon is flying")
    }
}