package com.example.instructorate

// CardViewAdapter.kt
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CardViewAdapter(private val items: List<CardViewItem>) :
    RecyclerView.Adapter<CardViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.cardview_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]

        // Set avatar image (use placeholder for now)
        holder.avatarImageView.setImageResource(R.drawable.avatar_placeholder)

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
}
