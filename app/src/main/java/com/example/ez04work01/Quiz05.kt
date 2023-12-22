package com.example.ez04work01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Quiz05 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz05)

        val head1: TextView = findViewById(R.id.head1)
        val btna5: Button = findViewById(R.id.btna5)
        val btnb5: Button = findViewById(R.id.btnb5)
        val btnans5: Button = findViewById(R.id.btnans5)
        val btnc5: Button = findViewById(R.id.btnc5)

        val receivedIntent = intent
        val scorene =receivedIntent.getIntExtra("sc",0)

        btna5.setOnClickListener{
            val intent = Intent(this, Quiz06::class.java)
            intent.putExtra("sc", scorene)
            startActivity(intent)
        }

        btnb5.setOnClickListener{
            val intent = Intent(this, Quiz06::class.java)
            intent.putExtra("sc", scorene)
            startActivity(intent)
        }

        btnans5.setOnClickListener{
            val intent = Intent(this, Quiz06::class.java)
            intent.putExtra("sc", scorene+1)
            startActivity(intent)
        }

        btnc5.setOnClickListener {
            val intent = Intent(this, Quiz06::class.java)
            intent.putExtra("sc", scorene)
            startActivity(intent)
        }
    }
}