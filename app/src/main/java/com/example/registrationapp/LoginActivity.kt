package com.example.registrationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    lateinit var logEmail: EditText
    lateinit var logPassword: EditText
    lateinit var logEnter: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        logEmail = findViewById(R.id.email)
        logPassword = findViewById(R.id.password)
        logEnter = findViewById(R.id.enter)

        logEnter.setOnClickListener {
            login()

        }

    }

    fun login() {
        val email = logEmail.text.toString()
        val password = logPassword.text.toString()
        for (us in Users.users.values) {

            if ((email == us.email) && (password == us.password)) {
                Toast.makeText(this, "congratulations", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, RestourantActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "nshavc tvyalnerov mard chka", Toast.LENGTH_SHORT).show()
            }
        }

    }
}