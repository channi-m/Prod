package com.example.a1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ZagsAdapter(var zags: List<Zago>, var context: Context) : RecyclerView.Adapter<ZagsAdapter.MyViewHolder5>() {

    class MyViewHolder5(view: View): RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.zago_list_title)
        val kkal: TextView = view.findViewById(R.id.zago_list_kkal)
        val belki: TextView = view.findViewById(R.id.zago_list_belki)
        val zhiri: TextView = view.findViewById(R.id.zago_list_zhiri)
        val yglevodi: TextView = view.findViewById(R.id.zago_list_yglevodi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder5 {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.zago_list, parent, false)
        return MyViewHolder5(view)
    }

    override fun getItemCount(): Int {
        return zags.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder5, position: Int) {
        holder.title.text = zags[position].title
        holder.kkal.text = zags[position].kkal.toString()
        holder.belki.text = zags[position].belki.toString()
        holder.zhiri.text = zags[position].zhiri.toString()
        holder.yglevodi.text = zags[position].yglevodi.toString()
    }
}