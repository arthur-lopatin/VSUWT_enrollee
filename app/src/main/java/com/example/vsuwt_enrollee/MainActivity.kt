package com.example.vsuwt_enrollee

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.vsuwt_enrollee.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        demonstrateBasicOperations()
    }

    private fun demonstrateBasicOperations() {
        val stringBuilder = StringBuilder()

        // Пример работы с преобразованием строк
        val originalString = "Kotlin"
        val upperString = originalString.toUpperCase()
        stringBuilder.append("Original: $originalString, Upper Case: $upperString\n")

        // Базовая арифметика
        val a = 5
        val b = 3
        stringBuilder.append("Сумма $a и $b равна ${a + b}\n")

        // Пример интерполяции строк
        val year = 2024
        stringBuilder.append("Текущий год: $year\n")

        // Преобразование типов
        val numberString = "42"
        val number = numberString.toInt()
        stringBuilder.append("Строка преобразована в число: $number\n")

        // Пример условных операторов
        val age = 18
        val accessMessage = if (age >= 18) "Доступ разрешен" else "Доступ запрещен"
        stringBuilder.append("$accessMessage\n")

        // Пример с циклами
        for (i in 1..5) {
            stringBuilder.append("Цикл for: $i\n")
        }

        var count = 5
        while (count > 0) {
            stringBuilder.append("Цикл while: $count\n")
            count--
        }

        // Пример создания отдельной функции
        val result = multiply(4, 2)
        stringBuilder.append("Результат умножения: $result\n")

        // Пример работы с массивом
        val array = arrayOf(1, 2, 3, 4, 5)
        stringBuilder.append("Элементы массива: ${array.joinToString(", ")}\n")

        // Отображаем результаты в TextView (предполагается, что у вас есть TextView с id textView в вашем layout)
        binding.textView.text = stringBuilder.toString()
    }

    // Функция умножения
    private fun multiply(x: Int, y: Int): Int {
        return x * y
    }
}
