package com.example.a1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class GlavActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_glav)

        val tipList: RecyclerView = findViewById(R.id.tipList)
        val tips = arrayListOf<Tip>()

        tips.add(Tip(1, "soup", "Первые блюда(супы)"))
        tips.add(Tip(2, "second", "Вторые блюда"))
        tips.add(Tip(3, "garniri", "Гарниры"))
        tips.add(Tip(4, "zagotovki", "Заготовки"))
        tips.add(Tip(5, "kasha", "Каши"))
        tips.add(Tip(6, "salat", "Салаты"))
        tips.add(Tip(7, "zakuski", "Закуски"))
        tips.add(Tip(8, "polufabrikati", "Полуфабрикаты"))
        tips.add(Tip(9, "souse", "Соусы и заправки"))
        tips.add(Tip(10, "vipechka", "Выпечка"))
        tips.add(Tip(11, "desserts", "Десерты"))
        tips.add(Tip(12, "jam", "Варенье и джемы"))
        tips.add(Tip(13, "napitki", "Напитки"))

        tipList.layoutManager = LinearLayoutManager(this)
        tipList.adapter = TipsAdapter(tips, this)

        }
    }


