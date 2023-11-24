package com.example.pesanin.ui.graph

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
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
    object Motor : BottomNavScreen(
        route = "motor",
        title = "motor",
        icon = Icons.Filled.Build
    )
    object Selling : BottomNavScreen(
        route = "selling",
        title = "selling",
        icon = Icons.Default.ShoppingCart
    )
    object Profile : BottomNavScreen(
        route = "profile",
        title = "profile",
        icon = Icons.Default.AccountCircle
    )

}