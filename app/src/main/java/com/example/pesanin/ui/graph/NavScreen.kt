package com.example.pesanin.ui.graph

sealed class NavScreen (
    val route : String,
    val title : String,
) {

    object Auth : NavScreen("auth", "auth") {
        object  Login : NavScreen("login", "login")
        object  Register : NavScreen("register", "register")
    }
    object Home : NavScreen(
        route = "home",
        title = "home",
    )

    object Detail : NavScreen(
        route = "detail",
        title = "detail"
    )




}