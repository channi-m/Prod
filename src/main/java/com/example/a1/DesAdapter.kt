package com.example.a1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DesAdapter(var dess: List<Des>, var context: Context) : RecyclerView.Adapter<DesAdapter.MyViewHolder12>() {

    class MyViewHolder12(view: View): RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.des_list_title)
        val kkal: TextView = view.findViewById(R.id.des_list_kkal)
        val belki: TextView = view.findViewById(R.id.des_list_belki)
        val zhiri: TextView = view.findViewById(R.id.des_list_zhiri)
        val yglevodi: TextView = view.findViewById(R.id.des_list_yglevodi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder12 {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.des_list, parent, false)
        return MyViewHolder12(view)
    }

    override fun getItemCount(): Int {
        return dess.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder12, position: Int) {
        holder.title.text = dess[position].title
        holder.kkal.text = dess[position].kkal.toString()
        holder.belki.text = dess[position].belki.toString()
        holder.zhiri.text = dess[position].zhiri.toString()
        holder.yglevodi.text = dess[position].yglevodi.toString()
    }
}