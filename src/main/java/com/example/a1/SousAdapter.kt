package com.example.a1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SousAdapter(var souss: List<Sous>, var context: Context) : RecyclerView.Adapter<SousAdapter.MyViewHolder10>() {

    class MyViewHolder10(view: View): RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.sous_list_title)
        val kkal: TextView = view.findViewById(R.id.sous_list_kkal)
        val belki: TextView = view.findViewById(R.id.sous_list_belki)
        val zhiri: TextView = view.findViewById(R.id.sous_list_zhiri)
        val yglevodi: TextView = view.findViewById(R.id.sous_list_yglevodi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder10 {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.sous_list, parent, false)
        return MyViewHolder10(view)
    }

    override fun getItemCount(): Int {
        return souss.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder10, position: Int) {
        holder.title.text = souss[position].title
        holder.kkal.text = souss[position].kkal.toString()
        holder.belki.text = souss[position].belki.toString()
        holder.zhiri.text = souss[position].zhiri.toString()
        holder.yglevodi.text = souss[position].yglevodi.toString()
    }
}