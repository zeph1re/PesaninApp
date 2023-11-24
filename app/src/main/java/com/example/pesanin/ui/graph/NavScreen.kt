package com.example.pesanin.ui.graph

sealed class NavScreen (
    val route : String,
    val title : String,
) {
    object Home : NavScreen(
        route = "home",
        title = "home",
    )

    object Detail : NavScreen(
        route = "detail",
        title = "detail"
    )




}