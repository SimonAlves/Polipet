package com.example.polipet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PetGato : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pet_gato)
        // Habilitar a seta de voltar na ActionBar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}