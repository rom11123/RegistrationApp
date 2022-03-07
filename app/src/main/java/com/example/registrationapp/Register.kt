package com.example.registrationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Register : AppCompatActivity() {

    lateinit var regEmail:EditText
    lateinit var regPassword:EditText
    lateinit var regConfPass:EditText
    lateinit var regOk:Button
//    lateinit var users:Users
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        regEmail = findViewById(R.id.edEmail)
        regPassword = findViewById(R.id.edPassword)
        regConfPass = findViewById(R.id.confirm)
        regOk = findViewById(R.id.edOk)

        regOk.setOnClickListener {
            registration()
        }

    }

    fun registration(){
        val email = regEmail.text.toString()
        val password = regPassword.text.toString()
        val confirm = regConfPass.text.toString()

        if (email.length<3 && password.length<3 ){
            Toast.makeText(this,"email and password error",Toast.LENGTH_SHORT).show()
        }
        if (password!=confirm){
            Toast.makeText(this,"confirm and password",Toast.LENGTH_SHORT).show()
        }
        if (email.isNotEmpty()&& password.isNotEmpty() && confirm.isNotEmpty()){
            val user = User(email, password)
            Users.users[email] = user
            Toast.makeText(this,"shnorhavorum enq",Toast.LENGTH_SHORT).show()
        }

    }
}