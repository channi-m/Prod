package com.example.a1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class OrActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_or)

        val orList: RecyclerView = findViewById(R.id.orList)
        val ors = arrayListOf<Or>()

        ors.add(Or(1, "Арахис", 26.3, 45.2, 9.9, 552.0))
        ors.add(Or(2, "Арахис жареный", 26.0, 52.0, 13.4, 626.0))
        ors.add(Or(3, "Бразильский орех", 14.3, 67.1, 4.2, 659.0))
        ors.add(Or(4, "Грецкие орехи", 16.2, 60.8, 11.1, 656.0))
        ors.add(Or(5, "Кедровые орехи", 13.7, 64.1, 9.4, 673.0))
        ors.add(Or(6, "Кешью", 18.5, 48.5, 22.5, 600.0))
        ors.add(Or(7, "Кешью жареный", 17.5, 42.2, 30.5, 572.0))
        ors.add(Or(8, "Кокосовый орех сырой", 3.3, 33.5, 6.2, 354.0))
        ors.add(Or(9, "Лесной орех (лещина)", 13.0, 62.6, 9.3, 653.0))
        ors.add(Or(10, "Миндальный орех", 18.6, 53.7, 13.0, 609.0))
        ors.add(Or(11, "Миндальный орех жареный", 22.4, 55.9, 12.3, 642.0))
        ors.add(Or(12, "Миндальные лепестки", 22.0, 58.0, 12.0, 650.0))
        ors.add(Or(13, "Орех макадамия", 7.9, 75.8, 5.2, 718.0))
        ors.add(Or(14, "Орехи пекан", 9.2, 72.0, 4.3, 691.0))
        ors.add(Or(15, "Семечки подсолнечника, ядра сушеные", 20.8, 51.5, 17.4, 584.0))
        ors.add(Or(16, "Семечки тыквенные, ядра сушеные", 30.2, 49.1, 9.3, 559.0))
        ors.add(Or(17, "Семена конопли очищенные", 31.6, 48.7, 4.7, 553.0))
        ors.add(Or(18, "Семена конопли неочищенные", 20.1, 32.5, 14.0, 429.0))
        ors.add(Or(19, "Семена кунжута", 19.4, 48.7, 12.2, 565.0))
        ors.add(Or(20, "Семена льна", 18.3, 42.2, 28.9, 534.0))
        ors.add(Or(21, "Семена мака", 17.5, 47.5, 14.5, 556.0))
        ors.add(Or(22, "Семена чиа", 16.5, 30.7, 7.7, 486.0))
        ors.add(Or(23, "Фисташки сырые", 20.2, 45.3, 16.6, 560.0))
        ors.add(Or(24, "Фисташки жареные без масла с добавлением соли", 21.1, 45.8, 17.3, 569.0))
        ors.add(Or(25, "Фундук (лещина окультуренная)", 15.0, 61.5, 9.4, 651.0))
        ors.add(Or(26, "Фундук жареный", 17.8, 66.1, 9.4, 703.0))
        ors.add(Or(27, "Бананы сушеные", 3.9, 1.8, 78.4, 346.0))
        ors.add(Or(28, "Вишня сушеная", 1.5, -0.0, 73.0, 290.0))
        ors.add(Or(29, "Груша сушеная", 2.3, 0.6, 62.6, 270.0))
        ors.add(Or(30, "Дыня сушеная", 0.7, 0.1, 82.2, 341.0))
        ors.add(Or(31, "Изюм", 2.5, 0.54, 67.7, 296.0))
        ors.add(Or(32, "Изюм кишмиш", 2.3, 0.5, 65.8, 281.0))
        ors.add(Or(33, "Инжир сушеный", 3.1, 0.8, 57.9, 257.0))
        ors.add(Or(34, "Курага", 5.2, 0.3, 51.0, 232.0))
        ors.add(Or(35, "Персик сушеный", 3.0, 0.4 ,57.7 ,254.0))
        ors.add(Or(36,"Урюк",5.0 ,0.4 ,53.0 ,242.0))
        ors.add(Or(37,"Финики",2.5 ,0.5 ,69.2 ,292.0))
        ors.add(Or(38,"Чернослив (слива сушеная)",2.3 ,0.7 ,57.5 ,256.0))
        ors.add(Or(39,"Яблоки сушеные",2.2 ,0.1 ,59.0 ,253.0))

        orList.layoutManager = LinearLayoutManager(this)
        orList.adapter = OrAdapter(ors, this)
    }
}