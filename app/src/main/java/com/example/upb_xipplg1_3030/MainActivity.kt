package com.example.upb_xipplg1_3030

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.button)
        val btn2 = findViewById<Button>(R.id.button2)

        btn.setOnClickListener {
            val Intent = Intent(this, ActivityCalon::class.java)
            startActivity(Intent)

            btn2.setOnClickListener {
                val Intent = Intent(this, ActivityTPS::class.java)
                startActivity(Intent)
            }
        }
    }
}