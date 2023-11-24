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

    object CarAddScreen : NavScreen(
        route = "addcar",
        title = "addcar"
    )

    object MotorAddScreen : NavScreen(
        route = "addmotor",
        title = "addmotor"
    )




}