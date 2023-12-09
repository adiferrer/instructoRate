package com.example.instructorate

data class CardViewItem(
    val username: String,
    val professorName: String,
    val rating: Float,
    val reviewText: String,
    val avatarResId: Int = R.drawable.avatar_placeholder
)

