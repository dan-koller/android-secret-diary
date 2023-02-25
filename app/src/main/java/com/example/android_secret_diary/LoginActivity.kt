package com.example.android_secret_diary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    /**
     * When the app is first opened, the onCreate method is called. This method is used to
     * initialize the login activity. In this case, we are setting up the UI, and setting up the
     * password and validation.
     * @param savedInstanceState The saved state of the app, if any
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val editText = findViewById<EditText>(R.id.etPin)
        findViewById<Button>(R.id.btnLogin).setOnClickListener {
            if (editText.text.toString() == "1234") {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish() // Destroy the activity on a successful login
            } else {
                editText.error = "Wrong PIN!"
            }
        }
    }
}