package dev.elvir.chat.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.elvir.chat.R

class ChatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)
        // ComponentManager.plusChatComponent().inject(this)
    }
}
