package com.example.elt2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val loginButton = findViewById<Button>(R.id.buttonLogin)
        loginButton.setOnClickListener{
            val Intent = Intent(this,ELTDashboard::class.java)
            startActivity(Intent)
        }
    }
}