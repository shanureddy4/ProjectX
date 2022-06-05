package com.example.projectx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NewUserRegistration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_user_registration)
        val register = findViewById<Button>(R.id.registerBtn)
        register.setOnClickListener {
            val result = true
            //TODO validate form
            if(result){
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}