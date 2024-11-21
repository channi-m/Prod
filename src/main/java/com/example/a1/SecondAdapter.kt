package com.example.a1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SecondAdapter(var seconds: List<Second>, var context: Context) : RecyclerView.Adapter<SecondAdapter.MyViewHolder3>() {

    class MyViewHolder3(view: View): RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.second_list_title)
        val kkal: TextView = view.findViewById(R.id.second_list_kkal)
        val belki: TextView = view.findViewById(R.id.second_list_belki)
        val zhiri: TextView = view.findViewById(R.id.second_list_zhiri)
        val yglevodi: TextView = view.findViewById(R.id.second_list_yglevodi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder3 {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.second_list, parent, false)
        return MyViewHolder3(view)
    }

    override fun getItemCount(): Int {
        return seconds.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder3, position: Int) {
        holder.title.text = seconds[position].title
        holder.kkal.text = seconds[position].kkal.toString()
        holder.belki.text = seconds[position].belki.toString()
        holder.zhiri.text = seconds[position].zhiri.toString()
        holder.yglevodi.text = seconds[position].yglevodi.toString()
    }
}