package com.example.instructorate
import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout

class StudentBottomMenuBar @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    init {
        inflate(context, R.layout.bottom_menu_bar, this)

        // Find and set click listeners for your ImageButtons
//        val button1 = findViewById<ImageButton>(R.id.button1)
//        val button2 = findViewById<ImageButton>(R.id.button2)
//
//        button1.setOnClickListener {
//            // Handle button1 click
//        }
//
//        button2.setOnClickListener {
//            // Handle button2 click
//        }
    }
}
