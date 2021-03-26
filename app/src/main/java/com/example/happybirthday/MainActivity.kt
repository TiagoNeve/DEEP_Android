package com.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dice_roler)

        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener {
            val resultTextView: TextView = findViewById(R.id.resultText)
            resultTextView.text = "6"

        }
    }
}