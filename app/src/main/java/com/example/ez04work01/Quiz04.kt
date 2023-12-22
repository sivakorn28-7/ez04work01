package com.example.ez04work01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Quiz04 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz04)

        val head1: TextView = findViewById(R.id.head1)
        val btna4: Button = findViewById(R.id.btna4)
        val btnb4: Button = findViewById(R.id.btnb4)
        val btnans4: Button = findViewById(R.id.btnans4)
        val btnc4: Button = findViewById(R.id.btnc4)

        val receivedIntent = intent
        val scorene =receivedIntent.getIntExtra("sc",0)

        btna4.setOnClickListener{
            val intent = Intent(this, Quiz05::class.java)
            intent.putExtra("sc", scorene)
            startActivity(intent)
        }

        btnb4.setOnClickListener{
            val intent = Intent(this, Quiz05::class.java)
            intent.putExtra("sc", scorene)
            startActivity(intent)
        }

        btnans4.setOnClickListener{
            val intent = Intent(this, Quiz05::class.java)
            intent.putExtra("sc", scorene+1)
            startActivity(intent)
        }

        btnc4.setOnClickListener {
            val intent = Intent(this, Quiz05::class.java)
            intent.putExtra("sc", scorene)
            startActivity(intent)
        }
    }
}