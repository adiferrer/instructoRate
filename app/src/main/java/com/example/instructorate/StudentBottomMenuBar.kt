package com.example.instructorate
import android.content.Context
import android.content.Intent
import android.util.AttributeSet
import android.widget.ImageButton
import android.widget.LinearLayout

class StudentBottomMenuBar @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    init {
        inflate(context, R.layout.student_bottom_menu_bar, this)

        // Find and set click listeners for your ImageButtons
        val dashboardBtn = findViewById<ImageButton>(R.id.student_dashboard_icon)
        val studentReviewsBtn = findViewById<ImageButton>(R.id.student_reviews_icon)
        val studentAddReviewBtn = findViewById<ImageButton>(R.id.add_review_icon)

        dashboardBtn.setOnClickListener {
            val intent = Intent(context, StudentDashboard::class.java)
            val msg = intent.putExtra("name", "Juan")
            context.startActivity(intent)
        }

        studentReviewsBtn.setOnClickListener {
            val intent = Intent(context, StudentReviews::class.java)
            context.startActivity(intent)
        }

        studentAddReviewBtn.setOnClickListener {
            val intent = Intent(context, MakeAReview::class.java)
            context.startActivity(intent)
        }
    }
}
