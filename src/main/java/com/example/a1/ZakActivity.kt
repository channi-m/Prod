package com.example.a1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ZakActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zak)

        val zakList: RecyclerView = findViewById(R.id.zakList)
        val zaks = arrayListOf<Zak>()

        zaks.add(Zak(1, "Ассорти \"в азиатском стиле\"", 77.7, 1.4, 5.0, 7.2))
        zaks.add(Zak(2, "Ассорти \"мясное на хлебе\"", 375.2, 11.1, 26.1, 25.5))
        zaks.add(Zak(3, "Ассорти \"рыбное на хлебе\"", 257.9, 14.6, 12.9, 22.2))
        zaks.add(Zak(4, "Ассорти \"фруктовое\"", 59.4, 2.4, 1.3, 10.3))
        zaks.add(Zak(5, "Бутерброд \"закрытый с говяжьими котлетами, по 1-54\"", 224.0, 11.1, 6.2, 30.2))
        zaks.add(Zak(6, "Бутерброд \"из баклажан\"", 97.8, 4.3, 2.0, 16.8))
        zaks.add(Zak(7, "Бутерброд \"из жареного мяса\"", 267.4, 9.4, 25.0, 1.2))
        zaks.add(Zak(8, "Бутерброд \"из плавленого сыра\"", 395.9, 8.4, 38.5, 4.2))
        zaks.add(Zak(9, "Бутерброд \"из сыра\"", 403.2, 16.9, 35.8, 3.6))
        zaks.add(Zak(10, "Бутерброд \"из творога с сельдью\"", 217.2, 12.8, 17.7, 1.8))
        zaks.add(Zak(11, "Бутерброд \"из хрена\"", 433.2, 4.6, 44.9, 3.0))
        zaks.add(Zak(12, "Бутерброд \"пикантный\"", 316.6, 11.8, 20.8, 21.9))
        zaks.add(Zak(13, "Бутерброд \"с зернистой икрой кеты, по 1-50\"", 278.6, 13.1, 9.3, 35.7))
        zaks.add(Zak(14, "Бутерброд \"с брынзой\"", 235.9, 8.1, 4.0, 44.8))
        zaks.add(Zak(15, "Бутерброд \"с горчичным маслом\"", 360.3, 6.5, 23.4, 33.0))
        zaks.add(Zak(16, "Бутерброд \"с икрой осетровой, зернистой\"", 267.0, 12.4, 8.3, 35.7))
        zaks.add(Zak(17, "Бутерброд \"с килькой\"", 307.8, 7.3, 20.3, 25.6))
        zaks.add(Zak(18, "Бутерброд \"с килькой и яйцом, по 1-52\"", 233.0, 10.9, 10.6, 23.4))
        zaks.add(Zak(19, "Бутерброд \"с любительской колбасой, по 1-48\"", 275.0, 10.6, 17.9, 17.8))
        zaks.add(Zak(20, "Бутерброд \"с морковью и сыром\"", 206.0, 7.1, 11.6, 19.4))
        zaks.add(Zak(21, "Бутерброд \"с отварной говядиной, по 1-46\"", 122.0, 7.6, 3.7, 14.2))
        zaks.add(Zak(22, "Бутерброд \"с селедочным маслом\"", 341.8, 6.4, 22.3, 30.7))
        zaks.add(Zak(23, "Бутерброд \"с соленой горбушей, по 1-50\"", 220.0, 13.4, 5.4, 29.6))
        zaks.add(Zak(24, "Бутерброд \"с творогом и изюмом\"", 295.5, 11.8, 23.8, 9.1))
        zaks.add(Zak(25, "Горячий \"бутерброд\"", 301.6, 7.7, 26.4, 8.8))
        zaks.add(Zak(26, "Гренки \"из пшеничного хлеба (1-й вариант)\"", 213.8, 9.7, 1.1, 44.0))
        zaks.add(Zak(27, "Гренки \"острые\"", 269.3, 15.4, 13.2, 23.6))
        zaks.add(Zak(28, "Гренки \"с сыром\"", 295.2, 13.9, 13.6, 31.3))
        zaks.add(Zak(29, "Закуска \"Уральский рулет\"", 220.8, 16.3, 16.7, 1.5))
        zaks.add(Zak(30, "Закуска \"из плавленого сыра с яйцом и майонезом\"", 355.3, 17.3, 31.1, 1.6))
        zaks.add(Zak(31, "Закуска \"овощная с чесноком (марийское национальное блюдо)\"", 166.4, 1.7, 12.5, 12.5))
        zaks.add(Zak(32, "Закуска \"свекольная с орехами\"", 177.6, 6.9, 5.9, 25.8))
        zaks.add(Zak(33, "Заливное \"из птицы или дичи, или мясных продуктов в форме\"", 213.6, 18.7, 14.4, 2.4))
        zaks.add(Zak(34, "Икра \"овощная закусочная\"", 85.7, 2.0, 4.8, 9.1))
        zaks.add(Zak(35, "Икра \"осетровых рыб и икра кетовая\"", 308.5, 16.7, 22.4, 10.7))
        zaks.add(Zak(36, "Канапе \"с бужениной и окороком\"", 354.9, 9.9, 27.6, 18.0))
        zaks.add(Zak(37, "Канапе \"с икрой и севрюгой\"", 253.5, 11.5, 15.1, 19.0))
        zaks.add(Zak(38, "Канапе \"с икрой, семгой и осетром\"", 289.2, 19.0, 15.1, 20.7))
        zaks.add(Zak(39, "Канапе \"с килькой и яйцом\"", 238.7, 11.4, 16.2, 12.6))
        zaks.add(Zak(40, "Канапе \"с паштетом\"", 267.3, 8.6, 16.2, 23.1))
        zaks.add(Zak(41, "Канапе \"с паюсной икрой\"", 233.3, 10.2, 14.0, 17.7))
        zaks.add(Zak(42, "Канапе \"с сыром\"", 388.5, 13.4, 28.2, 21.7))
        zaks.add(Zak(43, "Канапе \"с сыром и окороком\"", 364.9, 12.8, 27.1, 18.5))
        zaks.add(Zak(44, "Квашеная \"капуста с орехами\"", 82.8, 4.7, 0.2, 16.6))
        zaks.add(Zak(45, "Колбаса \"русская, свадебная\"", 160.9, 13.1, 11.8, 0.5))
        zaks.add(Zak(46, "Колбаски \"из сельдерея\"", 114.0, 5.3, 5.1, 12.6))
        zaks.add(Zak(47, "Колбасные \"мясные изделия, запеченные в тесте\"", 265.1, 11.6, 14.3, 23.9))
        zaks.add(Zak(48, "Корзиночки \"(тарталетки) для закусок\"", 342.0, 9.4, 15.9, 43.0))
        zaks.add(Zak(49, "Корзиночки \"с крабами, креветками, кальмарами или морским гребешком\"", 360.4, 11.5, 25.6, 22.4))
        zaks.add(Zak(50, "Корзиночки \"с паштетом\"", 318.6, 11.8, 20.8, 22.3))
        zaks.add(Zak(51, "Корзиночки \"с салатом\"", 327.9, 10.8, 21.9, 23.2))
        zaks.add(Zak(52, "Корзиночки \"с языком или ветчиной\"", 311.6, 11.3, 19.3, 24.8))
        zaks.add(Zak(53, "Лазанки \"из картофеля\"", 60.7, 3.4, 3.6, 3.9))
        zaks.add(Zak(54, "Лососина, семга, кета \"малосоленые\"", 218.6, 33.0, 9.1, 1.4))
        zaks.add(Zak(55, "Масса \"из ветчины\"", 327.3, 17.4, 28.5, 0.3))
        zaks.add(Zak(56, "Масса \"из брынзы\"", 273.1, 13.2, 24.0, 1.0))
        zaks.add(Zak(57, "Масса \"из сыра для бутербродов\"", 451.7, 18.1, 41.1, 2.6))
        zaks.add(Zak(58, "Острая \"закуска\"", 32.6, 1.7, 0.1, 6.5))
        zaks.add(Zak(59, "Расстегаи \"закусочные\"", 266.4, 13.3, 9.6, 33.8))
        zaks.add(Zak(60, "Соленые \"фаршированные огурцы\"", 65.3, 3.6, 3.0, 6.4))
        zaks.add(Zak(61, "Студень \"говяжий\"", 209.3, 26.6, 9.9, 3.7))
        zaks.add(Zak(62, "Студень \"из субпродуктов птицы\"", 347.4, 30.2, 24.4, 1.9))
        zaks.add(Zak(63, "Студень \"свиной\"", 354.6, 25.1, 27.1, 2.7))
        zaks.add(Zak(64, "Творог \"с орехами и чесноком\"", 358.2, 16.4, 20.5, 28.9))
        zaks.add(Zak(65, "Творожные \"шарики\"", 316.3, 13.6, 26.4, 6.5))
        zaks.add(Zak(66, "Творожный \"бутерброд\"", 242.7, 9.5, 11.2, 27.6))
        zaks.add(Zak(67, "Фарш \"из пасты 'Океан'\"", 177.5, 14.8, 10.9, 5.3))
        zaks.add(Zak(68, "Холодец \"по домашнему\"", 257.8, 26.1, 15.5, 3.6))
        zaks.add(Zak(69, "Яйца \"фаршированные креветками\"", 247.4, 10.3, 22.2, 1.6))

        zakList.layoutManager = LinearLayoutManager(this)
        zakList.adapter = ZakAdapter(zaks, this)
    }
}