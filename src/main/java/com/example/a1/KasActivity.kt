package com.example.a1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class KasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kas)

        val kasList: RecyclerView = findViewById(R.id.kasList)
        val kass = arrayListOf<Kas>()

        kass.add(Kas(1, "Гречневая каша рассыпчатая", 98.7, 3.6, 2.2, 17.1))
        kass.add(Kas(2, "Каша \"Янтарная\" (из пшена с яблоками)", 138.9, 3.8, 6.5, 17.5))
        kass.add(Kas(3, "Каша боярская (из пшена с изюмом)", 221.7, 4.8, 14.4, 19.5))
        kass.add(Kas(4, "Каша вязкая из пшена с тыквой", 158.0, 4.2, 8.0, 18.5))
        kass.add(Kas(5, "Каша гурьевская", 151.2, 4.4, 5.4, 22.6))
        kass.add(Kas(6, "Каша из тыквы с манкой", 161.5, 2.8, 8.4, 19.9))
        kass.add(Kas(7, "Каша манная коричневая", 162.1, 5.3, 6.0, 23.2))
        kass.add(Kas(8, "Каша пшенная с сушеными сливами", 121.3, 2.4, 2.9, 22.7))
        kass.add(Kas(9, "Каша рисовая с какао", 146.2, 4.1, 6.0, 20.3))
        kass.add(Kas(10, "Манная каша на клюквенном соке", 112.7, 1.9, 4.6, 17.0))
        kass.add(Kas(11, "Манная каша с морковью", 97.3, 2.7, 5.6, 9.7))
        kass.add(Kas(12, "Мучная каша", 95.3, 3.4, 4.9, 10.2))
        kass.add(Kas(13, "Рисовая каша с черносливом", 128.5, 1.9, 2.4, 26.4))
        kass.add(Kas(14, "Рисовая с абрикосами по-венгерски", 119.7, 2.6, 0.3, 28.5))
        kass.add(Kas(15, "Яблочно-манная каша", 128.4, 1.9, 4.3, 22.0))
        kass.add(Kas(16, "Яичная каша (натуральная)", 180.3, 10.3, 11.0, 10.8))
        kass.add(Kas(17, "Яичная каша с овощами или грибами", 261.0, 15.9, 13.2, 20.9))
        kass.add(Kas(18, "Ячневая каша с картофелем", 48.6, 1.8, 1.0, 8.7))

        kasList.layoutManager = LinearLayoutManager(this)
        kasList.adapter = KassAdapter(kass, this)
    }
}