package com.example.pesanin.ui.graph

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen (
    val route : String,
    val title : String,
    val icon : ImageVector

) {
    object Home : BottomBarScreen(
        route = "home",
        title = "home",
        icon = Icons.Default.Home
    )
    object Car : BottomBarScreen(
        route = "car",
        title = "car",
        icon = Icons.Filled.AddCircle
    )
    object Motor : BottomBarScreen(
        route = "motor",
        title = "motor",
        icon = Icons.Filled.Build
    )
    object Selling : BottomBarScreen(
        route = "selling",
        title = "selling",
        icon = Icons.Default.ShoppingCart
    )
    object Profile : BottomBarScreen(
        route = "profile",
        title = "profile",
        icon = Icons.Default.AccountCircle
    )

}