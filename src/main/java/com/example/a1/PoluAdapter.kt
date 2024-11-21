package com.example.a1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PoluAdapter(var pols: List<Polu>, var context: Context) : RecyclerView.Adapter<PoluAdapter.MyViewHolder9>() {

    class MyViewHolder9(view: View): RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.polu_list_title)
        val kkal: TextView = view.findViewById(R.id.polu_list_kkal)
        val belki: TextView = view.findViewById(R.id.polu_list_belki)
        val zhiri: TextView = view.findViewById(R.id.polu_list_zhiri)
        val yglevodi: TextView = view.findViewById(R.id.polu_list_yglevodi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder9 {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.polu_list, parent, false)
        return MyViewHolder9(view)
    }

    override fun getItemCount(): Int {
        return pols.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder9, position: Int) {
        holder.title.text = pols[position].title
        holder.kkal.text = pols[position].kkal.toString()
        holder.belki.text = pols[position].belki.toString()
        holder.zhiri.text = pols[position].zhiri.toString()
        holder.yglevodi.text = pols[position].yglevodi.toString()
    }
}