package com.example.pesanin.ui.graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.pesanin.ui.screen.HomeScreen
import com.example.pesanin.ui.screen.MotorListScreen
import com.example.pesanin.ui.screen.ProfileScreen
import com.example.pesanin.ui.screen.SellingScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = NavScreen.Home.route
    ) {
        composable(route = BottomNavScreen.Home.route) {
            HomeScreen()
        }

        composable(
            route = BottomNavScreen.Motor.route
        ) {
            MotorListScreen()
        }

        composable(
            route = BottomNavScreen.Selling.route
        ) {
            SellingScreen()
        }

        composable(route = BottomNavScreen.Profile.route) {
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