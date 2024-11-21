package com.example.a1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KolAdapter(var kols: List<Kol>, var context: Context) : RecyclerView.Adapter<KolAdapter.MyViewHolder17>() {

    class MyViewHolder17(view: View): RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.kol_list_title)
        val kkal: TextView = view.findViewById(R.id.kol_list_kkal)
        val belki: TextView = view.findViewById(R.id.kol_list_belki)
        val zhiri: TextView = view.findViewById(R.id.kol_list_zhiri)
        val yglevodi: TextView = view.findViewById(R.id.kol_list_yglevodi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder17 {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.kol_list, parent, false)
        return MyViewHolder17(view)
    }

    override fun getItemCount(): Int {
        return kols.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder17, position: Int) {
        holder.title.text = kols[position].title
        holder.kkal.text = kols[position].kkal.toString()
        holder.belki.text = kols[position].belki.toString()
        holder.zhiri.text = kols[position].zhiri.toString()
        holder.yglevodi.text = kols[position].yglevodi.toString()
    }
}