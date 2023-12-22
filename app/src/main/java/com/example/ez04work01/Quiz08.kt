package com.example.ez04work01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Quiz08 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz08)

        val head1: TextView = findViewById(R.id.head1)
        val btna8: Button = findViewById(R.id.btna8)
        val btnb8: Button = findViewById(R.id.btnb8)
        val btnans8: Button = findViewById(R.id.btnans8)
        val btnc8: Button = findViewById(R.id.btnc8)

        val receivedIntent = intent
        val scorene =receivedIntent.getIntExtra("sc",0)

        btna8.setOnClickListener{
            val intent = Intent(this, Quiz09::class.java)
            intent.putExtra("sc", scorene)
            startActivity(intent)
        }

        btnb8.setOnClickListener{
            val intent = Intent(this, Quiz09::class.java)
            intent.putExtra("sc", scorene)
            startActivity(intent)
        }

        btnans8.setOnClickListener{
            val intent = Intent(this, Quiz09::class.java)
            intent.putExtra("sc", scorene+1)
            startActivity(intent)
        }

        btnc8.setOnClickListener {
            val intent = Intent(this, Quiz09::class.java)
            intent.putExtra("sc", scorene)
            startActivity(intent)
        }
    }
}