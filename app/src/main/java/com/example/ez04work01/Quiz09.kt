package com.example.ez04work01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class Quiz09 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz09)

        val head1: TextView = findViewById(R.id.head1)
        val btna9: ImageButton = findViewById(R.id.btna9)
        val btnb9: ImageButton = findViewById(R.id.btnb9)
        val btnans9: ImageButton = findViewById(R.id.btnans9)
        val btnc9: ImageButton = findViewById(R.id.btnc9)

        val receivedIntent = intent
        val scorene =receivedIntent.getIntExtra("sc",0)

        btna9.setOnClickListener{
            val intent = Intent(this, Quiz10::class.java)
            intent.putExtra("sc", scorene)
            startActivity(intent)
        }

        btnb9.setOnClickListener{
            val intent = Intent(this,  Quiz10::class.java)
            intent.putExtra("sc", scorene)
            startActivity(intent)
        }

        btnans9.setOnClickListener{
            val intent = Intent(this,  Quiz10::class.java)
            intent.putExtra("sc", scorene+1)
            startActivity(intent)
        }

        btnc9.setOnClickListener {
            val intent = Intent(this,  Quiz10::class.java)
            intent.putExtra("sc", scorene)
            startActivity(intent)
        }
    }
}