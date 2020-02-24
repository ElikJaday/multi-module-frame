package dev.elvir.chat.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.elvir.chat.ComponentManager
import dev.elvir.chat.R
import dev.elvir.chat_api.router.IRouter
import kotlinx.android.synthetic.main.activity_chat.*
import javax.inject.Inject

class ChatActivity : AppCompatActivity() {
    @Inject
    lateinit var router: IRouter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)
        ComponentManager.chatComponent.also { it!!.inject(this) }
        btnChat.setOnClickListener {
            router.start(this)
        }
    }

}
