package com.example.a1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BrAdapter(var brs: List<Br>, private val onItemChecked: (Int) -> Unit) : RecyclerView.Adapter<BrAdapter.MyViewHolder15>() {

    private val checkedItems = mutableSetOf<Int>()

    inner class MyViewHolder15(view: View): RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.br_list_title)
        val kkal: TextView = view.findViewById(R.id.br_list_kkal)
        val belki: TextView = view.findViewById(R.id.br_list_belki)
        val zhiri: TextView = view.findViewById(R.id.br_list_zhiri)
        val yglevodi: TextView = view.findViewById(R.id.br_list_yglevodi)
        val checkBox: CheckBox = view.findViewById(R.id.brCheckBox)

        fun bind(brs: Br) {
            checkBox.text = brs.title
            checkBox.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    checkedItems.add(brs.id)
                    onItemChecked(brs.id)
                }
            }
        }
    }


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder15 {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.br_list, parent, false)
            return MyViewHolder15(view)
        }

        override fun getItemCount(): Int {
            return brs.count()
        }

        override fun onBindViewHolder(holder: MyViewHolder15, position: Int) {
            holder.title.text = brs[position].title
            holder.kkal.text = brs[position].kkal.toString()
            holder.belki.text = brs[position].belki.toString()
            holder.zhiri.text = brs[position].zhiri.toString()
            holder.yglevodi.text = brs[position].yglevodi.toString()

            holder.bind(brs[position])
        }
    }
