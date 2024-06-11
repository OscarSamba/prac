package com.example.examapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class secondActivity2 : AppCompatActivity() {

    private val days =
        arrayOf("Monday", "Tuesday", "wednesday", "thursday", "Friday", "saturday", "sunday")
    private val minTemps = IntArray(7)
    private val maxTemps = IntArray(7)
    private val conditions = Array(7) { "" }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)
        val buttonClear = findViewById<Button>(R.id.btnClear)
        val buttonCalculate = findViewById<Button>(R.id.btnCalculate)
        var buttMainExit = findViewById<Button>(R.id.buttonExit)
        val buttonDetailView =findViewById<Button>(R.id.btnDetailView)
        val buttonExitMain = findViewById<Button>(R.id.buttonExit)
        val DetailActivity = findViewById<TextView>(R.id.Textview)

        buttonCalculate.setOnClickListener {
            calculateAverageTemperature()
        }


        buttonDetailView.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java).apply {
                putExtra("minTemps", minTemps)
                putExtra("maxTemps", minTemps)
                putExtra("conditions", conditions)
            }
            startActivity(intent)
        }

        buttonClear.setOnClickListener {
            (getString(R.string.Clear)) }

        buttonExitMain.setOnClickListener {
            finish()
        }
    }

    private fun calculateAverageTemperature() {
        TODO("Not yet implemented")
    }
}