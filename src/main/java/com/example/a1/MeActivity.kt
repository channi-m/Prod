package com.example.a1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_me)

        val meList: RecyclerView = findViewById(R.id.meList)
        val mes = arrayListOf<Me>()

        mes.add(Me(1, "Говядина 1 категории", 18.6, 16.0, 0.0, 218.0))
        mes.add(Me(2, "Говядина 2 категории", 20.0, 9.8, 0.0, 168.0))
        mes.add(Me(3, "Говядина, вырезка", 22.2, 7.1, 0.0, 158.0))
        mes.add(Me(4, "Телятина 1 категории", 19.7, 2.0, 0.0, 97.0))
        mes.add(Me(5, "Свинина жирная", 11.7, 49.3, 0.0, 491.0))
        mes.add(Me(6, "Свинина мясная", 14.3, 33.3, 0.0, 357.0))
        mes.add(Me(7, "Свинина, вырезка", 19.4, 7.1, 0.0, 142.0))
        mes.add(Me(8, "Баранина 1 категории", 15.6, 16.3, 0.0, 209.0))
        mes.add(Me(9, "Баранина 2 категории", 19.8, 9.6, 0.0, 166.0))
        mes.add(Me( 10, "Конина", 20.2, 7.0, 0.0, 187.0))
        mes.add(Me( 11, "Язык говяжий", 16.0, 12.1, 2.2, 173.0))
        mes.add(Me( 12, "Язык свиной", 15.9, 16.0, 2.1, 208.0))
        mes.add(Me( 13, "Печень говяжья", 17.9, 3.7, 5.3, 127.0))
        mes.add(Me(14, "Печень свиная", 18.8, 3.8, 4.7, 109.0))
        mes.add(Me(15, "Сердце говяжье", 16.0, 3.5, 2.0, 96.0))
        mes.add(Me( 16, "Почки говяжьи", 15.2, 2.8, 1.9, 86.0))
        mes.add(Me( 17, "Вымя", 12.3, 13.7, 0.0, 173.0))
        mes.add(Me( 18, "Бройлеры (цыплята) 1 кат.", 18.7, 16.1, 0.0, 220.0))
        mes.add(Me(19, "Бройлеры (цыплята) 2 кат.", 19.7, 11.2, 0.0, 180.0))
        mes.add(Me(  20, "Курица 1 кат.", 18.2, 18.4, 0.0, 238.0))
        mes.add(Me(  21, "Курица 2 кат.", 21.2, 8.2, 0.0, 159.0))
        mes.add(Me(  22, "Куриная грудка", 23.6, 1.9, 0.0, 113.0))
        mes.add(Me(  23, "Куриные окорочка", 16.8, 10.2, 0.0, 158.0))
        mes.add(Me(  24, "Куриная печень", 19.1, 6.3, 0.6, 136.0))
        mes.add(Me(  25, "Куриное сердце", 15.8, 10.3, 0.8, 159.0))
        mes.add(Me( 26, "Индейка", 19.5, 22.0, 0.0, 276.0))
        mes.add(Me( 27, "Индейка, грудка", 23.6, 1.5, 0.0, 114.0))
        mes.add(Me( 28, "Индейка, фарш", 20.0, 8.0, 0.5, 161.0))
        mes.add(Me( 29, "Гусь домашний, мясо и кожа", 15.5, 36.3, 0.0, 389.0))
        mes.add(Me( 30, "Гусь домашний, мясо", 22.7, 7.1, 0.0, 161.0))
        mes.add(Me( 31, "Перепел, мясо и кожа", 19.6, 12.0, 0.0, 192.0))
        mes.add(Me( 32, "Утка домашняя, мясо и кожа", 15.8, 38.0, 0.0, 405.0))
        mes.add(Me( 33, "Утка дикая, мясо и кожа", 17.4, 15.2, 0.0, 211.0))
        mes.add(Me( 34, "Утка дикая, мясо", 19.8, 4.3, 0.0, 123.0))
        mes.add(Me( 35, "Страусиное мясо", 21.8, 2.3, 0.0, 114.0))
        mes.add(Me( 36, "Фазан, мясо и кожа", 22.7, 9.3, 0.0, 181.0))
        mes.add(Me( 37, "Фазан, грудка", 24.3, 3.2, 0.0, 133.0))
        mes.add(Me( 38, "Кролик", 21.2, 11.0, 0.0, 183.0))
        mes.add(Me(39, "Кабан", 21.5, 3.3, 0.0, 122.0))
        mes.add(Me(40, "Лось", 23.0, 1.5, 0.0, 111.0))
        mes.add(Me( 41, "Оленина", 19.5, 8.5, 0.0, 155.0))

        meList.layoutManager = LinearLayoutManager(this)
        meList.adapter = MeAdapter(mes, this)
    }
}