package com.hyfly.chat.ui.home

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun HomeScreen(modifier: Modifier) {
    Surface(modifier = modifier) {
        Text("Home Screen")
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    MaterialTheme {
        HomeScreen(modifier = Modifier)
    }
}
