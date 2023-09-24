package com.example.sample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var number1EditText: EditText
    private lateinit var number2EditText: EditText
    private lateinit var addButton: Button
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        number1EditText = findViewById(R.id.number1EditText)
        number2EditText = findViewById(R.id.number2EditText)
        addButton = findViewById(R.id.addButton)
        resultTextView = findViewById(R.id.resultTextView)

        addButton.setOnClickListener {
            addNumbers()
        }
    }

    private fun addNumbers() {
        val number1 = number1EditText.text.toString().toDoubleOrNull() ?: 0.0
        val number2 = number2EditText.text.toString().toDoubleOrNull() ?: 0.0

        val sum = number1 + number2

        resultTextView.text = "Result: $sum"
    }
}