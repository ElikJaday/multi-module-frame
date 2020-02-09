package dev.elvir.authorization.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import dev.elvir.authorization.ComponentManager
import dev.elvir.authorization.R
import dev.elvir.chat.di.ChatRepository
import dev.elvir.chat.ui.ChatActivity
import kotlinx.android.synthetic.main.activity_sign_in.*
import javax.inject.Inject

class SignInActivity : AppCompatActivity() {


    @Inject
    lateinit var value: String

    @Inject
    lateinit var chatRepository: ChatRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        ComponentManager.authComponent.also { it!!.inject(this) }

        btnEnter.setOnClickListener {
            Toast.makeText(this, chatRepository.name, Toast.LENGTH_LONG).show()
            startActivity(Intent(this, ChatActivity::class.java))

        }

    }
}
