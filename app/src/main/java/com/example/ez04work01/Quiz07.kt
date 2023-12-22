package com.example.ez04work01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class Quiz07 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz07)

        val head1: TextView = findViewById(R.id.head1)
        val btna7: Button = findViewById(R.id.btna7)
        val btnb7: Button = findViewById(R.id.btnb7)
        val btnans7: Button = findViewById(R.id.btnans7)
        val btnc7: Button = findViewById(R.id.btnc7)

        val receivedIntent = intent
        val scorene =receivedIntent.getIntExtra("sc",0)

        btna7.setOnClickListener{
            val intent = Intent(this, Quiz08::class.java)
            intent.putExtra("sc", scorene)
            startActivity(intent)
        }

        btnb7.setOnClickListener{
            val intent = Intent(this, Quiz08::class.java)
            intent.putExtra("sc", scorene)
            startActivity(intent)
        }

        btnans7.setOnClickListener{
            val intent = Intent(this, Quiz08::class.java)
            intent.putExtra("sc", scorene+1)
            startActivity(intent)
        }

        btnc7.setOnClickListener {
            val intent = Intent(this, Quiz08::class.java)
            intent.putExtra("sc", scorene)
            startActivity(intent)
        }
    }
}