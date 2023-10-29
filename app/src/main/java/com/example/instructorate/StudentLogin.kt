package com.example.instructorate

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity


class StudentLogin : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.student_login)

        val ucEmail = findViewById<EditText>(R.id.edit_uc_email)
        val password = findViewById<EditText>(R.id.edit_password)
        val btnLogin = findViewById<Button>(R.id.login_btn)

        btnLogin.setOnClickListener {
            if(ucEmail.text.toString().equals("jds2023@uc-bcf.edu.ph") &&
                password.text.toString().equals("jds2023")) {
                val intent = Intent(this, StudentDashboard::class.java)
                val msg = intent.putExtra("name", "Juan")
                startActivity(intent)
            }
        }
    }
}