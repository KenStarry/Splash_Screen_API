package com.example.splashscreenapi.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.splashscreenapi.LoginScreen
import com.example.splashscreenapi.MainScreen

@Composable
fun NavGraph(
    navHostController: NavHostController
) {

    NavHost(
        navController = navHostController,
        startDestination = Screen.Main.route
    ) {

        composable(route = Screen.Main.route) {
            MainScreen()
        }

        composable(route = Screen.Login.route) {
            LoginScreen()
        }

    }

}