package com.example.a1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EgAdapter(var egs: List<Eg>, var context: Context) : RecyclerView.Adapter<EgAdapter.MyViewHolder20>() {

    class MyViewHolder20(view: View): RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.eg_list_title)
        val kkal: TextView = view.findViewById(R.id.eg_list_kkal)
        val belki: TextView = view.findViewById(R.id.eg_list_belki)
        val zhiri: TextView = view.findViewById(R.id.eg_list_zhiri)
        val yglevodi: TextView = view.findViewById(R.id.eg_list_yglevodi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder20 {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.eg_list, parent, false)
        return MyViewHolder20(view)
    }

    override fun getItemCount(): Int {
        return egs.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder20, position: Int) {
        holder.title.text = egs[position].title
        holder.kkal.text = egs[position].kkal.toString()
        holder.belki.text = egs[position].belki.toString()
        holder.zhiri.text = egs[position].zhiri.toString()
        holder.yglevodi.text = egs[position].yglevodi.toString()
    }
}