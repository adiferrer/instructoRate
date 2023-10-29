package com.example.instructorate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val studentStartBtn = findViewById<Button>(R.id.student_start)
        studentStartBtn.setOnClickListener {
            val intent = Intent(this, StudentLogin::class.java)
//            val msg = intent.putExtra("name", "Juan")
            startActivity(intent)
        }

        val instructorStartBtn = findViewById<Button>(R.id.instructor_start)
        instructorStartBtn.setOnClickListener {
//            val intent = Intent(this, )
        }
    }
}