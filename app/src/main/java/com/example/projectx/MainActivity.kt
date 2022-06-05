package com.example.projectx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailText = findViewById<TextInputEditText>(R.id.usernametext)
        val passwordText = findViewById<TextInputEditText>(R.id.passwordtext)
        val signInButton = findViewById<Button>(R.id.SignInButton)
        val registerText = findViewById<TextView>(R.id.registerText)

        signInButton.setOnClickListener {
            val result = emailText.text.toString().trim() == "testuser" && passwordText.text.toString().trim() == "testpass"
           if (result)
           {
/*            val intent = Intent(this, ::class.java)
               startActivity(intent)*/
           }
            else
                Toast.makeText(this,"Authentication failed",Toast.LENGTH_SHORT).show()
        }
        registerText.setOnClickListener {
            Toast.makeText(this,"creating new user",Toast.LENGTH_SHORT).show()
            val intent = Intent(this,NewUserRegistration::class.java)
            startActivity(intent)
        }
    }
}