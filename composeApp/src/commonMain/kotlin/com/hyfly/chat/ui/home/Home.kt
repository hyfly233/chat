package com.hyfly.chat.ui.home

import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.navigation.ModalBottomSheetLayout
import androidx.compose.material.navigation.rememberBottomSheetNavigator
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.hyfly.chat.ui.components.MessageListItem
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun Home() {
    val bottomSheetNavigator = rememberBottomSheetNavigator()
    val navController = rememberNavController(bottomSheetNavigator)

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    println(currentDestination)

    ModalBottomSheetLayout(bottomSheetNavigator) {
        Scaffold(bottomBar = {
            NavigationBar(
                contentColor = MaterialTheme.colors.primary,
            ) {
                NavigationBarItem(icon = {
                    Icon(
                        Icons.Default.Home, contentDescription = "Home"
                    )
                }, selected = true, onClick = { navController.navigate("home") })
                NavigationBarItem(icon = {
                    Icon(
                        Icons.Default.Info, contentDescription = "Details"
                    )
                }, selected = false, onClick = { navController.navigate("details") })
                NavigationBarItem(icon = {
                    Icon(
                        Icons.Default.Settings, contentDescription = "Settings"
                    )
                }, selected = false, onClick = { navController.navigate("settings") })
            }
        }, content = {
            NavHost(navController, startDestination = "home") {
                composable("home") { HomeScreen(navController) }
                composable("details") { DetailsScreen(navController) }
                composable("settings") { SettingsScreen(navController) }
            }
        })
    }
}

@Composable
fun HomeScreen(navController: NavController) {
    // Home screen content
    Button(onClick = { navController.navigate("details") }) {
        Text("Go to Details")
    }
}

@Composable
fun DetailsScreen(navController: NavController) {
    // Details screen content
    Button(onClick = { navController.navigate("settings") }) {
        Text("Go to Settings")
    }
}

@Composable
fun SettingsScreen(navController: NavController) {
    // Settings screen content
    MessageListItem()
}

@Preview
@Composable
fun HomePreview() {
    Home()
}
