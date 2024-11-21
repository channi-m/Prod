package com.example.a1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MeAdapter(var mes: List<Me>, var context: Context) : RecyclerView.Adapter<MeAdapter.MyViewHolder17>() {

    class MyViewHolder17(view: View): RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.me_list_title)
        val kkal: TextView = view.findViewById(R.id.me_list_kkal)
        val belki: TextView = view.findViewById(R.id.me_list_belki)
        val zhiri: TextView = view.findViewById(R.id.me_list_zhiri)
        val yglevodi: TextView = view.findViewById(R.id.me_list_yglevodi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder17 {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.me_list, parent, false)
        return MyViewHolder17(view)
    }

    override fun getItemCount(): Int {
        return mes.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder17, position: Int) {
        holder.title.text = mes[position].title
        holder.kkal.text = mes[position].kkal.toString()
        holder.belki.text = mes[position].belki.toString()
        holder.zhiri.text = mes[position].zhiri.toString()
        holder.yglevodi.text = mes[position].yglevodi.toString()
    }
}