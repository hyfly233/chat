package com.hyfly.chat.ui.home

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun Home() {
    Scaffold(
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    icon = {
                        Icon(
                            imageVector = Icons.Default.AccountCircle,
                            contentDescription = null
                        )
                    },
                    label = {
                        Text(
                            text = "Home"
                        )
                    },
                    selected = true,
                    onClick = {}
                )
                NavigationBarItem(
                    icon = {
                        Icon(
                            imageVector = Icons.Default.AccountCircle,
                            contentDescription = null
                        )
                    },
                    label = {
                        Text(
                            text = "Chat"
                        )
                    },
                    selected = false,
                    onClick = {}
                )
            }
        },
        content = { innerPadding ->
            HomeScreen(modifier = Modifier.padding(innerPadding))
        }
    )
}

@Preview
@Composable
fun HomePreview() {
    Home()
}
