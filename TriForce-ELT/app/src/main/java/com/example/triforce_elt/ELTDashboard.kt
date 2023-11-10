package com.example.triforce_elt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class ELTDashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eltdashboard)

        val coffeeButton = findViewById<ImageButton>(R.id.imageButton1)
        coffeeButton.setOnClickListener{
            val Intent = Intent(this, CoffeeSpots::class.java)
            startActivity(Intent)
        }
    }
}