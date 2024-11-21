package com.example.a1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class VipAdapter(var vips: List<Vip>, var context: Context) : RecyclerView.Adapter<VipAdapter.MyViewHolder11>() {

    class MyViewHolder11(view: View): RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.vip_list_title)
        val kkal: TextView = view.findViewById(R.id.vip_list_kkal)
        val belki: TextView = view.findViewById(R.id.vip_list_belki)
        val zhiri: TextView = view.findViewById(R.id.vip_list_zhiri)
        val yglevodi: TextView = view.findViewById(R.id.vip_list_yglevodi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder11 {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.vip_list, parent, false)
        return MyViewHolder11(view)
    }

    override fun getItemCount(): Int {
        return vips.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder11, position: Int) {
        holder.title.text = vips[position].title
        holder.kkal.text = vips[position].kkal.toString()
        holder.belki.text = vips[position].belki.toString()
        holder.zhiri.text = vips[position].zhiri.toString()
        holder.yglevodi.text = vips[position].yglevodi.toString()
    }
}