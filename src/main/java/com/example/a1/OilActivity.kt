package com.example.a1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class OilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oil)

        val oilList: RecyclerView = findViewById(R.id.oilList)
        val oils = arrayListOf<Oil>()

        oils.add(Oil(1, "Масло сливочное",	1.0,	82.5,	0.9,	748.0))
        oils.add(Oil(2,"Масло сливочное \"Валио\"",	0.7,	82.0,	0.7,	740.0))
        oils.add(Oil(3, "Масло топленое",	0.2,	99.0,	0.0,	892.0))
        oils.add(Oil(4, "Масло шоколадное",	1.5,	62.0,	18.6,	642.0))
        oils.add(Oil(5, "Масло оливковое",	0.0,	99.8,	0.0,	898.0))
        oils.add(Oil( 6, "Масло подсолнечное",	0.0,	99.9,	0.0,	899.0))
        oils.add(Oil(7, "Маргарин",	0.5,	82.5,	1.0,	746.0))
        oils.add(Oil(8, "Спред",	0.0,	40.0,	0.0,	360.0))
        oils.add(Oil(9, "Майонез",	3.1,	72.0,	3.9,	665.0))
        oils.add(Oil(10, "Майонез легкий",	1.4,	30.0,	6.5,	300.0))
        oils.add(Oil(11, "Жир говяжий, свиной, бараний топленые",	0.0,	99.7,	0.0,	897.0))
        oils.add(Oil(12, "Жир кулинарный, кондитерский",	0.0,	99.7,	0.0,	897.0))
        oils.add(Oil(13, "Жир рыбий",	0.0,	100.0,	0.0,	902.0))
        oils.add(Oil(14, "Сало",	2.4,	89.0,	0.0,	797.0))
        oils.add(Oil(15, "Шпик",	1.4,	92.8,	0.0,	841.0))

        oilList.layoutManager = LinearLayoutManager(this)
        oilList.adapter = OilAdapter(oils, this)
    }
}