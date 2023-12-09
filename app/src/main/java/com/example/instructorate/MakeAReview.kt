// MakeAReviewActivity.kt
package com.example.instructorate

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.RatingBar
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MakeAReview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.make_a_review)

        // Dummy data for course spinner
        val courses = resources.getStringArray(R.array.student_courses)
        val courseToInstructorMap = mapOf(
            "CC17" to "Instructor A",
            "CC16" to "Instructor B",
            "CC18" to "Instructor C"
        )

        // Set up course spinner
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, courses)
        val spinner = findViewById<Spinner>(R.id.spinner)
        spinner.adapter = adapter

        // Set up instructor input field
        val instructorInput = findViewById<TextView>(R.id.course_instructor)
        // Handle spinner item selection
        spinner.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parentView: AdapterView<*>?, selectedItemView: View?, position: Int, id: Long) {
                // Get the selected course
                val selectedCourse = spinner.selectedItem.toString()

                // Use the course-to-instructor mapping to set the corresponding instructor
                val instructor = courseToInstructorMap[selectedCourse] ?: "Unknown Instructor"
                instructorInput.text = instructor
            }

            override fun onNothingSelected(parentView: AdapterView<*>?) {
                // Do nothing when nothing is selected
            }
        })

        // Handle form submission and update StudentReviews activity
        val postBtn = findViewById<Button>(R.id.post_form_btn)
        postBtn.setOnClickListener {
            // Get values from form
            val course = spinner.selectedItem.toString()
            val professorName = instructorInput.text.toString()
            val reviewText = findViewById<TextView>(R.id.review_text).text.toString()

            // Calculate average rating from individual criteria
            val averageRating = (findViewById<RatingBar>(R.id.ratingBar_curriculum_relevance).rating +
                    findViewById<RatingBar>(R.id.ratingBar_teaching_style).rating +
                    findViewById<RatingBar>(R.id.ratingBar_consideration_to_students).rating +
                    findViewById<RatingBar>(R.id.ratingBar_overall_performance).rating) / 4.0f

            val newReview = CardViewItem("User3456 (You)", professorName, averageRating, reviewText, R.drawable.avatar_placeholder)
            StudentReviews.addReview(newReview)

            // Show a Toast message after submitting a review
            Toast.makeText(this, "Review submitted successfully!", Toast.LENGTH_SHORT).show()

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
