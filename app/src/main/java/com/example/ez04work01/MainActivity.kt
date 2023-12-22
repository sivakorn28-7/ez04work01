package com.example.ez04work01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val head1: TextView = findViewById(R.id.head1)
        val btna1: Button = findViewById(R.id.btna1)
        val btnb1: Button = findViewById(R.id.btnb1)
        val btnans1: Button = findViewById(R.id.btnans1)
        val btnc1: Button = findViewById(R.id.btnc1)

        var score: Int = 0

        btna1.setOnClickListener{
            val intent = Intent(this, Quiz02::class.java)
            intent.putExtra("sc", score)
            startActivity(intent)
        }

        btnb1.setOnClickListener{
            val intent = Intent(this, Quiz02::class.java)
            intent.putExtra("sc", score)
            startActivity(intent)
        }

        btnans1.setOnClickListener{
            val intent = Intent(this, Quiz02::class.java)
            intent.putExtra("sc", score+1)
            startActivity(intent)
        }

        btnc1.setOnClickListener{
            val intent = Intent(this, Quiz02::class.java)
            intent.putExtra("sc", score)
            startActivity(intent)
        }

    }
}