package com.example.a1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class OilAdapter(var oils: List<Oil>, var context: Context) : RecyclerView.Adapter<OilAdapter.MyViewHolder21>() {

    class MyViewHolder21(view: View): RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.oil_list_title)
        val kkal: TextView = view.findViewById(R.id.oil_list_kkal)
        val belki: TextView = view.findViewById(R.id.oil_list_belki)
        val zhiri: TextView = view.findViewById(R.id.oil_list_zhiri)
        val yglevodi: TextView = view.findViewById(R.id.oil_list_yglevodi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder21 {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.oil_list, parent, false)
        return MyViewHolder21(view)
    }

    override fun getItemCount(): Int {
        return oils.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder21, position: Int) {
        holder.title.text = oils[position].title
        holder.kkal.text = oils[position].kkal.toString()
        holder.belki.text = oils[position].belki.toString()
        holder.zhiri.text = oils[position].zhiri.toString()
        holder.yglevodi.text = oils[position].yglevodi.toString()
    }
}