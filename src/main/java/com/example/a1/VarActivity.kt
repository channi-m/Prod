package com.example.a1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class VarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_var)

        val varList: RecyclerView = findViewById(R.id.varList)
        val vars = arrayListOf<Var>()

        vars.add(Var(1, "Абрикосовый джем", 209.5, 0.5, 0.1, 51.5))
        vars.add(Var(2, "Варенье грушевое", 214.6, 0.1, 0.1, 56.8))
        vars.add(Var(3, "Варенье из абрикосов по-венгерски", 241.5, 0.3, 0.04, 64.0))
        vars.add(Var(4, "Варенье из айвы", 221.8, 0.1, 0.1, 58.7))
        vars.add(Var(5, "Варенье из арбузных корок", 219.9, 0.2, 0.03, 58.4))
        vars.add(Var(6, "Варенье из барбариса", 203.7, 0.0, 0.0, 54.3))
        vars.add(Var(7, "Варенье из брусники", 160.8, 0.4, 0.3, 41.9))
        vars.add(Var(8, "Варенье из брусники", 244.3, 0.2, 0.1, 64.6))
        vars.add(Var(9, "Варенье из брусники и яблок", 247.1, 0.2, 0.1, 65.4))
        vars.add(Var(10, "Варенье из брусники по-белорусски", 191.1, 0.2, 0.1, 50.4))
        vars.add(Var(11, "Варенье из брусники с корицей и гвоздикой", 243.7, 0.2, 0.1, 64.4))
        vars.add(Var(12, "Варенье из вишни без косточек", 219.4, 0.3, 0.07, 58.0))
        vars.add(Var(13, "Варенье из водяники", 217.8, 0.06, 0.05, 57.9))
        vars.add(Var(14, "Варенье из голубики и малины", 229.1, 0.2, 0.1, 60.5))
        vars.add(Var(15, "Варенье из жимолости", 218.2, 0.0, 0.0, 58.2))
        vars.add(Var(16, "Варенье из кишмиша", 295.9, 0.0, 0.0, 78.9))
        vars.add(Var(17, "Варенье из спелых абрикосов", 160.9, 0.7, 1.1, 39.6))
        vars.add(Var(18, "Варенье из цедры", 174.3, 0.4, 0.04, 45.9))
        vars.add(Var(19, "Джем грушевый", 211.7, 0.2, 0.2, 55.9))
        vars.add(Var(20, "Джем из айвы", 222.8, 0.2, 0.1, 58.9))
        vars.add(Var(21, "Джем из боярышника и яблок", 89.4, 0.1, 0.1, 23.5))
        vars.add(Var(22, "Джем из черной бузины", 189.0, 0.0, 0.0, 50.4))
        vars.add(Var(23, "Засахаренный кишмиш протертый", 257.1, 0.0, 0.0, 68.6))
        vars.add(Var(24, "Облепиховое варенье", 164.6, 0.7, 3.7, 34.4))
        vars.add(Var(25, "Повидло из абрикосов", 241.5, 0.3, 0.04, 64.0))
        vars.add(Var(26, "Повидло из айвы", 216.0, 0.3, 0.2, 56.8))
        vars.add(Var(27, "Повидло из боярышника", 167.8, 0.0, 0.0, 44.7))
        vars.add(Var(28, "Пюре из черной бузины", 170.1, 0.0, 0.0, 45.4))

        varList.layoutManager = LinearLayoutManager(this)
        varList.adapter = VarAdapter(vars, this)
    }
}