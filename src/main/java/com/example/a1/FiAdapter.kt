package com.example.a1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FiAdapter(var fis: List<Fi>, var context: Context) : RecyclerView.Adapter<FiAdapter.MyViewHolder19>() {

    class MyViewHolder19(view: View): RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.fi_list_title)
        val kkal: TextView = view.findViewById(R.id.fi_list_kkal)
        val belki: TextView = view.findViewById(R.id.fi_list_belki)
        val zhiri: TextView = view.findViewById(R.id.fi_list_zhiri)
        val yglevodi: TextView = view.findViewById(R.id.fi_list_yglevodi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder19 {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fi_list, parent, false)
        return MyViewHolder19(view)
    }

    override fun getItemCount(): Int {
        return fis.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder19, position: Int) {
        holder.title.text = fis[position].title
        holder.kkal.text = fis[position].kkal.toString()
        holder.belki.text = fis[position].belki.toString()
        holder.zhiri.text = fis[position].zhiri.toString()
        holder.yglevodi.text = fis[position].yglevodi.toString()
    }
}