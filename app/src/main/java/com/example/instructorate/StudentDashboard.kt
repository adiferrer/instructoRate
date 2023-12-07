package com.example.instructorate

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AlertDialog

class StudentDashboard : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.student_dashboard)

        val intent = intent
        val msg = intent.getStringExtra("name")

        // Show a dialog with the welcome message
        showWelcomeDialog(msg ?: "Guest")
    }

    private fun showWelcomeDialog(name: String) {
        // Inflating a custom layout for the dialog
        val dialogView = layoutInflater.inflate(R.layout.student_dialog_welcome_custom, null)

        // Creating a transparent background dialog
        val dialog = AlertDialog.Builder(this, R.style.TransparentDialog)
            .setView(dialogView)
            .create()

        // Setting up dialog content and behavior
        dialogView.findViewById<TextView>(R.id.welcomeMessage).text = "Hi, $name!"
        dialogView.findViewById<Button>(R.id.yesButton).setOnClickListener {
            dialog.dismiss()
        }

        // Centering the dialog both horizontally and vertically
        val window = dialog.window
        val params = window?.attributes
        params?.gravity = Gravity.CENTER_HORIZONTAL or Gravity.CENTER_VERTICAL
        window?.attributes = params

        // Showing the dialog
        dialog.show()
    }
}