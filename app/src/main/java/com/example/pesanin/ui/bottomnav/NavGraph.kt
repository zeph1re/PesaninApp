package com.example.pesanin.ui.bottomnav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.pesanin.ui.home.HomeScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController, startDestination = BottomNavScreen.Home.route) {
        composable(BottomNavScreen.Home.route) {
            HomeScreen()
        }
    }
}

