package com.example.a1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MolActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mol)

        val molList: RecyclerView = findViewById(R.id.molList)
        val mols = arrayListOf<Mol>()

        mols.add(Mol(1, "Молоко коровье нежирное", 3.0, 0.05, 4.9, 32.0))
        mols.add(Mol(2, "Молоко 1,5% жирности", 3.0, 1.5, 4.8, 45.0))
        mols.add(Mol(3, "Молоко 2,5%", 2.9, 2.5, 4.8, 54.0))
        mols.add(Mol(4, "Молоко 3,2%", 2.9, 3.2, 4.7, 60.0))
        mols.add(Mol(5, "Сливки 10%", 2.7, 10.0, 4.4, 119.0))
        mols.add(Mol(6, "Сливки 20%", 2.5, 20.0, 4.0, 205.0))
        mols.add(Mol(7, "Творог нежирный", 22.0, 0.6, 3.3, 110.0))
        mols.add(Mol(8, "Творог 5%", 21.0, 5.0, 3.0, 145.0))
        mols.add(Mol(9, "Творог 9%", 18.0, 9.0, 3.0, 169.0))
        mols.add(Mol(10, "Творог 18%", 15.0, 18.0, 2.8, 236.0))
        mols.add(Mol(11, "Сметана 10%", 2.7, 10.0, 3.9, 119.0))
        mols.add(Mol(12, "Сметана 20%", 2.5, 20.0, 3.4, 206.0))
        mols.add(Mol(13, "Сметана 30%", 2.3, 30.0, 3.1, 293.0))
        mols.add(Mol(14, "Кефир нежирный", 3.0, 0.05, 4.0, 31.0))
        mols.add(Mol(15, "Кефир 1%", 3.0, 1.0, 4.0, 40.0))
        mols.add(Mol(16, "Кефир 2,5%", 2.9, 2.5, 4.0, 53.0))
        mols.add(Mol(17, "Кефир 3,2%", 2.9, 3.2, 4.0, 59.0))
        mols.add(Mol(18, "Брынза из коровьего молока", 22.1, 19.2, 0.4, 262.0))
        mols.add(Mol(19, "Сыр \"Адыгейский\"", 19.8, 19.8, 1.5, 264.0))
        mols.add(Mol(20, "Сыр \"Гауда\"", 25.0, 27.0, 2.0, 356.0))
        mols.add(Mol(21, "Сыр \"Голландский\" брусковый", 26.0, 26.8, 1.0, 352.0))
        mols.add(Mol(22, "Сыр \"Голландский\" круглый", 23.7, 30.4, 1.0, 375.0))
        mols.add(Mol(23, "Сыр \"Ламбер\"", 23.7, 30.5, 1.0, 377.0))
        mols.add(Mol(24, "Сыр \"Ламбер\" сливочный", 23.7, 32.5, 1.0, 395.0))
        mols.add(Mol(25, "Сыр \"Маасдам\"", 23.5, 26.0, 1.0, 350.0))
        mols.add(Mol(26, "Сыр моцарелла из цельного молока", 22.2, 22.3, 2.2, 300.0))
        mols.add(Mol(27, "Сыр \"Пармезан\"", 37.8, 27.3, 3.4, 415.0))
        mols.add(Mol(28, "Сыр \"Российский\"", 23.2, 29.5, 1.0, 364.0))
        mols.add(Mol(29, "Сыр рикотта из цельного молока", 11.3, 13.0, 3.0, 174.0))
        mols.add(Mol(30, "Сулугуни", 20.5, 22.0, 0.4, 286.0))
        mols.add(Mol(31, "Сыр \"Тильзитер\"", 24.4, 26.0, 1.9, 340.0))
        mols.add(Mol(32, "Сыр \"Фета\"", 14.2, 21.3, 4.0, 264.0))
        mols.add(Mol( 33, "Сыр \"Эдам\"", 25.0, 27.8, 1.4, 357.0))
        mols.add(Mol(34, "Сыр плавленый", 16.8, 11.2, 23.8, 257.0))
        mols.add(Mol(35, "Сыр \"Viola\"", 11.0, 28.0, 2.0, 305.0))
        mols.add(Mol(36, "Йогурт \"Активиа\" разных видов", 4.2, 3.1, 15.8, 100.0))
        mols.add(Mol(37, "Йогурт греческий", 6.0, 4.5, 3.9, 91.0))
        mols.add(Mol(38, "\"Actimel\" разных видов", 2.8, 15.0, 11.0, 73.0))

        molList.layoutManager = LinearLayoutManager(this)
        molList.adapter = MolAdapter(mols, this)
    }
}