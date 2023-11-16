package com.example.instructorate
import android.content.Context
import android.util.AttributeSet
import android.widget.ImageButton
import android.widget.LinearLayout

class StudentBottomMenuBar @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    init {
        inflate(context, R.layout.student_bottom_menu_bar, this)

//         Find and set click listeners for your ImageButtons
        val dashboardBtn = findViewById<ImageButton>(R.id.dashboard_icon)
        val studentReviewsBtn = findViewById<ImageButton>(R.id.student_reviews_icon)

        dashboardBtn.setOnClickListener {
//            val intent = Intent(this, InstructorDashboard::class.java)

        }

        studentReviewsBtn.setOnClickListener {
            // Handle button2 click
        }
    }
}
