package com.example.multiples

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstNum = findViewById<TextView>(R.id.textView7)
        val secondNum = findViewById<TextView>(R.id.textView8)
        val button = findViewById<Button>(R.id.multiButton)

        var firstInt = Random.nextInt(1..13)
        var secondInt = Random.nextInt(1..13)

        firstNum.text = firstInt.toString()
        secondNum.text = secondInt.toString()

        button.setOnClickListener{
            val intent = Intent(this, MultiScore::class.java)
            intent.putExtra("Sum", firstInt * secondInt)
            startActivity(intent)
        }
    }
}