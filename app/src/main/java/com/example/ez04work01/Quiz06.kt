package com.example.ez04work01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class Quiz06 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz06)

        val head1: TextView = findViewById(R.id.head1)
        val btna6: ImageButton = findViewById(R.id.btna6)
        val btnb6: ImageButton = findViewById(R.id.btnb6)
        val btnans6: ImageButton = findViewById(R.id.btnans6)
        val btnc6: ImageButton = findViewById(R.id.btnc6)

        val receivedIntent = intent
        val scorene =receivedIntent.getIntExtra("sc",0)

        btna6.setOnClickListener{
            val intent = Intent(this, Quiz07::class.java)
            intent.putExtra("sc", scorene)
            startActivity(intent)
        }

        btnb6.setOnClickListener{
            val intent = Intent(this, Quiz07::class.java)
            intent.putExtra("sc", scorene)
            startActivity(intent)
        }

        btnans6.setOnClickListener{
            val intent = Intent(this, Quiz07::class.java)
            intent.putExtra("sc", scorene+1)
            startActivity(intent)
        }

        btnc6.setOnClickListener {
            val intent = Intent(this, Quiz07::class.java)
            intent.putExtra("sc", scorene)
            startActivity(intent)
        }
    }
}