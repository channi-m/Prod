package com.example.a1

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class TipsAdapter(var tips: List<Tip>, var context: Context) : RecyclerView.Adapter<TipsAdapter.MyViewHolder2>() {



    inner class MyViewHolder2(view: View): RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.tips_list_image)
        val titles: TextView = view.findViewById(R.id.tips_list_titles)
        var btn: Button = view.findViewById(R.id.podrobno)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder2 {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.tip_in_ekran, parent, false)
        return MyViewHolder2(view)
    }

    override fun getItemCount(): Int {
        return tips.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder2, position: Int) {
        holder.titles.text = tips[position].titles

        val imageId = context.resources.getIdentifier(
            tips[position].image,
            "drawable",
            context.packageName
        )

        holder.image.setImageResource(imageId)

        holder.btn.setOnClickListener {
            var buttonId = tips[position].num
            val intent = when (buttonId) {
                1 -> Intent(context, ItemsActivity::class.java)
                2 -> Intent(context, SecondActivity::class.java)
                3 -> Intent(context, GarActivity::class.java)
                4 -> Intent(context, ZagoActivity::class.java)
                5 -> Intent(context, KasActivity::class.java)
                6 -> Intent(context, SalActivity::class.java)
                7 -> Intent(context, ZakActivity::class.java)
                8 -> Intent(context, PoluActivity::class.java)
                9 -> Intent(context, SouActivity::class.java)
                10 -> Intent(context, VipActivity::class.java)
                11 -> Intent(context, DesActivity::class.java)
                12 -> Intent(context, VarActivity::class.java)
                13 -> Intent(context, DrActivity::class.java)
                else -> null
            }
            intent?.let { context.startActivity(it) }
            context.startActivity(intent)
        }
    }
}
