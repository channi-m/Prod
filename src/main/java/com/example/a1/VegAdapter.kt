package com.example.a1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class VegAdapter(var vegs: List<Veg>, var context: Context) : RecyclerView.Adapter<VegAdapter.MyViewHolder22>() {

    class MyViewHolder22(view: View): RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.veg_list_title)
        val kkal: TextView = view.findViewById(R.id.veg_list_kkal)
        val belki: TextView = view.findViewById(R.id.veg_list_belki)
        val zhiri: TextView = view.findViewById(R.id.veg_list_zhiri)
        val yglevodi: TextView = view.findViewById(R.id.veg_list_yglevodi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder22 {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.veg_list, parent, false)
        return MyViewHolder22(view)
    }

    override fun getItemCount(): Int {
        return vegs.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder22, position: Int) {
        holder.title.text = vegs[position].title
        holder.kkal.text = vegs[position].kkal.toString()
        holder.belki.text = vegs[position].belki.toString()
        holder.zhiri.text = vegs[position].zhiri.toString()
        holder.yglevodi.text = vegs[position].yglevodi.toString()
    }
}