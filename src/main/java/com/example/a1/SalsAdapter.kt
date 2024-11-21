package com.example.a1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SalsAdapter(var sals: List<Sal>, var context: Context) : RecyclerView.Adapter<SalsAdapter.MyViewHolder7>() {

    class MyViewHolder7(view: View): RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.sal_list_title)
        val kkal: TextView = view.findViewById(R.id.sal_list_kkal)
        val belki: TextView = view.findViewById(R.id.sal_list_belki)
        val zhiri: TextView = view.findViewById(R.id.sal_list_zhiri)
        val yglevodi: TextView = view.findViewById(R.id.sal_list_yglevodi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder7 {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.sal_list, parent, false)
        return MyViewHolder7(view)
    }

    override fun getItemCount(): Int {
        return sals.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder7, position: Int) {
        holder.title.text = sals[position].title
        holder.kkal.text = sals[position].kkal.toString()
        holder.belki.text = sals[position].belki.toString()
        holder.zhiri.text = sals[position].zhiri.toString()
        holder.yglevodi.text = sals[position].yglevodi.toString()
    }
}