package com.example.instructorate

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.activity.ComponentActivity


class StudentLogin : ComponentActivity() {
    private lateinit var loadingLayout: View
    private val handler = Handler(Looper.getMainLooper())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.student_login)

        val backBtn = findViewById<ImageButton>(R.id.student_back_button)
        val ucEmail = findViewById<EditText>(R.id.student_edit_uc_email)
        val password = findViewById<EditText>(R.id.student_edit_password)
        val btnLogin = findViewById<Button>(R.id.student_login_btn)
        loadingLayout = findViewById(R.id.loadingLayout)

        backBtn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnLogin.isEnabled = true
        btnLogin.setOnClickListener {
            if(ucEmail.text.toString().equals("jds2023@uc-bcf.edu.ph") &&
                password.text.toString().equals("jds2023")) {
                btnLogin.isEnabled = false
                loadingLayout.visibility = View.VISIBLE

                handler.postDelayed({
                    startDashboardActivity(ucEmail.text.toString())
                }, 2000)
            }
        }
    }

    private fun startDashboardActivity(studentEmail: String) {
        val intent = Intent(this, StudentDashboard::class.java)
        val msg = intent.putExtra("name", "Juan")
        startActivity(intent)
        finish()
    }
}