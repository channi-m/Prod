package com.example.a1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EgActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eg)

        val egList: RecyclerView = findViewById(R.id.egList)
        val egs = arrayListOf<Eg>()

        egs.add(Eg(1, "Яйцо куриное", 12.7, 10.9, 0.7, 157.0))
        egs.add(Eg(2, "Белок", 11.1, 0.0, 0.0, 44.0))
        egs.add(Eg(3, "Желток", 16.2, 31.2, 1.0, 354.0))
        egs.add(Eg(4, "Яйцо куриное отварное", 12.7, 11.5, 0.7, 157.0))
        egs.add(Eg(5, "Яйцо куриное жареное без масла", 14.6, 12.6, 0.8, 174.0))
        egs.add(Eg(6, "Яйцо перепелиное", 11.9, 13.1, 0.6, 168.0))
        egs.add(Eg(7, "Яйцо гусиное", 13.9, 13.3, 1.4, 185.0))
        egs.add(Eg(8, "Яйцо утиное", 13.3, 14.5, 0.1, 185.0))
        egs.add(Eg(9, "Яйцо страусиное", 12.2, 11.7, 0.7, 118.0))
        egs.add(Eg(10, "Меланж", 12.7, 11.5, 0.7, 157.0))
        egs.add(Eg(11, "Яичный порошок", 46.0, 37.3, 4.5, 542.0))

        egList.layoutManager = LinearLayoutManager(this)
        egList.adapter = EgAdapter(egs, this)
    }
}