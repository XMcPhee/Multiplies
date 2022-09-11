package com.example.multiples

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MultiScore : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multi)

        val firstNum = intent.getIntExtra("firstNumber", -1)
        val secondNum = intent.getIntExtra("secondNumber", -1)

        val result = firstNum * secondNum

        val text = findViewById<TextView>(R.id.sum)
        text.text = result.toString()
    }
}