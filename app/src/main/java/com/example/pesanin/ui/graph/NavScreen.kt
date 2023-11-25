package com.example.pesanin.ui.graph

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument

sealed class NavScreen(
    val route: String,
    navArguments: List<NamedNavArgument> = emptyList(),
) {

    object CarList : NavScreen(
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
