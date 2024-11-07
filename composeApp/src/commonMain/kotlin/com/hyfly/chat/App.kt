package com.hyfly.chat

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import com.hyfly.chat.ui.home.Home
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        Home()
    }
}
