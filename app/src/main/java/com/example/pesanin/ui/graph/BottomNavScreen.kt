package com.example.pesanin.ui.graph

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument

sealed class BottomNavScreen (
    val route : String,
    val title : String,
    val icon : ImageVector?,
    navArguments : List<NamedNavArgument> = emptyList()

) {
    object Home : BottomNavScreen(
        route = "home",
        title = "home",
        icon = Icons.Default.Home
    ) {
        object CarList: NavScreen (
            route = "car_list",
        )
        object CarDetail : NavScreen(
            route = "detail/{carId}",
            navArguments = listOf(navArgument("carId") {
                type = NavType.IntType
            })
        ) {
            fun createRoute(carId: Int) = "detail/${carId}"
        }

        object CarAddScreen : NavScreen(
            route = "add_car",

            )
    }
    object Motor : BottomNavScreen(
        route = "motor",
        title = "motor",
        icon = Icons.Filled.Build
    ) {
        object MotorList : NavScreen(
            route = "motor_list"
        )

        object MotorDetail : NavScreen(
            route = "detail/{carId}",
            navArguments = listOf(navArgument("carId") {
                type = NavType.IntType
            })
        ) {
            fun createRoute(carId: Int) = "detail/${carId}"
        }

        object MotorAddScreen : NavScreen(
            route = "add_motor"
        )
    }
    object Selling : BottomNavScreen(
        route = "selling",
        title = "selling",
        icon = Icons.Default.ShoppingCart
    )
    object Profile : BottomNavScreen(
        route = "profile",
        title = "profile",
        icon = Icons.Default.AccountCircle
    )

}