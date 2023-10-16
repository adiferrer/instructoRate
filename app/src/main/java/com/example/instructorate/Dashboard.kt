package com.example.instructorate

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.cardview.widget.CardView

class Dashboard : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)

        val textview = findViewById<TextView>(R.id.welcomeMsg)
        val intent = getIntent()
        val msg = intent.getStringExtra("name")
        textview.setText("Hi, " + msg + "!")

//        val cardView: CardView = findViewById(R.id.cardView1)
    }
}