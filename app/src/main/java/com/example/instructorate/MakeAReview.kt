package com.example.instructorate

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.RatingBar
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MakeAReview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.make_a_review)

        // Dummy data for course spinner
        val courses = resources.getStringArray(R.array.student_courses)

        // Set up course spinner
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, courses)
        val spinner = findViewById<Spinner>(R.id.spinner)
        spinner.adapter = adapter

        // Handle form submission and update StudentReviews activity
        val postBtn = findViewById<Button>(R.id.post_form_btn)
        postBtn.setOnClickListener {
            // Get values from form
            val course = spinner.selectedItem.toString()
            val professorName = course // Replace with actual logic to get professor name
            val reviewText = findViewById<TextView>(R.id.review_text).text.toString()

            // Calculate average rating from individual criteria
            val averageRating = (findViewById<RatingBar>(R.id.ratingBar_curriculum_relevance).rating +
                    findViewById<RatingBar>(R.id.ratingBar_teaching_style).rating +
                    findViewById<RatingBar>(R.id.ratingBar_consideration_to_students).rating +
                    findViewById<RatingBar>(R.id.ratingBar_overall_performance).rating) / 4.0f

            val newReview = CardViewItem("Username", professorName, averageRating, reviewText, R.drawable.avatar_placeholder)
            StudentReviews.addReview(newReview)

            val intent = Intent(this, StudentReviews::class.java)
            this.startActivity(intent)
        }

        // Handle cancellation of form
        val cancelBtn = findViewById<Button>(R.id.cancel_form_btn)
        cancelBtn.setOnClickListener {
            // TODO: add confirmation before proceeding with cancellation of form
            val intent = Intent(this, StudentDashboard::class.java)
            val msg = intent.putExtra("name", "Juan")
            startActivity(intent)
        }
    }
}
