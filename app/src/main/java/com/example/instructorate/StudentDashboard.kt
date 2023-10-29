package com.example.instructorate

import UserReview
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity


class StudentDashboard : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.student_dashboard)

        val textview = findViewById<TextView>(R.id.welcomeMsg)
        val intent = getIntent()
        val msg = intent.getStringExtra("name")
        textview.setText("Hi, " + msg + "!")

        // Assuming you have a list of user reviews called "userReviews"
        val userReviews = mutableListOf(
            UserReview("User1", "Professor A", 4.0, "Great professor!"),
            UserReview("User2", "Professor B", 5.0, "Excellent teaching skills."),
            UserReview("User3", "Professor C", 2.5, "Average class experience.")
        )

        // Iterate through the userReviews list and create CardView for each review
//        for (review in userReviews) {
//            val cardView = layoutInflater.inflate(R.layout.cardview_item, null) as CardView
//
//            // Set text in the CardView elements
//            cardView.usernameTextView.text = review.userName
//            cardView.professorNameTextView.text = review.professorName
//            cardView.ratingBar.rating = review.rating.toFloat()
//            cardView.reviewTextView.text = review.reviewText
//
//            // Add the CardView to your layout
//            cardContainer.addView(cardView)
//        }

        // make bottom menu reusable
//        val dashboardButton = findViewById<ImageView>()
    }
}