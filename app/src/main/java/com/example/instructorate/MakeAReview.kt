package com.example.instructorate

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Spinner
import androidx.activity.ComponentActivity


class MakeAReview : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.make_a_review)

        val spinner: Spinner = findViewById(R.id.spinner)
        val spinnerItems = resources.getStringArray(R.array.student_courses)
//        val adapter = ArrayAdapter(this, android.R.layout.)

        val instructor: EditText = findViewById(R.id.course_instructor)

        val cancelBtn = findViewById<Button>(R.id.cancel_form_btn)
        cancelBtn.setOnClickListener {
            // TODO: add confirmation before proceeding with cancellation of form
            val intent = Intent(this, StudentDashboard::class.java)
            val msg = intent.putExtra("name", "Juan")
            startActivity(intent)
        }

        val postBtn = findViewById<Button>(R.id.post_form_btn)
        postBtn.setOnClickListener {
            // TODO: add confirmation
            val intent = Intent(this, StudentDashboard::class.java)
            val msg = intent.putExtra("name", "Juan")
            startActivity(intent)
        }
    }
}