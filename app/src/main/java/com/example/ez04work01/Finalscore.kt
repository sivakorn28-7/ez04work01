package com.example.ez04work01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Finalscore : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finalscore)

        val btnrestart: Button = findViewById(R.id.btnrestart)

        val finalscore: TextView = findViewById(R.id.finalscore)

        val receivedIntent = intent
        val finalsc =receivedIntent.getIntExtra("sc",0)
        val congrat = "ยินดีด้วยคุณได้ $finalsc คะแนนจาก 10 คะแนนเต็ม"
        finalscore.setText(congrat.toString())

        btnrestart.setOnClickListener{
            val intent = Intent(this,  MainActivity::class.java)
            startActivity(intent)
        }
    }
}