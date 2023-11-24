package com.example.pesanin.ui.graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pesanin.ui.screen.DetailScreen
import com.example.pesanin.ui.screen.HomeScreen


@Composable
fun NavGraph(
    navController: NavHostController = rememberNavController())
{
    NavHost(
        navController = navController,
        startDestination = NavScreen.Home.route
    ) {

        composable(route = NavScreen.Home.route) {
            HomeScreen(
////                onNavigate = {
////                id -> navController.navigate(route = NavScreen.Detail.route)
//            }
            )
        }
//        authNavGraph(navController = navController)
        composable(
            route = NavScreen.Detail.route) {
            DetailScreen()
        }
    }
}



