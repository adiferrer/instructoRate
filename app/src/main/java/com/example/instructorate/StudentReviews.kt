// StudentReviewsActivity.kt
package com.example.instructorate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StudentReviews : AppCompatActivity() {

    companion object {
        private val reviewsList = mutableListOf<CardViewItem>()

        fun addReview(review: CardViewItem) {
            reviewsList.add(review)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.student_reviews)

        // Initialize RecyclerView
        val adapter = CardViewAdapter(reviewsList)
        val reviewsRecyclerView = findViewById<RecyclerView>(R.id.reviewsRecyclerView)
        reviewsRecyclerView.adapter = adapter
        reviewsRecyclerView.layoutManager = LinearLayoutManager(this)
    }
}
