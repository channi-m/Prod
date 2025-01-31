package com.example.a1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fi)

        val fiList: RecyclerView = findViewById(R.id.fiList)
        val fis = arrayListOf<Fi>()

        fis.add(Fi(1, "Аргентина", 17.6, 2.0, 0.0, 88.0))
        fis.add(Fi(2, "Амур белый", 18.6, 5.3, 0.0, 134.0))
        fis.add(Fi(3, "Бычок", 17.5, 2.0, 0.0, 88.0))
        fis.add(Fi(4, "Вобла", 18.0, 2.8, 0.0, 95.0))
        fis.add(Fi(5, "Горбуша", 20.5, 6.5, 0.0, 140.0))
        fis.add(Fi(6, "Дорадо", 18.0, 3.0, 0.0, 96.0))
        fis.add(Fi(7, "Зубатка пестрая", 19.6, 5.3, 0.0, 126.0))
        fis.add(Fi(8, "Кальмар", 18.0, 2.2, 2.0, 100.0))
        fis.add(Fi(9, "Камбала дальневосточная", 15.7, 3.0, 0.0, 90.0))
        fis.add(Fi(10, "Карась", 17.7, 1.8, 0.0, 87.0))
        fis.add(Fi(11, "Карп", 16.0, 5.3, 0.0, 112.0))
        fis.add(Fi(12, "Кета", 19.0, 5.6, 0.0, 127.0))
        fis.add(Fi(13, "Кефаль", 21.0, 4.0, 0.0, 124.0))
        fis.add(Fi(14, "Кижуч", 21.6, 5.9, 0.0, 146.0))
        fis.add(Fi(15, "Килька балтийская", 14.1, 9.0, 0.0, 137.0))
        fis.add(Fi(16, "Килька каспийская", 18.5, 13.1, 0.0, 192.0))
        fis.add(Fi(17, "Китовое мясо", 22.5, 3.2, 0.0, 119.0))
        fis.add(Fi( 18, "Краб камчатский, мясо", 18.2, 1.0, 0.0, 82.0))
        fis.add(Fi(19, "Креветки", 19.0, 1.0, 0.0, 93.0))
        fis.add(Fi(20, "Лангуст", 18.8, 1.3, 0.5, 89.0))
        fis.add(Fi(21, "Лангуст вареный", 20.5, 0.7, 0.3, 90.0))
        fis.add(Fi(22, "Ледяная рыба", 15.5, 1.4, 0.0, 75.0))
        fis.add(Fi(23, "Лемонема", 15.9, 0.4, 0.0, 67.0))
        fis.add(Fi(24, "Лещ", 17.1, 4.1, 0.0, 105.0))
        fis.add(Fi(25, "Лобстер", 18.8, 0.9, 0.5, 90.0))
        fis.add(Fi(26, "Лосось атлантический (семга)", 20.0, 8.1, 0.0, 153.0))
        fis.add(Fi(27, "Лосось", 19.8, 6.3, 0.0, 142.0))
        fis.add(Fi(28, "Макрурус", 13.2, 0.8, 0.0, 60.0))
        fis.add(Fi(29, "Мидии", 11.5, 2.0, 3.3, 77.0))
        fis.add(Fi(30, "Минтай", 15.9, 0.9, 0.0, 72.0))
        fis.add(Fi(31, "Мойва весенняя", 13.1, 7.1, 0.0, 116.0))
        fis.add(Fi(32, "Мойва осенняя", 13.6, 18.1, 0.0, 217.0))
        fis.add(Fi(33, "Молоки рыб", 16.0, 2.9, 0.0, 90.0))
        fis.add(Fi(34, "Морской гребешок", 17.0, 2.0, 3.0, 92.0))
        fis.add(Fi(35, "Навага", 19.2, 1.6, 0.0, 91.0))
        fis.add(Fi(36, "Налим", 18.8, 0.6, 0.0, 81.0))
        fis.add(Fi(37, "Нерка красная", 20.3, 8.4, 0.0, 157.0))
        fis.add(Fi(38, "Окунь морской", 18.2, 3.3, 0.0, 103.0))
        fis.add(Fi(39, "Окунь речной", 18.5, 0.9, 0.0, 82.0))
        fis.add(Fi(40, "Омар", 18.8, 1.3, 0.5, 89.0))
        fis.add(Fi(41, "Омар вареный", 20.5, 0.7, 0.3, 90.0))
        fis.add(Fi(42, "Осетр каспийский", 16.4, 10.9, 0.0, 164.0))
        fis.add(Fi(43, "Осетр", 15.8, 15.4, 0.0, 202.0))
        fis.add(Fi(44, "Палтус белокорый", 18.9, 3.0, 0.0, 103.0))
        fis.add(Fi(45, "Пангасиус", 15.3, 3.0, 0.0, 89.0))
        fis.add(Fi(46, "Пикша", 17.2, 0.5, 0.0, 73.0))
        fis.add(Fi(47, "Плотва", 17.5, 2.0, 0.0, 88.0))
        fis.add(Fi(48, "Путассу", 18.5, 0.9, 0.0, 82.0))
        fis.add(Fi(49, "Рак речной", 15.5, 1.0, 1.2, 76.0))
        fis.add(Fi(50, "Рак речной вареный", 20.3, 1.3, 1.0, 97.0))
        fis.add(Fi(51, "Рапана", 16.7, 1.1, 0.0, 77.0))
        fis.add(Fi(52, "Сазан", 18.2, 2.7, 0.0, 97.0))
        fis.add(Fi(53, "Сельдь атлантическая нежирная", 19.1, 6.5, 0.0, 135.0))
        fis.add(Fi(54, "Сельдь атлантическая жирная", 17.7, 19.5, 0.0, 248.0))
        fis.add(Fi(55, "Сельдь тихоокеанская нежирная", 18.0, 7.0, 0.0, 135.0))
        fis.add(Fi(56, "Сельдь тихоокеанская жирная", 14.0, 15.0, 0.0, 191.0))
        fis.add(Fi(57, "Семга", 21.6, 6.0, 0.0, 140.0))
        fis.add(Fi(58, "Семга брюшки", 25.0, 24.0, 0.0, 310.0))
        fis.add(Fi(59, "Скумбрия атлантическая", 18.0, 13.2, 0.0, 191.0))
        fis.add(Fi(60, "Скумбрия", 18.7, 11.9, 0.0, 181.0))
        fis.add(Fi(61, "Сом", 17.2, 5.1, 0.0, 115.0))
        fis.add(Fi(62, "Ставрида океаническая", 18.5, 4.5, 0.0, 114.0))
        fis.add(Fi(63, "Стерлядь", 17.0, 6.1, 0.0, 122.0))
        fis.add(Fi(64, "Судак", 18.4, 1.1, 0.0, 84.0))
        fis.add(Fi(65, "Терпуг", 17.8, 3.4, 0.0, 102.0))
        fis.add(Fi(66, "Тилапия", 20.1, 1.7, 0.0, 96.0))
        fis.add(Fi(67, "Треска атлантическая", 17.8, 0.7, 0.0, 82.0))
        fis.add(Fi(68, "Треска тихоокеанская", 15.3, 0.4, 0.0, 69.0))
        fis.add(Fi(69, "Тунец голубой", 23.3, 4.9, 0.0, 144.0))
        fis.add(Fi(70, "Тунец желтоперый (желтохвостый)", 24.4, 0.5, 0.0, 109.0))
        fis.add(Fi(71, "Тунец полосатый", 22.0, 1.0, 0.0, 103.0))
        fis.add(Fi(72, "Устрица", 9.0, 2.0, 4.5, 72.0))
        fis.add(Fi(73, "Форель", 19.2, 2.1, 0.0, 97.0))
        fis.add(Fi(74, "Форель морская", 20.5, 4.3, 0.0, 157.0))
        fis.add(Fi(75, "Хек", 16.6, 2.2, 0.0, 86.0))
        fis.add(Fi(76, "Щука", 18.4, 1.1, 0.0, 84.0))
        fis.add(Fi(77, "Язык морской", 10.3, 5.2, 0.0, 88.0))
        fis.add(Fi(78, "Язь", 18.2, 1.0, 0.0, 81.0))
        fis.add(Fi(79, "Вобла вяленая", 46.4, 5.5, 0.0, 235.0))
        fis.add(Fi(80, "Горбуша горячего копчения", 23.2, 7.6, 0.0, 161.0))
        fis.add(Fi(81, "Горбуша соленая", 22.1, 9.0, 0.0, 169.0))
        fis.add(Fi(82, "Кальмары сушеные", 62.0, 2.0, 5.0, 286.0))
        fis.add(Fi(83, "Кета соленая", 24.3, 9.6, 0.0, 184.0))
        fis.add(Fi(84, "Килька балтийская горячего копчения", 21.3, 8.5, 0.0, 162.0))
        fis.add(Fi(85, "Килька балтийская соленая", 17.1, 7.6, 0.0, 137.0))
        fis.add(Fi(86, "Килька пряного посола", 14.8, 10.5, 0.0, 154.0))
        fis.add(Fi(87, "Крабовые палочки", 7.0, 0.7, 16.2, 95.0))
        fis.add(Fi(88, "Икра красная лососевая", 32.0, 15.0, 0.0, 263.0))
        fis.add(Fi(89, "Икра минтая пробойная", 27.9, 1.8, 1.1, 132.0))
        fis.add(Fi(90, "Икра мойвы \"Санта Бремор\"", 9.3, 38.6, 0.0, 382.0))
        fis.add(Fi(91, "Икра сельди", 31.6, 10.3, 0.0, 222.0))
        fis.add(Fi(92, "Икра черная осетровая зернистая", 28.4, 9.3, 0.6, 200.0))
        fis.add(Fi(93, "Икра осетровая паюсная", 38.2, 14.5, 1.5, 289.0))
        fis.add(Fi(94, "Икра щучья", 17.3, 2.0, 0.0, 87.0))
        fis.add(Fi(95, "Лосось соленый", 21.0, 20.5, 0.0, 269.0))
        fis.add(Fi(96, "Лещ вяленый", 42.0, 5.9, 0.0, 221.0))
        fis.add(Fi(97, "Лещ горячего копчения", 32.8, 4.5, 0.0, 172.0))
        fis.add(Fi(98, "Лещ холодного копчения", 29.7, 4.6, 0.0, 160.0))
        fis.add(Fi(99, "Масляная рыба копченая", 18.0, 12.0, 0.0, 180.0))
        fis.add(Fi(100, "Мойва копченая", 18.0, 22.0, 0.0, 270.0))
        fis.add(Fi(101, "Окунь морской горячего копчения", 23.5, 8.0, 0.0, 166.0))
        fis.add(Fi(102, "Осетр холодного копчения, балык", 20.4, 12.5, 0.0, 194.0))
        fis.add(Fi(103, "Салака копченая", 25.4, 5.6, 0.0, 152.0))
        fis.add(Fi(104, "Сельдь горячего копчения", 21.8, 14.3, 0.0, 215.0))
        fis.add(Fi(105, "Сельдь атлантическая среднесоленая", 17.0, 8.5, 0.0, 145.0))
        fis.add(Fi(106, "Сельдь тихоокеанская среднесоленая", 17.4, 17.1, 0.0, 224.0))
        fis.add(Fi(107, "Сельдь соленая", 19.8, 15.4, 0.0, 217.0))
        fis.add(Fi(108, "Семга соленая потрошеная с головой", 22.5, 12.5, 0.0, 202.0))
        fis.add(Fi(109, "Семга копченая", 22.5, 12.5, 0.0, 202.0))
        fis.add(Fi(110, "Скумбрия горячего копчения", 22.1, 23.8, 0.0, 307.0))
        fis.add(Fi(111, "Скумбрия холодного копчения", 23.4, 6.4, 0.0, 150.0))
        fis.add(Fi(112, "Форель копченая", 26.0, 3.1, 0.5, 132.0))
        fis.add(Fi(113, "Форель слабосоленая", 20.6, 10.1, 0.0, 186.0))
        fis.add(Fi( 114, "Форель слабосоленая жирная", 23.0, 15.0, 0.0, 227.0))
        fis.add(Fi(115, "Хамса соленая", 21.2, 9.0, 0.0, 166.0))
        fis.add(Fi(116, "Бычки в томатном соусе", 17.5, 2.0, 0.0, 88.0))
        fis.add(Fi(117, "Горбуша натуральная", 20.9, 5.8, 0.0, 136.0))
        fis.add(Fi(118, "Горбуша в томатном соусе", 15.0, 6.0, 4.1, 130.0))
        fis.add(Fi(119, "Кальмары", 15.5, 1.4, 3.1, 92.0))
        fis.add(Fi(120, "Килька в томатном соусе", 14.0, 12.0, 4.5, 182.0))
        fis.add(Fi(121, "Крабы", 18.7, 1.1, 0.1, 85.0))
        fis.add(Fi(122, "Лосось", 20.6, 6.3, 0.0, 144.0))
        fis.add(Fi(123, "Мидии", 17.5, 2.0, 0.0, 88.0))
        fis.add(Fi(124, "Морская капуста", 0.8, 5.1, 0.0, 49.0))
        fis.add(Fi(125, "Печень минтая", 6.0, 50.0, 0.0, 474.0))
        fis.add(Fi(126, "Печень трески", 4.2, 65.7, 1.2, 613.0))
        fis.add(Fi(127, "Сайра бланшированная в масле", 18.3, 23.3, 0.0, 283.0))
        fis.add(Fi(128, "Сардины с добавлением масла", 19.0, 18.0, 0.0, 238.0))
        fis.add(Fi(129, "Сардины в масле", 24.1, 13.9, 0.0, 221.0))
        fis.add(Fi(130, "Сардины в томатном соусе", 17.0, 9.9, 1.4, 162.0))
        fis.add(Fi(131, "Сельдь", 17.5, 2.0, 0.0, 88.0))
        fis.add(Fi(132, "Сельдь в растительном масле", 16.4, 26.5, 0.0, 301.0))
        fis.add(Fi(133, "Скумбрия натуральная", 17.7, 14.4, 0.0, 200.0))
        fis.add(Fi(134, "Скумбрия в масле", 14.4, 28.9, 0.0, 318.0))
        fis.add(Fi(135, "Ставрида в масле", 15.6, 27.4, 0.0, 309.0))
        fis.add(Fi(136, "Ставрида в томатном соусе", 14.8, 2.3, 73.0, 110.0))
        fis.add(Fi( 137, "Тунец натуральный", 22.5, 0.7, 0.0, 96.0))
        fis.add(Fi(138, "Тунец в масле", 22.0, 15.9, 0.0, 232.0))
        fis.add(Fi(139, "Шпроты в масле", 17.4, 32.4, 0.4, 363.0))
        fis.add(Fi(140, "Шпротный паштет", 12.0, 14.0, 5.3, 195.0))

        fiList.layoutManager = LinearLayoutManager(this)
        fiList.adapter = FiAdapter(fis, this)
    }
}