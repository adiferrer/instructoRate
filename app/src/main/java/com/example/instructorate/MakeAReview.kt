package com.example.instructorate

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.activity.ComponentActivity


class MakeAReview : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.make_a_review)

        val cancelBtn = findViewById<Button>(R.id.cancel_form_btn)
        cancelBtn.setOnClickListener {
            // TODO: add confirmation before proceeding with cancellation of form
            val intent = Intent(this, StudentDashboard::class.java)
            val msg = intent.putExtra("name", "Juan")
            startActivity(intent)
        }
    }
}