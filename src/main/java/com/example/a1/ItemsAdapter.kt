package com.example.a1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemsAdapter(var items: List<Item>, var context: Context) : RecyclerView.Adapter<ItemsAdapter.MyViewHolder>() {

    class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.item_list_title)
        val kkal: TextView = view.findViewById(R.id.item_list_kkal)
        val belki: TextView = view.findViewById(R.id.item_list_belki)
        val zhiri: TextView = view.findViewById(R.id.item_list_zhiri)
        val yglevodi: TextView = view.findViewById(R.id.item_list_yglevodi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.items_list_1, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.title.text = items[position].title
        holder.kkal.text = items[position].kkal.toString()
        holder.belki.text = items[position].belki.toString()
        holder.zhiri.text = items[position].zhiri.toString()
        holder.yglevodi.text = items[position].yglevodi.toString()
    }
}