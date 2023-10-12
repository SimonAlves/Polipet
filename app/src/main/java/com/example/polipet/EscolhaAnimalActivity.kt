package com.example.polipet

import RacaAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EscolhaAnimalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_escolha_animal)

        val racas = listOf("Vira-latas (SRD)", "Shih Tzu", "Golden Retriever", "Labrador Retriever", "Bulldog", "Poodle","Pomerânia (Spitz Alemão)" +
                "Bulldog Francês","Rottweiler","Pug","Pastor Alemão","Yorkshire Terrier","Border Collie","PitBull","Dachshund","Schnauzer","Poodle",
            "Labrador" )

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RacaAdapter(racas,this)
    }
}