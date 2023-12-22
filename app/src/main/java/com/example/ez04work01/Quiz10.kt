package com.example.ez04work01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class Quiz10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz10)

        val head1: TextView = findViewById(R.id.head1)
        val btnnext: Button = findViewById(R.id.btnnext)

        val receivedIntent = intent
        val scorene =receivedIntent.getIntExtra("sc",0)


        btnnext.setOnClickListener{
            val intent = Intent(this,  Quiz10ans::class.java)
            intent.putExtra("sc", scorene)
            startActivity(intent)
        }

    }
}