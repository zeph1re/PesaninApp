package com.example.pesanin.ui.graph

import android.content.Context
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.pesanin.data.SellingVehicleDatabase.Companion.getDatabase
import com.example.pesanin.repository.AuthRepository
import com.example.pesanin.ui.screen.auth.LoginScreen
import com.example.pesanin.ui.screen.auth.RegisterScreen
import com.example.pesanin.viewmodel.AuthViewModel




fun NavGraphBuilder.authNavGraph(navController: NavHostController) {

    navigation(
        route = Graph.AUTHENTICATION,
        startDestination = NavScreen.Auth.Login.route
    ) {
        composable(
            route = NavScreen.Auth.Login.route
        ) {
            LoginScreen ()
        }
        composable(route = NavScreen.Auth.Register.route) {
            RegisterScreen()
        }
    }

}


