package com.example.a1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ZagoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zago)

        val zagoList: RecyclerView = findViewById(R.id.zagoList)
        val zags = arrayListOf<Zago>()

        zags.add(Zago(1, "Арбуз консервированный", 36.5, 0.5, 0.09, 9.0))
        zags.add(Zago(2, "Брусника маринованная с яблоками", 53.3, 0.3, 0.3, 13.2))
        zags.add(Zago(3, "Брусника моченая", 23.6, 0.3, 0.2, 5.3))
        zags.add(Zago(4, "Засахаренный кишмиш", 224.6, 0.0, 0.0, 59.9))
        zags.add(Zago(5, "Икра баклажанная", 74.3, 1.9, 4.7, 6.5))
        zags.add(Zago(6, "Икра кабачковая", 90.8, 1.6, 6.3, 7.4))
        zags.add(Zago(7, "Икра свекольная или морковная", 129.5, 2.9, 7.4, 13.6))
        zags.add(Zago(8, "Икра щучья", 87.1, 17.3, 2.0, 0.0))
        zags.add(Zago(9, "Капуста маринованная", 47.0, 0.8, 0.05, 11.5))
        zags.add(Zago(10, "Квашеная капуста", 27.0, 1.6, 0.1, 5.2))
        zags.add(Zago(11, "Маринованная капуста", 126.6, 1.7, 10.0, 8.1))
        zags.add(Zago(12, "Маринованная морская капуста", 12.5, 0.9, 0.2, 1.9))
        zags.add(Zago(13, "Маринованная свекла", 41.6, 1.6, 0.1, 9.1))
        zags.add(Zago(14, "Маринованные стрелки чеснока", 29.7, 0.7, 0.03, 7.1))
        zags.add(Zago(15, "Маринованный чеснок", 42.4, 1.8, 0.1, 9.1))
        zags.add(Zago(16, "Морковь по-корейски", 112.6, 1.2, 8.2, 9.0))
        zags.add(Zago(17, "Морковь по-корейски", 232.5, 0.9, 23.5, 4.8))
        zags.add(Zago(18, "Пюре из боярышника", 29.9, 0.0, 0.0, 8.0))
        zags.add(Zago(19, "Рольмопс", 149.6, 7.8, 11.6, 3.8))
        zags.add(Zago(20, "Слива маринованная", 63.9, 0.3, 0.1, 16.5))
        zags.add(Zago(21, "Соленые огурцы", 11.2, 0.6, 0.08, 2.2))
        zags.add(Zago(22, "Черника в собственном соку", 38.3, 1.1, 0.6, 7.6))

        zagoList.layoutManager = LinearLayoutManager(this)
        zagoList.adapter = ZagsAdapter(zags, this)
    }
}