package com.example.triforce_everythinglatrinidad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class CafeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cafe)

        val sinner_details = findViewById<ImageView>(R.id.sinner_deets)
        sinner_details.setOnClickListener {
            val intent = Intent(this, sinnerDetails::class.java)
            startActivity(intent)
        }

        val half_details = findViewById<ImageView>(R.id.half_deets)
        half_details.setOnClickListener {
            val intent = Intent(this, halfDetails::class.java)
            startActivity(intent)
        }

        val kai_details = findViewById<ImageView>(R.id.kai_deets)
        kai_details.setOnClickListener {
            val intent = Intent(this, kaiDetails::class.java)
            startActivity(intent)
        }

        val fiika_details = findViewById<ImageView>(R.id.fiika_deets)
        fiika_details.setOnClickListener {
            val intent = Intent(this, fiikaDetails::class.java)
            startActivity(intent)
        }

        val kape_details = findViewById<ImageView>(R.id.kape_an_deets)
        kape_details.setOnClickListener {
            val intent = Intent(this, kapeDetails::class.java)
            startActivity(intent)
        }
    }
}