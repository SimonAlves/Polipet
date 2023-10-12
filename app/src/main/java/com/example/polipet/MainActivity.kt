package com.example.polipet

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vamosLaButton = findViewById<Button>(R.id.enviarButton)

        vamosLaButton.setOnClickListener {
            val intent = Intent(this, EscolhaPetActivity::class.java)
            startActivity(intent)
        }
    }
}