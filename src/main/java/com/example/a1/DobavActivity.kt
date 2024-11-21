package com.example.a1

import DatabaseHelper1
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DobavActivity : AppCompatActivity() {
    private lateinit var myDbHelper: DatabaseHelper1
    private lateinit var recyclerView: RecyclerView
    private var selectedIds: MutableList<Int> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dobav)

        myDbHelper = DatabaseHelper1(this)
        recyclerView = findViewById(R.id.dobavList)

        loadData()
    }

    @SuppressLint("Range")
    private fun loadData() {
        val db = myDbHelper.readableDatabase
        val cursor = db.query(
            "items",
            null,
            "id = ?",
            arrayOf(selectedIds.toString()),
            null,
            null,
            null
        )

        val dobavList = mutableListOf<Item>()

        if (cursor.moveToFirst()) {
            do {
                val id = cursor.getInt(cursor.getColumnIndex("id"))
                val title = cursor.getString(cursor.getColumnIndex("title"))
                val kkal = cursor.getDouble(cursor.getColumnIndex("kkal"))
                val belki = cursor.getDouble(cursor.getColumnIndex("belki"))
                val zhiri = cursor.getDouble(cursor.getColumnIndex("zhiri"))
                val yglevodi = cursor.getDouble(cursor.getColumnIndex("yglevodi"))
                dobavList.add(Item(id, title, kkal, belki, zhiri, yglevodi))
            } while (cursor.moveToNext())
        }
        cursor.close()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = DobavAdapter(dobavList)

        // Настройка Spinner
        val spinner = findViewById<Spinner>(R.id.spinner)
        val languages = resources.getStringArray(R.array.vids)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, languages)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                // Обработка выбора элемента
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Обработка отсутствия выбора
            }
        }

        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            val intent = Intent(this, GlavActivity::class.java)
            startActivity(intent)
        }

        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener {
            val intent = Intent(this, ProdActivity::class.java)
            startActivity(intent)
        }
    }
}




