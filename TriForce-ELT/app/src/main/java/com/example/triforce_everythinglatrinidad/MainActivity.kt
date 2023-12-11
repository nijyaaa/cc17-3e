package com.example.triforce_everythinglatrinidad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.triforce_everythinglatrinidad.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val cafeButton = findViewById<ImageButton>(R.id.cafeButton)
        cafeButton.setOnClickListener{
            val intent = Intent(this, CafeActivity:: class.java)
            startActivity(intent)
        }

        val restoButton = findViewById<ImageButton>(R.id.restoButton)
        restoButton.setOnClickListener{
            val intent = Intent(this, RestaurantsActivity:: class.java)
            startActivity(intent)
        }

        val spotsButton = findViewById<ImageButton>(R.id.spotsButton)
        spotsButton.setOnClickListener{
            val intent = Intent(this, SpotsActivity:: class.java)
            startActivity(intent)
        }

        val hotelsButton = findViewById<ImageButton>(R.id.hotelsButton)
        hotelsButton.setOnClickListener{
            val intent = Intent(this, HotelsActivity:: class.java)
            startActivity(intent)
        }

        val highlightButton = findViewById<ImageView>(R.id.imageView5)
        highlightButton.setOnClickListener {
            val intent = Intent(this, kaiDetails::class.java)
            startActivity(intent)
        }
    }
}