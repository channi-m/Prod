package com.example.a1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prod)

        val prodList: RecyclerView = findViewById(R.id.prodList)
        val prods = arrayListOf<Prod>()

        prods.add(Prod(1,"bread", "Хебобулочные изделия, мука, крупы, бобовые"))
        prods.add(Prod(2, "moloko", "Молочные продукты"))
        prods.add(Prod(3, "meat", "Мясные продукты, птица"))
        prods.add(Prod(4, "kolbasa", "Колбасные изделия, мясные консервы"))
        prods.add(Prod(5, "fish", "Рыба и морепродукты"))
        prods.add(Prod(6, "eggs", "Яйцепродукты"))
        prods.add(Prod(7, "oil", "Масла, жиры и жировые продукты"))
        prods.add(Prod(8, "vegetables", "Овощи, картофель, зелень, грибы, овощные консервы"))
        prods.add(Prod(9, "fruit", "Фрукты, ягоды, бахчевые"))
        prods.add(Prod(10, "orex", "Орехи, семена, сухофрукты"))

        prodList.layoutManager = LinearLayoutManager(this)
        prodList.adapter = ProdAdapter(prods, this)

    }
}