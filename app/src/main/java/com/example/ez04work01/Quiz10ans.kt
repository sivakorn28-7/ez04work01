package com.example.ez04work01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class Quiz10ans : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz10ans)

        val btna10: ImageButton = findViewById(R.id.btna10)
        val btnb10: ImageButton = findViewById(R.id.btnb10)
        val btnans10: ImageButton = findViewById(R.id.btnans10)
        val btnc10: ImageButton = findViewById(R.id.btnc10)

        val receivedIntent = intent
        val scorene =receivedIntent.getIntExtra("sc",0)

        btna10.setOnClickListener{
            val intent = Intent(this, Finalscore::class.java)
            intent.putExtra("sc", scorene)
            startActivity(intent)
        }

        btnb10.setOnClickListener{
            val intent = Intent(this,  Finalscore::class.java)
            intent.putExtra("sc", scorene)
            startActivity(intent)
        }

        btnans10.setOnClickListener{
            val intent = Intent(this,  Finalscore::class.java)
            intent.putExtra("sc", scorene+1)
            startActivity(intent)
        }

        btnc10.setOnClickListener {
            val intent = Intent(this,  Finalscore::class.java)
            intent.putExtra("sc", scorene)
            startActivity(intent)
        }
    }
}