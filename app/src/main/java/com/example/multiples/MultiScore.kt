package com.example.multiples

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MultiScore : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multi)

        val product = intent.getIntExtra("Sum", -1)

        val text = findViewById<TextView>(R.id.sum)
        text.text = product.toString()
    }
}