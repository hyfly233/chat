package com.hyfly.chat.ui.home

import androidx.compose.material.BottomAppBar
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun Home() {
    Scaffold(
        bottomBar = {
            BottomAppBar(
                contentColor = MaterialTheme.colors.onPrimary,
                backgroundColor = MaterialTheme.colors.primary
            ) {
                Text(
                    text = "BottomAppBar01",
                    style = MaterialTheme.typography.body2
                )

                Text(
                    text = "BottomAppBar02",
                    style = MaterialTheme.typography.body2
                )
            }
        }
    ) {
    }
}

@Preview
@Composable
fun HomePreview() {
    Home()
}
