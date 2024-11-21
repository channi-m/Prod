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

class ProdAdapter(var prods: List<Prod>, var context: Context) : RecyclerView.Adapter<ProdAdapter.ViewHolder>() {


    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.prods_list_image)
        val titles: TextView = view.findViewById(R.id.prods_list_titles)
        var btn: Button = view.findViewById(R.id.podrobnos)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.prod_list, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return prods.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.titles.text = prods[position].titles

        val imageId = context.resources.getIdentifier(
            prods[position].image,
            "drawable",
            context.packageName
        )

        holder.image.setImageResource(imageId)

        holder.btn.setOnClickListener {
            var buttonId = prods[position].num
            val intent = when (buttonId) {
                1 -> Intent(context, BrActivity::class.java)
                2 -> Intent(context, MolActivity::class.java)
                3 -> Intent(context, MeActivity::class.java)
                4 -> Intent(context, KolActivity::class.java)
                5 -> Intent(context, FiActivity::class.java) //
                6 -> Intent(context, EgActivity::class.java)
                7 -> Intent(context, OilActivity::class.java)
                8 -> Intent(context, VegActivity::class.java)
                9 -> Intent(context, FruActivity::class.java)
                10 -> Intent(context, OrActivity::class.java)
                else -> null
            }
            intent?.let { context.startActivity(it) }
            context.startActivity(intent)
        }
    }
}