package com.example.triforce_everythinglatrinidad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class HotelsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotels)

        val homestay_details = findViewById<ImageView>(R.id.homestay_deets)
        homestay_details.setOnClickListener {
            val intent = Intent(this, homestayDetails::class.java)
            startActivity(intent)
        }

        val garden_details = findViewById<ImageView>(R.id.garden_deets)
        garden_details.setOnClickListener {
            val intent = Intent(this, gardenDetails::class.java)
            startActivity(intent)
        }

        val red_details = findViewById<ImageView>(R.id.redbarn_deets)
        red_details.setOnClickListener {
            val intent = Intent(this, redDetails::class.java)
            startActivity(intent)
        }

        val wanay_details = findViewById<ImageView>(R.id.wanay_deets)
        wanay_details.setOnClickListener {
            val intent = Intent(this, wanayDetails::class.java)
            startActivity(intent)
        }

        val elegant_details = findViewById<ImageView>(R.id.elegant_deets)
        elegant_details.setOnClickListener {
            val intent = Intent(this, elegantDetails::class.java)
            startActivity(intent)
        }

    }
}