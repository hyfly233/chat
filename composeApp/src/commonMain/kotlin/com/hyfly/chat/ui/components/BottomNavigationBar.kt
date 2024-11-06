package com.hyfly.chat.ui.components

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.hyfly.chat.R

@Composable
fun BottomNavigationBar() {
    val items = listOf(
        NavigationItem.Chat,
        NavigationItem.Contacts,
        NavigationItem.Home
    )
    val selectedItem = remember { mutableStateOf(items[0]) }

    BottomNavigation {
        items.forEach { item ->
            BottomNavigationItem(
                icon = { Icon(ImageVector.vectorResource(id = item.icon), contentDescription = item.label) },
                label = { Text(item.label) },
                selected = selectedItem.value == item,
                onClick = { selectedItem.value = item }
            )
        }
    }
}

sealed class NavigationItem(val label: String, val icon: Int) {
    object Chat : NavigationItem("Chat", R.drawable.ic_chat)
    object Contacts : NavigationItem("Contacts", R.drawable.ic_contacts)
    object Home : NavigationItem("Home", R.drawable.ic_home)
}
