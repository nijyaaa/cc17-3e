package com.example.triforce_everythinglatrinidad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SpotsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spots)


        val strawberry_details = findViewById<ImageView>(R.id.strawberry_deets)
        strawberry_details.setOnClickListener {
            val intent = Intent(this, strawberryDetails::class.java)
            startActivity(intent)
        }

        val kalugong_details = findViewById<ImageView>(R.id.kalugong_deets)
        kalugong_details.setOnClickListener {
            val intent = Intent(this, kalugongDetails::class.java)
            startActivity(intent)
        }

        val sunflower_details = findViewById<ImageView>(R.id.sunflower_deets)
        sunflower_details.setOnClickListener {
            val intent = Intent(this, sunflowerDetails::class.java)
            startActivity(intent)
        }

        val valley_details = findViewById<ImageView>(R.id.valley_deets)
        valley_details.setOnClickListener {
            val intent = Intent(this, colorsDetails::class.java)
            startActivity(intent)
        }

        val yangbew_details = findViewById<ImageView>(R.id.yangbew_deets)
        yangbew_details.setOnClickListener {
            val intent = Intent(this, yangbewDetails::class.java)
            startActivity(intent)
        }
    }
}