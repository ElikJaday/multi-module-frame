package dev.elvir.chat.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import dev.elvir.chat.ComponentManager
import dev.elvir.chat.R
import kotlinx.android.synthetic.main.activity_chat.*
import javax.inject.Inject

class ChatActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)
        ComponentManager.chatComponent.also { it!!.inject(this) }
        btnChat.setOnClickListener {
          //  Toast.makeText(this, , Toast.LENGTH_SHORT).show()
        }
    }

}
