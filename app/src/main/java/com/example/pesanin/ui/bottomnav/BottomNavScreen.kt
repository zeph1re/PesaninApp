package com.example.pesanin.ui.bottomnav

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavScreen (
    val route : String,
    val title : String,
    val icon : ImageVector

) {

    object Home : BottomNavScreen(
        route = "home",
        title = "home",
        icon = Icons.Default.Home
    )
    object Selling : BottomNavScreen(
        route = "home",
        title = "home",
        icon = Icons.Default.Home
    )
    object Profile : BottomNavScreen(
        route = "home",
        title = "home",
        icon = Icons.Default.Home
    )
    object Car : BottomNavScreen(
        route = "home",
        title = "home",
        icon = Icons.Default.Home
    )
    object Motor : BottomNavScreen(
        route = "home",
        title = "home",
        icon = Icons.Default.Home
    )

}