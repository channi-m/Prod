package com.example.a1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class VarAdapter(var vars: List<Var>, var context: Context) : RecyclerView.Adapter<VarAdapter.MyViewHolder13>() {

    class MyViewHolder13(view: View): RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.var_list_title)
        val kkal: TextView = view.findViewById(R.id.var_list_kkal)
        val belki: TextView = view.findViewById(R.id.var_list_belki)
        val zhiri: TextView = view.findViewById(R.id.var_list_zhiri)
        val yglevodi: TextView = view.findViewById(R.id.var_list_yglevodi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder13 {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.var_list, parent, false)
        return MyViewHolder13(view)
    }

    override fun getItemCount(): Int {
        return vars.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder13, position: Int) {
        holder.title.text = vars[position].title
        holder.kkal.text = vars[position].kkal.toString()
        holder.belki.text = vars[position].belki.toString()
        holder.zhiri.text = vars[position].zhiri.toString()
        holder.yglevodi.text = vars[position].yglevodi.toString()
    }
}