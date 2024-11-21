package com.example.a1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


data class Dobav(val id: Int, val title: String, val kkal: Double, val belki: Double, val zhiri: Double, val yglevodi: Double)

class DobavAdapter(private val dobavList: MutableList<Item>) : RecyclerView.Adapter<DobavAdapter.DobViewHolder>() {

    inner class DobViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.dobav_list_title)
        val kkalTextView: TextView = itemView.findViewById(R.id.dobav_list_kkal)
        val belkiTextView: TextView = itemView.findViewById(R.id.dobav_list_belki)
        val zhiriTextView: TextView = itemView.findViewById(R.id.dobav_list_zhiri)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DobViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.dobav_list, parent, false)
        return DobViewHolder(view)
    }

    override fun onBindViewHolder(holder: DobViewHolder, position: Int) {
        val brItem = dobavList[position]
        holder.titleTextView.text = brItem.title
        holder.kkalTextView.text = brItem.kkal.toString()
        holder.belkiTextView.text = brItem.belki.toString()
        holder.zhiriTextView.text = brItem.zhiri.toString()
    }

    override fun getItemCount(): Int {
        return dobavList.size
    }
}