package com.example.elt2

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
            val Intent = Intent(this, CoffeeShop:: class.java)
            startActivity(Intent)
        }

        val restaurantButton = findViewById<ImageButton>(R.id.imageButton2)
        restaurantButton.setOnClickListener{
            val Intent = Intent(this, Restaurants::class.java)
            startActivity(Intent)
        }

        val spotsButton = findViewById<ImageButton>(R.id.imageButton3)
        spotsButton.setOnClickListener{
            val Intent = Intent(this, TouristSpots::class.java)
            startActivity(Intent)
        }
    }
}