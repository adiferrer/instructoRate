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
            val studentLoginIntent = Intent(this, StudentLogin::class.java)
            startActivity(studentLoginIntent)
        }

        val instructorStartBtn = findViewById<Button>(R.id.instructor_start)
        instructorStartBtn.setOnClickListener {
            val instructorLoginIntent = Intent(this, InstructorLogin::class.java)
            startActivity(instructorLoginIntent)
        }
    }
}