package com.example.ez04work01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Quiz02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz02)

        val head1: TextView = findViewById(R.id.head1)
        val btna2: Button = findViewById(R.id.btna2)
        val btnb2: Button = findViewById(R.id.btnb2)
        val btnans2: Button = findViewById(R.id.btnans2)
        val btnc2: Button = findViewById(R.id.btnc2)

        val receivedIntent = intent
        val scorene =receivedIntent.getIntExtra("sc",0)

        btna2.setOnClickListener{
            val intent = Intent(this, Quiz03::class.java)
            intent.putExtra("sc", scorene)
            startActivity(intent)
        }

        btnb2.setOnClickListener{
            val intent = Intent(this, Quiz03::class.java)
            intent.putExtra("sc", scorene)
            startActivity(intent)
        }

        btnans2.setOnClickListener{
            val intent = Intent(this, Quiz03::class.java)
            intent.putExtra("sc", scorene+1)
            startActivity(intent)
        }

        btnc2.setOnClickListener{
            val intent = Intent(this, Quiz03::class.java)
            intent.putExtra("sc", scorene)
            startActivity(intent)
        }
    }
}