package com.example.a1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SouActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sou)

        val sousList: RecyclerView = findViewById(R.id.sousList)
        val souss = arrayListOf<Sous>()

        souss.add(Sous(1, "Анчоусное масло", 235.3, 16.2, 18.8, 0.3))
        souss.add(Sous(2, "Апельсиновый майонез", 514.1, 2.7, 54.5, 3.4))
        souss.add(Sous(3, "Апельсиновый соус", 55.3, 0.6, 4.6, 3.1))
        souss.add(Sous(4, "Заправка горчичная", 313.0, 1.2, 31.3, 7.0))
        souss.add(Sous(5, "Заправка для салатов", 447.2, 0.0, 47.5, 5.2))
        souss.add(Sous(6, "Коричневый соус", 97.5, 0.7, 9.1, 3.3))
        souss.add(Sous(7, "Маринад овощной без томата", 120.0, 1.2, 7.8, 12.1))
        souss.add(Sous(8, "Маринад овощной с томатом", 142.7, 3.2, 8.7, 13.7))
        souss.add(Sous(9, "Масло зеленое", 558.3, 1.2, 60.5, 2.2))
        souss.add(Sous(10, "Масло зеленое или килечное, или селедочное (селедочное)", 553.3, 5.0, 58.7, 1.2))
        souss.add(Sous(11, "Масло с кильками", 524.8, 6.4, 55.0, 0.9))
        souss.add(Sous(12, "Масло со шпротами или сардинами", 539.3, 3.3, 57.2, 3.1))
        souss.add(Sous(13, "Молочный соус", 143.4, 3.0, 11.5, 7.5))
        souss.add(Sous(14, "Перечная приправа", 137.8, 2.9, 11.0, 7.2))
        souss.add(Sous(15, "Приятный соус", 104.7, 1.5, 9.4, 3.9))
        souss.add(Sous(16, "Салатная заправка", 444.0, 0.1, 46.9, 5.7))
        souss.add(Sous(17, "Соус - белое вино", 214.9, 15.4, 14.5, 6.1))
        souss.add(Sous(18, "Соус белый", 44.8, 0.6, 3.5, 3.0))
        souss.add(Sous(19, "Соус белый (для запекания рыбы)", 148.6, 15.3, 7.4, 5.5))
        souss.add(Sous(20, "Соус белый основной", 133.0, 12.0, 7.4, 4.9))
        souss.add(Sous(21, "Соус белый с яйцом", 236.4, 12.8, 18.5, 5.0))
        souss.add(Sous(22, "Соус голландский", 432.8, 5.6, 44.9, 1.6))
        souss.add(Sous(23, "Соус голландский", 114.4, 2.4, 10.0, 4.0))
        souss.add(Sous(24, "Соус грибной", 97.1, 1.9, 7.7, 5.3))
        souss.add(Sous(25, "Соус грибной", 69.3, 1.1, 5.9, 3.1))
        souss.add(Sous(26, "Соус грибной с томатом", 133.6, 2.8, 9.8, 9.1))
        souss.add(Sous(27, "Соус из зелени", 310.5, 1.8, 32.3, 3.3))
        souss.add(Sous(28, "Соус из кильки", 68.8, 2.7, 5.2, 3.0))
        souss.add(Sous(29, "Соус из масла и крутого яйца", 376.4, 4.9, 39.0, 1.4))
        souss.add(Sous(30, "Соус из репчатого лука", 63.9, 0.9, 5.1, 3.8))
        souss.add(Sous(31, "Соус из сельдерея", 243.7, 2.8, 21.6, 10.2))
        souss.add(Sous(32, "Соус из хрена", 131.7, 1.9, 10.2, 8.5))
        souss.add(Sous(33, "Соус из шампиньонов со сливками.", 163.1, 4.0, 14.7, 4.0))
        souss.add(Sous(34, "Соус красный кисло-сладкий", 240.3, 14.1, 5.6, 35.5))
        souss.add(Sous(35, "Соус красный основной", 123.1, 9.9, 5.0, 10.1))
        souss.add(Sous(36, "Соус красный с вином", 186.8, 11.2, 11.0, 11.4))
        souss.add(Sous(37, "Соус красный с кореньями (для тефтелей)", 189.8, 11.0, 10.7, 13.1))
        souss.add(Sous(38, "Соус красный с кореньями (для тушеного мяса)", 199.6, 12.4, 10.0, 16.0))
        souss.add(Sous(39, "Соус красный с луком и грибами (охотничий)", 201.5, 10.1, 13.3, 11.2))
        souss.add(Sous(40, "Соус красный с луком и огурцами", 208.9, 10.9, 12.9, 13.2))
        souss.add(Sous(41, "Соус майонез", 665.5, 2.0, 72.0, 2.6))
        souss.add(Sous(42, "Соус майонез с желе (банкетный)", 374.5, 13.5, 35.0, 1.5))
        souss.add(Sous(43, "Соус майонез с корнишонами", 471.3, 3.1, 49.9, 2.6))
        souss.add(Sous(44, "Соус майонез с хреном", 522.4, 3.4, 54.4, 5.1))
        souss.add(Sous(45, "Соус майонез со сметаной", 515.7, 2.9, 54.9, 2.8))
        souss.add(Sous(46, "Соус молочный (для запекания овощей, мяса, рыбы)", 144.4, 3.4, 10.1, 10.6))
        souss.add(Sous(47, "Соус молочный (для подачи к блюду)", 109.0, 3.2, 7.0, 8.9))
        souss.add(Sous(48, "Соус молочный (сладкий)", 127.2, 2.9, 5.7, 17.2))
        souss.add(Sous(49, "Соус молочный густой (для фарширования)", 173.0, 3.6, 12.4, 12.6))
        souss.add(Sous(50, "Соус паровой", 213.5, 15.3, 14.2, 6.5))
        souss.add(Sous(51, "Соус польский", 559.0, 5.0, 59.5, 1.0))
        souss.add(Sous(52, "Соус сметанный", 326.3, 2.8, 32.3, 6.5))
        souss.add(Sous(53, "Соус сметанный с томатом", 305.8, 3.0, 29.5, 7.6))
        souss.add(Sous(54, "Соус сметанный с томатом и луком", 411.0, 4.3, 38.2, 13.2))
        souss.add(Sous(55, "Соус сметанный с хреном", 341.7, 3.7, 32.3, 9.7))
        souss.add(Sous(56, "Соус сухарный", 500.4, 3.2, 48.8, 13.0))
        souss.add(Sous(57, "Соус татарский", 283.8, 3.1, 26.1, 9.6))
        souss.add(Sous(58, "Соус томатный", 134.0, 7.1, 5.6, 14.6))
        souss.add(Sous(59, "Соус томатный", 133.2, 8.2, 5.1, 14.6))
        souss.add(Sous(60, "Соус томатный с грибами", 199.9, 8.4, 11.6, 16.5))
        souss.add(Sous(61, "Соус томатный с овощами", 219.4, 7.9, 14.0, 16.4))
        souss.add(Sous(62, "Соус универсальный", 211.1, 8.8, 17.8, 4.1))
        souss.add(Sous(63, "Соус хрен (со сметаной)", 217.7, 3.1, 19.3, 8.6))
        souss.add(Sous(64, "Сырный соус", 141.5, 6.0, 10.8, 5.5))
        souss.add(Sous(65, "Творожный майонез", 290.3, 7.6, 26.7, 5.1))
        souss.add(Sous(66, "Хлебный соус", 81.8, 1.4, 7.1, 3.2))
        souss.add(Sous(67, "Яично-масляный соус", 321.0, 3.0, 34.1, 0.6))

        sousList.layoutManager = LinearLayoutManager(this)
        sousList.adapter = SousAdapter(souss, this)
    }
}