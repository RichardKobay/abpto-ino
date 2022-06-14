package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnabout_us = findViewById<Button>(R.id.btnAboutUs)
        val btncredits = findViewById<Button>(R.id.btnCredits)
        val btnespecial = findViewById<Button>(R.id.btnMenu)
        val btnantojitos = findViewById<Button>(R.id.btnAntojitos)

        btnabout_us.setOnClickListener {
            val intent = Intent(this, about_us::class.java)
            startActivity(intent)
        }

        btncredits.setOnClickListener {
            val intent = Intent(this, credits::class.java)
            startActivity(intent)
        }

        btnespecial.setOnClickListener {
            val intent = Intent(this, especial::class.java)
            startActivity(intent)
        }

        btnantojitos.setOnClickListener {
            val intent = Intent(this, antojitos::class.java)
            startActivity(intent)
        }


    }
}