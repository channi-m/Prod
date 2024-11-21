package com.example.a1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MolAdapter(var mols: List<Mol>, var context: Context) : RecyclerView.Adapter<MolAdapter.MyViewHolder16>() {

    class MyViewHolder16(view: View): RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.mol_list_title)
        val kkal: TextView = view.findViewById(R.id.mol_list_kkal)
        val belki: TextView = view.findViewById(R.id.mol_list_belki)
        val zhiri: TextView = view.findViewById(R.id.mol_list_zhiri)
        val yglevodi: TextView = view.findViewById(R.id.mol_list_yglevodi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder16 {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.mol_list, parent, false)
        return MyViewHolder16(view)
    }

    override fun getItemCount(): Int {
        return mols.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder16, position: Int) {
        holder.title.text = mols[position].title
        holder.kkal.text = mols[position].kkal.toString()
        holder.belki.text = mols[position].belki.toString()
        holder.zhiri.text = mols[position].zhiri.toString()
        holder.yglevodi.text = mols[position].yglevodi.toString()
    }
}