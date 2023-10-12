package com.example.polipet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RacaAdapter(private val racas: List<String>) : RecyclerView.Adapter<RacaAdapter.RacaViewHolder>() {

    class RacaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nomeRaca: TextView = itemView.findViewById(R.id.nomeRaca)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RacaViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_raca, parent, false)
        return RacaViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RacaViewHolder, position: Int) {
        holder.nomeRaca.text = racas[position]
    }

    override fun getItemCount() = racas.size
}