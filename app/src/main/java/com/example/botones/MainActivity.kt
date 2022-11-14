package com.example.botones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnInicio = this.findViewById<Button>(R.id.btninicio)
        btnInicio.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            //Start you next activity
            startActivity(intent)
        }
    }
}