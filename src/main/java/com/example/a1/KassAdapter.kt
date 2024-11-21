package com.example.a1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KassAdapter(var kass: List<Kas>, var context: Context) : RecyclerView.Adapter<KassAdapter.MyViewHolder6>() {

    class MyViewHolder6(view: View): RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.kas_list_title)
        val kkal: TextView = view.findViewById(R.id.kas_list_kkal)
        val belki: TextView = view.findViewById(R.id.kas_list_belki)
        val zhiri: TextView = view.findViewById(R.id.kas_list_zhiri)
        val yglevodi: TextView = view.findViewById(R.id.kas_list_yglevodi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder6 {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.kas_list, parent, false)
        return MyViewHolder6(view)
    }

    override fun getItemCount(): Int {
        return kass.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder6, position: Int) {
        holder.title.text = kass[position].title
        holder.kkal.text = kass[position].kkal.toString()
        holder.belki.text = kass[position].belki.toString()
        holder.zhiri.text = kass[position].zhiri.toString()
        holder.yglevodi.text = kass[position].yglevodi.toString()
    }
}