package com.example.pesanin.ui.graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.pesanin.ui.screen.AddCarScreen
import com.example.pesanin.ui.screen.AddMotorScreen
import com.example.pesanin.ui.screen.DetailScreen
import com.example.pesanin.ui.screen.HomeScreen
import com.example.pesanin.ui.screen.MotorListScreen
import com.example.pesanin.ui.screen.ProfileScreen
import com.example.pesanin.ui.screen.SellingScreen
import com.example.pesanin.viewmodel.HomeViewModel

@Composable
fun BottomNavGraph(navController: NavHostController, viewModel: HomeViewModel) {
    NavHost(
        navController = navController,
        startDestination = NavScreen.Home.route
    ) {
        composable(route = BottomNavScreen.Home.route) {
            HomeScreen(viewModel, onNavigate = { id ->
                navController.navigate(route = "${NavScreen.Detail.route}?id=$id")
            })
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

        detailsNavGraph(navController = navController, viewModel)

        composable(route = NavScreen.CarAddScreen.route) {
            AddCarScreen(viewModel = viewModel)
        }

        composable(route = NavScreen.MotorAddScreen.route) {
            AddMotorScreen()
        }

    }
}

fun NavGraphBuilder.detailsNavGraph(navController: NavHostController, viewModel: HomeViewModel) {
    navigation(
        route = NavScreen.Home.route,
        startDestination = NavScreen.Home.route
    ) {


        composable(route = NavScreen.Detail.route) {
            DetailScreen(id, viewModel)
//            {
//                navController.navigate(BottomNavScreen.Selling.route)
//            }
        }
    }
}