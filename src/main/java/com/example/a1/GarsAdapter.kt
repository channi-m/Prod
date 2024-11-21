package com.example.a1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GarsAdapter(var gars: List<Gar>, var context: Context) : RecyclerView.Adapter<GarsAdapter.MyViewHolder4>() {

    class MyViewHolder4(view: View): RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.gar_list_title)
        val kkal: TextView = view.findViewById(R.id.gar_list_kkal)
        val belki: TextView = view.findViewById(R.id.gar_list_belki)
        val zhiri: TextView = view.findViewById(R.id.gar_list_zhiri)
        val yglevodi: TextView = view.findViewById(R.id.gar_list_yglevodi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder4 {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.gar_list, parent, false)
        return MyViewHolder4(view)
    }

    override fun getItemCount(): Int {
        return gars.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder4, position: Int) {
        holder.title.text = gars[position].title
        holder.kkal.text = gars[position].kkal.toString()
        holder.belki.text = gars[position].belki.toString()
        holder.zhiri.text = gars[position].zhiri.toString()
        holder.yglevodi.text = gars[position].yglevodi.toString()
    }
}