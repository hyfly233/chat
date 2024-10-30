package com.hyfly.chat.model

import androidx.compose.runtime.Immutable

@Immutable
data class Message(
    val author: String,
    val content: String,
    val timestamp: String,
    val image: Int? = null,
//    val authorImage: Int = if (author == "me") R.drawable.ali else R.drawable.someone_else
)
