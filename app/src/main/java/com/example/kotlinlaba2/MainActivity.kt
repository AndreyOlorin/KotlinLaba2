package com.example.kotlinlaba2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.startButton)
        var textView = findViewById<TextView>(R.id.textView)
        var yourNumber = findViewById<EditText>(R.id.yourNumber)
        var endNumber = 130.0
        var a = 2.0
        var b = 1.0
        var result = 1.0


        button.setOnClickListener(){

            a = 2.0
            b = 1.0
            result = 1.0
            var yourNumber1 = yourNumber.text.toString().toDouble()

            while (a != endNumber) {

                result *= (yourNumber1 - a)
                result /= (yourNumber1 - b)

                a += 2
                b += 2
            }
            textView.text = result.toString()
        }//1
    }
}