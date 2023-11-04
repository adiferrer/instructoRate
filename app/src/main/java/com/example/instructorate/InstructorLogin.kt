package com.example.instructorate

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity


class InstructorLogin : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.instructor_login)

        val ucEmail = findViewById<EditText>(R.id.instructor_edit_uc_email)
        val password = findViewById<EditText>(R.id.instructor_edit_password)
        val btnLogin = findViewById<Button>(R.id.instructor_login_btn)

        btnLogin.setOnClickListener {
            if(ucEmail.text.toString().equals("msj2023@uc-bcf.edu.ph") &&
                password.text.toString().equals("msj2023")) {
                val intent = Intent(this, InstructorDashboard::class.java)
                val msg = intent.putExtra("name", "Maria")
                startActivity(intent)
            }
        }
    }
}