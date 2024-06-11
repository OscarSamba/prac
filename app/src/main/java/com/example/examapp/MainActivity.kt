package com.example.examapp


import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
 val buttonStart = findViewById<Button>(R.id.buttonStart)
val buttonExit = findViewById<Button>(R.id.buttonExit)

        buttonStart.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }
        buttonExit.setOnClickListener{
            finish()
    }
    }
}