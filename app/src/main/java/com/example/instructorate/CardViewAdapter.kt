package com.example.instructorate

// CardViewAdapter.kt
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlin.math.roundToInt

class CardViewAdapter(private val items: List<CardViewItem>) :
    RecyclerView.Adapter<CardViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.cardview_item, parent, false)

        // Set top margin for the card view
        val layoutParams = view.layoutParams as ViewGroup.MarginLayoutParams
        layoutParams.topMargin = dpToPx(parent.context, 8) // Adjust the margin as needed
        view.layoutParams = layoutParams

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]

        // Set avatar image (use placeholder for now)
        holder.avatarImageView.setImageResource(item.avatarResId)

        holder.usernameTextView.text = item.username
        holder.professorNameTextView.text = item.professorName
        holder.ratingBar.rating = item.rating
        holder.reviewTextView.text = item.reviewText
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val avatarImageView: ImageView = itemView.findViewById(R.id.avatarImageView)
        val usernameTextView: TextView = itemView.findViewById(R.id.usernameTextView)
        val professorNameTextView: TextView = itemView.findViewById(R.id.professorNameTextView)
        val ratingBar: RatingBar = itemView.findViewById(R.id.ratingBar)
        val reviewTextView: TextView = itemView.findViewById(R.id.reviewTextView)
    }

    // Helper function to convert dp to pixels
    private fun dpToPx(context: Context, dp: Int): Int {
        val density = context.resources.displayMetrics.density
        return (dp * density).roundToInt()
    }
}
