package com.example.a1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class OrAdapter(var ors: List<Or>, var context: Context) : RecyclerView.Adapter<OrAdapter.MyViewHolder23>() {

    class MyViewHolder23(view: View): RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.or_list_title)
        val kkal: TextView = view.findViewById(R.id.or_list_kkal)
        val belki: TextView = view.findViewById(R.id.or_list_belki)
        val zhiri: TextView = view.findViewById(R.id.or_list_zhiri)
        val yglevodi: TextView = view.findViewById(R.id.or_list_yglevodi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder23 {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.or_list, parent, false)
        return MyViewHolder23(view)
    }

    override fun getItemCount(): Int {
        return ors.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder23, position: Int) {
        holder.title.text = ors[position].title
        holder.kkal.text = ors[position].kkal.toString()
        holder.belki.text = ors[position].belki.toString()
        holder.zhiri.text = ors[position].zhiri.toString()
        holder.yglevodi.text = ors[position].yglevodi.toString()
    }
}