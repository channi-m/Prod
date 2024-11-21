package com.example.a1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ZakAdapter(var zaks: List<Zak>, var context: Context) : RecyclerView.Adapter<ZakAdapter.MyViewHolder8>() {

    class MyViewHolder8(view: View): RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.zak_list_title)
        val kkal: TextView = view.findViewById(R.id.zak_list_kkal)
        val belki: TextView = view.findViewById(R.id.zak_list_belki)
        val zhiri: TextView = view.findViewById(R.id.zak_list_zhiri)
        val yglevodi: TextView = view.findViewById(R.id.zak_list_yglevodi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder8 {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.zak_list, parent, false)
        return MyViewHolder8(view)
    }

    override fun getItemCount(): Int {
        return zaks.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder8, position: Int) {
        holder.title.text = zaks[position].title
        holder.kkal.text = zaks[position].kkal.toString()
        holder.belki.text = zaks[position].belki.toString()
        holder.zhiri.text = zaks[position].zhiri.toString()
        holder.yglevodi.text = zaks[position].yglevodi.toString()
    }
}