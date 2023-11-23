package com.example.pesanin.ui.graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.pesanin.ui.screen.CarListScreen
import com.example.pesanin.ui.screen.HomeScreen
import com.example.pesanin.ui.screen.MotorListScreen
import com.example.pesanin.ui.screen.ProfileScreen

@Composable
fun HomeNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = NavScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            HomeScreen(
                navHostController = navController
//                name = BottomBarScreen.Home.route,
//                onClick = {
//                    navController.navigate(NavScreen.Detail.route
            )
        }

        composable(
            route = BottomBarScreen.Car.route
        ) {
            CarListScreen()
        }

        composable(
            route = BottomBarScreen.Motor.route
        ) {
            MotorListScreen()
        }

        composable(route = BottomBarScreen.Profile.route) {
            ProfileScreen()
        }

//        detailsNavGraph(navController = navController)
    }
}

//fun NavGraphBuilder.detailsNavGraph(navController: NavHostController) {
//    navigation(
//        route = NavScreen.Detail.route,
//        startDestination = DetailsScreen.Information.route
//    ) {
//        composable(route = DetailsScreen.Information.route) {
//            ScreenContent(name = DetailsScreen.Information.route) {
//                navController.navigate(DetailsScreen.Overview.route)
//            }
//        }
//        composable(route = DetailsScreen.Overview.route) {
//            ScreenContent(name = DetailsScreen.Overview.route) {
//                navController.popBackStack(
//                    route = DetailsScreen.Information.route,
//                    inclusive = false
//                )
//            }
//        }
//    }
//}

sealed class DetailsScreen(val route: String) {
    object Information : DetailsScreen(route = "INFORMATION")
    object Overview : DetailsScreen(route = "OVERVIEW")
}