package com.example.a1

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DrAdapter(var drs: List<Dr>, var context: Context) : RecyclerView.Adapter<DrAdapter.MyViewHolder14>() {

    class MyViewHolder14(view: View): RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.dr_list_title)
        val kkal: TextView = view.findViewById(R.id.dr_list_kkal)
        val belki: TextView = view.findViewById(R.id.dr_list_belki)
        val zhiri: TextView = view.findViewById(R.id.dr_list_zhiri)
        val yglevodi: TextView = view.findViewById(R.id.dr_list_yglevodi)
        var checkBox14: CheckBox = view.findViewById(R.id.checkBox14)
        var soxr: Button = view.findViewById(R.id.soxr)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder14 {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.dr_list, parent, false)
        return MyViewHolder14(view)

    }

    override fun getItemCount(): Int {
        return drs.count()

    }

    override fun onBindViewHolder(holder: MyViewHolder14, position: Int) {
        holder.title.text = drs[position].title
        holder.kkal.text = drs[position].kkal.toString()
        holder.belki.text = drs[position].belki.toString()
        holder.zhiri.text = drs[position].zhiri.toString()
        holder.yglevodi.text = drs[position].yglevodi.toString()
        holder.checkBox14.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                val intent = Intent(context, DobavActivity::class.java)
                intent.putExtra("itemTitle", drs[position].title)
                intent.putExtra("itemKkal", drs[position].kkal)
                intent.putExtra("itemBelki", drs[position].belki)
                intent.putExtra("itemZhiri", drs[position].zhiri)
                intent.putExtra("itemYglevodi", drs[position].yglevodi)

                context.startActivity(intent)
            }
        }
    }
}
