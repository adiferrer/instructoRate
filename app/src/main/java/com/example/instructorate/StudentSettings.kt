package com.example.instructorate

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity

class StudentSettings : ComponentActivity() {
    private lateinit var loadingLayout: View
    private val handler = Handler(Looper.getMainLooper())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.student_settings)

        val logoutBtn = findViewById<Button>(R.id.student_logout_btn)

        loadingLayout = findViewById(R.id.loadingLayout)

        logoutBtn.isEnabled = true
        logoutBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            logoutBtn.isEnabled = false
            loadingLayout.visibility = View.VISIBLE

            handler.postDelayed({
                startActivity(intent)
            }, 2000)
        }
    }
}