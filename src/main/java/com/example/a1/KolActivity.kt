package com.example.a1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class KolActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kol)

        val kolList: RecyclerView = findViewById(R.id.kolList)
        val kols = arrayListOf<Kol>()

        kols.add(Kol(1, "Колбаса вареная \"Диетическая\"", 12.1, 13.5, 0.0, 170.0))
        kols.add(Kol(2, "Докторская", 12.8, 22.2, 1.5, 257.0))
        kols.add(Kol(3, "Любительская", 12.2, 28.0, 0.1, 301.0))
        kols.add(Kol( 4, "Молочная", 11.7, 22.8, 0.2, 252.0))
        kols.add(Kol( 5, "Московская", 11.5, 21.8, 2.0, 250.0))
        kols.add(Kol(6, "Русская", 11.5, 27.9, 1.7, 302.0))
        kols.add(Kol(7, "Колбаса варено-копченая \"Московская\"", 19.1, 36.6, 0.2, 406.0))
        kols.add(Kol(  8, "Сервелат", 16.1, 40.1, 0.0, 425.0))
        kols.add(Kol(  9, "Колбаса полукопченая \"Краковская\"", 16.2, 44.6, 0.0, 466.0))
        kols.add(Kol(  10, "Колбаса полукопченая \"Одесская\"", 14.8, 38.1, 0.3, 402.0))
        kols.add(Kol(  11, "Колбаса сырокопченая \"Брауншвейгская\"", 27.7, 42.2, 0.2, 491.0))
        kols.add(Kol(  12, "Колбаса сырокопченая \"Московская\"", 24.8, 41.5, 0.0, 473.0))
        kols.add(Kol(  13, "Колбаса сырокопченая свиная", 13.0, 57.0, 0.2, 566.0))
        kols.add(Kol(  14, "Колбаса сырокопченая \"Зернистая\"", 9.9, 62.8, 0.3, 606.0))
        kols.add(Kol(  15, "Колбаса ливерная", 14.4, 28.5, 2.2, 326.0))
        kols.add(Kol(  16, "Грудинка сырокопченая", 8.9, 63.3, 0.0, 605.0))
        kols.add(Kol(  17, "Корейка сырокопченая", 10.5, 47.4, 0.0, 469.0))
        kols.add(Kol(  18, "Ветчина рубленая", 16.3, 20.7, 1.8, 263.0))
        kols.add(Kol(   19, "Сосиски \"Молочные\"", 11.0, 23.9, 0.4, 261.0))
        kols.add(Kol(  20, "говяжьи", 10.4, 20.1, 0.8, 226.0))
        kols.add(Kol(21, "свиные", 9.5, 34.3, 0.0, 342.0))
        kols.add(Kol(22, "куриные", 10.8, 22.4, 4.2, 259.0))
        kols.add(Kol(23, "Сардельки говяжьи", 11.4, 18.2, 1.3, 215.0))
        kols.add(Kol(24, "свиные", 10.1, 31.6, 1.8, 322.0))
        kols.add(Kol(25, "Шпикачки", 10.0, 33.0, 0.0, 337.0))
        kols.add(Kol(26, "Говядина тушеная консервированная", 16.8, 17.0, 0.2, 220.0))
        kols.add(Kol(27, "Свинина тушеная консервированная", 14.9, 32.2, 0.2, 349.0))

        kolList.layoutManager = LinearLayoutManager(this)
        kolList.adapter = KolAdapter(kols, this)
    }
}