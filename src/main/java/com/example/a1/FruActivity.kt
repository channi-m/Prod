package com.example.a1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FruActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fru)

        val fruList: RecyclerView = findViewById(R.id.fruList)
        val frus = arrayListOf<Fru>()

        frus.add(Fru(1, "Арбуз", 0.6, 0.1, 5.8, 27.0))
        frus.add(Fru(2, "Абрикосы", 0.9, 0.1, 9.0, 44.0))
        frus.add(Fru(3, "Авокадо", 2.0, 14.6, 8.5, 160.0))
        frus.add(Fru(4, "Айва", 0.6, 0.5, 9.6, 48.0))
        frus.add(Fru(5, "Алыча", 0.2, 0.1, 7.9, 34.0))
        frus.add(Fru(6, "Ананас", 0.4, 0.2, 11.5, 52.0))
        frus.add(Fru(7, "Апельсины", 0.9, 0.2, 8.1, 43.0))
        frus.add(Fru(8, "Банан", 1.5, 0.5, 21.0, 96.0))
        frus.add(Fru(9, "Виноград", 0.6, 0.6, 15.4, 72.0))
        frus.add(Fru(10, "Вишня", 0.8, 0.2, 10.6, 52.0))
        frus.add(Fru(11, "Гранат", 0.7, 0.6, 14.5, 72.0))
        frus.add(Fru(12, "Грейпфрут", 0.7, 0.2, 6.5, 35.0))
        frus.add(Fru(13, "Груша", 0.4, 0.3, 10.3, 47.0))
        frus.add(Fru(14, "Дуриан", 1.5, 5.3, 23.3, 147.0))
        frus.add(Fru(15, "Дыня", 0.6, 0.3, 7.4, 35.0))
        frus.add(Fru(16, "Инжир свежий", 0.7, 0.2, 12.0, 54.0))
        frus.add(Fru(17, "Киви", 0.8, 0.4, 8.1, 47.0))
        frus.add(Fru(18, "Кумкват", 1.9, 0.9, 13.4, 71.0))
        frus.add(Fru(19, "Лимон", 0.9, 0.1, 3.0, 34.0))
        frus.add(Fru(20, "Личи", 0.8, 0.4, 15.2, 66.0))
        frus.add(Fru(21, "Манго", 0.8, 0.4, 13.4, 60.0))
        frus.add(Fru(22, "Мандарины", 0.8, 0.2, 7.5, 38.0))
        frus.add(Fru(23, "Маракуйя", 2.4, 0.4, 13.4, 68.0))
        frus.add(Fru(24, "Нектарин", 1.1, 0.3, 9.0, 44.0))
        frus.add(Fru(25, "Папайя", 0.5, 0.26, 9.1, 43.0))
        frus.add(Fru(26, "Персик", 0.9, 0.1, 9.5, 45.0))
        frus.add(Fru(27, "Помело", 0.8, 0.04, 8.6, 38.0))
        frus.add(Fru(28, "Слива", 0.8, 0.3, 9.6, 49.0))
        frus.add(Fru(29, "Терн", 1.5, 0.3, 9.4, 54.0))
        frus.add(Fru(30, "Фейхоа", 0.7, 0.4, 8.8, 61.0))
        frus.add(Fru(31, "Хурма", 0.5, 0.4, 15.3, 67.0))
        frus.add(Fru(32, "Черешня", 1.1, 0.4, 10.6, 52.0))
        frus.add(Fru(33, "Яблоки", 0.4, 0.4, 9.8, 47.0))
        frus.add(Fru(34, "Брусника", 0.7, 0.5, 8.2, 46.0))
        frus.add(Fru(35, "Голубика", 1.0, 0.5, 6.6, 39.0))
        frus.add(Fru(36, "Ежевика", 1.5, 0.5, 4.4, 34.0))
        frus.add(Fru(37, "Клубника", 0.8, 0.4, 7.5, 41.0))
        frus.add(Fru(38, "Клюква", 0.5, 0.2 ,3.7 ,28.0))
        frus.add(Fru(39,"Крыжовник",0.7 ,0.2 ,9.1 ,45.0))
        frus.add(Fru(40,"Малина",0.8 ,0.5 ,8.3 ,46.0))
        frus.add(Fru(41,"Морошка",0.8 ,0.9 ,7.4 ,40.0))
        frus.add(Fru(42,"Облепиха",1.2 ,5.4 ,5.7 ,82.0))
        frus.add(Fru(43,"Смородина белая",0.5 ,0.2 ,8.0 ,42.0))
        frus.add(Fru(44,"Смородина красная",0.6 ,0.2 ,7.7 ,43.0 ))
        frus.add(Fru(45,"Смородина черная",1.0 ,0.4 ,7.3 ,44.0))
        frus.add(Fru(46,"Черника",1.1 ,0.6 ,7.6 ,44.0))
        frus.add(Fru(47,"Шиповник свежий",1.6 ,0.7 ,22.4 ,109.0 ))
        frus.add(Fru(48,"Шиповник сухой",3.4 ,1.4 ,48.3 ,284.0))

        fruList.layoutManager = LinearLayoutManager(this)
        fruList.adapter = FruAdapter(frus, this)
    }
}