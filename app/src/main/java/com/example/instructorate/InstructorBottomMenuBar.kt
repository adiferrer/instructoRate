package com.example.instructorate
import android.content.Context
import android.content.Intent
import android.util.AttributeSet
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.core.content.ContextCompat.startActivity

class InstructorBottomMenuBar @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    init {
        inflate(context, R.layout.instructor_bottom_menu_bar, this)

        val dashboardBtn = findViewById<ImageButton>(R.id.instructor_dashboard_icon)
        val listBtn = findViewById<ImageButton>(R.id.instructor_list_icon)
        val settingsBtn = findViewById<ImageButton>(R.id.instructor_settings_icon)

        dashboardBtn.setOnClickListener {
            val intent = Intent(context, InstructorDashboard::class.java)
            val msg = intent.putExtra("name", "Maria San Jose")
            context.startActivity(intent)
        }

        listBtn.setOnClickListener {
            val intent = Intent(context, InstructorClasses::class.java)
            context.startActivity(intent)
        }

        settingsBtn.setOnClickListener {
            val intent = Intent(context, InstructorSettings::class.java)
            context.startActivity(intent)
        }
    }
}
