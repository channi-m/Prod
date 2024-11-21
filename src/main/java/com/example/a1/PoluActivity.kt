package com.example.a1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PoluActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_polu)

        val poluList: RecyclerView = findViewById(R.id.poluList)
        val pols = arrayListOf<Polu>()

        pols.add(Polu(1, "Фарш \"грибной\"", 353.1, 34.0, 20.3, 9.1))
        pols.add(Polu(2, "Фарш \"из зеленого лука с яйцом\"", 89.1, 3.1, 7.1, 3.5))
        pols.add(Polu(3, "Фарш \"из картофеля и свинины\"", 260.3, 9.7, 18.5, 14.7))
        pols.add(Polu(4, "Фарш \"из квашеной капусты\"", 53.8, 1.8, 3.2, 4.7))
        pols.add(Polu(5, "Фарш \"из рыбы и капусты\"", 181.2, 17.7, 11.1, 2.7))
        pols.add(Polu(6, "Фарш \"из рыбы и картофеля\"", 176.3, 18.4, 8.8, 6.2))
        pols.add(Polu(7, "Фарш \"из рыбы и яиц\"", 206.2, 20.9, 12.9, 1.7))
        pols.add(Polu(8, "Фарш \"из свежей капусты\"", 97.8, 3.8, 7.2, 4.8))
        pols.add(Polu(9, "Фарш \"картофельный с грибами или луком (1-й вариант)\"", 148.6, 9.2, 6.7, 13.8))
        pols.add(Polu(10, "Фарш \"ливерный с кашей\"", 380.5, 22.9, 13.3, 45.3))
        pols.add(Polu(11, "Фарш \"морковный\"", 91.3, 2.0, 4.8, 10.7))
        pols.add(Polu(12, "Фарш \"морковный с рисом\"", 188.0, 3.4, 7.2, 29.1))
        pols.add(Polu(13, "Фарш \"морковный с яйцом\"", 128.9, 3.7, 8.9, 9.1))
        pols.add(Polu(14, "Фарш \"мясной с рисом и яйцом\"", 362.7, 26.5, 20.1, 20.1))
        pols.add(Polu(15, "Фарш \"рисовый с грибами\"", 366.2, 10.5, 8.0, 67.3))
        pols.add(Polu(16, "Фарш \"рисовый с яйцом\"", 352.9, 8.0, 8.5, 65.1))
        pols.add(Polu(17, "Фарш \"рыбный\"", 286.2, 35.4, 15.1, 2.2))
        pols.add(Polu(18, "Фарш \"рыбный с рисом\"", 291.7, 27.2, 8.1, 29.3))
        pols.add(Polu(19, "Фарш \"рыбный с рисом и визигой\"", 241.4, 29.8, 8.7, 11.6))
        pols.add(Polu(20, "Фарш \"творожный (для ватрушек, пирожков и вареников)\"", 266.4, 13.1, 18.1, 13.8))
        pols.add(Polu(21, "Фарш \"яблочный\"", 149.1, 0.4, 0.4, 38.3))
        pols.add(Polu(22, "Пельмени со свиным фаршем", 275.0, 11.9, 12.4, 29.0))
        pols.add(Polu(23, "Пельмени со свиным, говяжьим и бараньим фаршем", 235.0, 12.1, 7.2,29.6))
        pols.add(Polu(24, "Пельмени с говядиной и свининой", 203.9, 10.9, 7.8, 23.3))
        pols.add(Polu(25, "Пельмени с куриным фаршем", 181.6, 10.5, 4.2, 25.9))
        pols.add(Polu(26, "Пельмени со свининой и свежей капустой", 268.5, 10.2, 12.9, 29.7))
        pols.add(Polu(27, "Пельмени жареные на сливочном масле", 763.7, 34.4, 51.9, 42.3))
        pols.add(Polu(28, "Запеченные пельмени", 202.0, 6.8, 12.4, 15.8))
        pols.add(Polu(29, "Макароны из муки грубого помола", 113.0, 4.7, 0.9, 23.2))
        pols.add(Polu(30, "Макароны из твердых сортов пшеницы", 140.0, 5.5, 1.1, 27.0))
        pols.add(Polu(31, "Макароны высший сорт", 344.0, 12.8, 0.4, 70.0))

        poluList.layoutManager = LinearLayoutManager(this)
        poluList.adapter = PoluAdapter(pols, this)
    }
}