import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.polipet.HistoriaGoldenRetrieverActivity
import com.example.polipet.HistoriaShihTzuActivity
import com.example.polipet.R

class RacaAdapter(private val racas: List<String>, private val context: Context) : RecyclerView.Adapter<RacaAdapter.RacaViewHolder>() {

    class RacaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nomeRaca: TextView = itemView.findViewById(R.id.nomeRaca)
        val opcoesLayout: LinearLayout = itemView.findViewById(R.id.opcoesLayout)
        val opcao1: Button = itemView.findViewById(R.id.opcao1)
        val opcao2: Button = itemView.findViewById(R.id.opcao2)
        val seta: ImageView = itemView.findViewById(R.id.seta)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RacaViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_raca_opcoes, parent, false)
        return RacaViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RacaViewHolder, position: Int) {
        val raca = racas[position]
        holder.nomeRaca.text = raca

        holder.seta.setOnClickListener {
            val isVisible = holder.opcoesLayout.visibility == View.VISIBLE
            holder.opcoesLayout.visibility = if (isVisible) View.GONE else View.VISIBLE
        }

        holder.opcao1.setOnClickListener {
            val intent = Intent(context, getHistoriaActivity(raca))
            context.startActivity(intent)
        }

        holder.opcao2.setOnClickListener {
            // Lógica para lidar com a opção 2
        }
    }

    override fun getItemCount() = racas.size

    private fun getHistoriaActivity(raca: String): Class<out AppCompatActivity>? {
        return when (raca) {
            "Shih Tzu" -> HistoriaShihTzuActivity::class.java
            "Golden Retriever" -> HistoriaGoldenRetrieverActivity::class.java
            // Adicione mais casos conforme necessário para outras raças
            else -> null
        }
    }

}
