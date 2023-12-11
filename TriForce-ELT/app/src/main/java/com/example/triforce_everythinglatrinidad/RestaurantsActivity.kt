package com.example.triforce_everythinglatrinidad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class RestaurantsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurants)

        val dampa_details = findViewById<ImageView>(R.id.dampa_deets)
        dampa_details.setOnClickListener {
            val intent = Intent(this, dampaDetails::class.java)
            startActivity(intent)
        }

        val gardener_details = findViewById<ImageView>(R.id.gardeners_deets)
        gardener_details.setOnClickListener {
            val intent = Intent(this, gardenerDetails::class.java)
            startActivity(intent)
        }

        val kalei_details = findViewById<ImageView>(R.id.kalei_deets)
        kalei_details.setOnClickListener {
            val intent = Intent(this, kaleiDetails::class.java)
            startActivity(intent)
        }

        val love_details = findViewById<ImageView>(R.id.love_deets)
        love_details.setOnClickListener {
            val intent = Intent(this, loveDetails::class.java)
            startActivity(intent)
        }

        val table_details = findViewById<ImageView>(R.id.table_deets)
        table_details.setOnClickListener {
            val intent = Intent(this, tableDetails::class.java)
            startActivity(intent)
        }
    }
}