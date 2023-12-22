package com.example.ez04work01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Quiz03 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz03)

        val head1: TextView = findViewById(R.id.head1)
        val btna3: Button = findViewById(R.id.btna3)
        val btnb3: Button = findViewById(R.id.btnb3)
        val btnans3: Button = findViewById(R.id.btnans3)
        val btnc3: Button = findViewById(R.id.btnc3)

        val receivedIntent = intent
        val scorene =receivedIntent.getIntExtra("sc",0)

        btna3.setOnClickListener{
            val intent = Intent(this, Quiz04::class.java)
            intent.putExtra("sc", scorene)
            startActivity(intent)
        }

        btnb3.setOnClickListener{
            val intent = Intent(this, Quiz04::class.java)
            intent.putExtra("sc", scorene)
            startActivity(intent)
        }

        btnans3.setOnClickListener{
            val intent = Intent(this, Quiz04::class.java)
            intent.putExtra("sc", scorene+1)
            startActivity(intent)
        }

        btnc3.setOnClickListener{
            val intent = Intent(this, Quiz04::class.java)
            intent.putExtra("sc", scorene)
            startActivity(intent)
        }
    }
}