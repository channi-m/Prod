package com.example.a1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FruAdapter(var frus: List<Fru>, var context: Context) : RecyclerView.Adapter<FruAdapter.MyViewHolder24>() {

    class MyViewHolder24(view: View): RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.fru_list_title)
        val kkal: TextView = view.findViewById(R.id.fru_list_kkal)
        val belki: TextView = view.findViewById(R.id.fru_list_belki)
        val zhiri: TextView = view.findViewById(R.id.fru_list_zhiri)
        val yglevodi: TextView = view.findViewById(R.id.fru_list_yglevodi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder24 {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fru_list, parent, false)
        return MyViewHolder24(view)
    }

    override fun getItemCount(): Int {
        return frus.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder24, position: Int) {
        holder.title.text = frus[position].title
        holder.kkal.text = frus[position].kkal.toString()
        holder.belki.text = frus[position].belki.toString()
        holder.zhiri.text = frus[position].zhiri.toString()
        holder.yglevodi.text = frus[position].yglevodi.toString()
    }
}