package com.example.pesanin.ui.graph

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
        startDestination = BottomNavScreen.Home.route
    ) {

        navigation(
            route = BottomNavScreen.Home.route,
            startDestination = BottomNavScreen.Home.CarList.route
        ) {
            composable(route = BottomNavScreen.Home.CarList.route) {
                HomeScreen(
                    modifier = Modifier,
                    viewModel,
                    onAddCarClick = {
                        navController.navigate(
                            NavScreen.CarAddScreen.route
                        )
                    },
                    onCarClick = {
                        navController.navigate(
                            NavScreen.CarDetail.createRoute(
                                carId = it.id.toInt()
                            )
                        )
                    }
                )
            }

            composable(route = NavScreen.CarDetail.route) {
                DetailScreen(id = id, viewModel = viewModel)
            }

            composable(route = NavScreen.CarAddScreen.route) {
                AddCarScreen(viewModel = viewModel, onAddButtonClick = {

                    navController.navigate(
                        BottomNavScreen.Selling.route
                    )

                })
            }
        }

        navigation(
            route = BottomNavScreen.Motor.route,
            startDestination = BottomNavScreen.Motor.MotorList.route
        ) {
            composable(
                route = NavScreen.MotorList.route
            ) {
                MotorListScreen()
            }

            composable(
                route = NavScreen.MotorAddScreen.route
            ) {
                AddMotorScreen()
            }
        }


        composable(
            route = BottomNavScreen.Selling.route
        ) {
            SellingScreen()
        }

        composable(route = BottomNavScreen.Profile.route) {
            ProfileScreen()
        }
    }
}
