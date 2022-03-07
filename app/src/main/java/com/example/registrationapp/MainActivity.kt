package com.example.registrationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var sign:Button
    lateinit var signUp:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sign = findViewById(R.id.sign)
        signUp = findViewById(R.id.signUp)

        sign.setOnClickListener {
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)

        }

        signUp.setOnClickListener {
            val intent = Intent(this,Register::class.java)
            startActivity(intent)
        }
    }
}