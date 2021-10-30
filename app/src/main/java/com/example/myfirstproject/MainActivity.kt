package com.example.myfirstproject

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val randomizeButton: Button = findViewById(R.id.randomize_button)

        randommize()

        randomizeButton.setOnClickListener {
            randommize()
        }

        val listofValues = listOf<Int>(1, 2, 3, 4, 5, 6, 7)

    }

    fun randommize() {
        val helloTextView: TextView = findViewById(R.id.hello_text_view)
        val randomValue = Random.nextInt(100)
        helloTextView.text = randomValue.toString()
    }

}