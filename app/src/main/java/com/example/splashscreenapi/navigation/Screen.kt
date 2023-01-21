package com.example.splashscreenapi.navigation

sealed class Screen(
    val route: String
) {

    object Login : Screen("login_screen")
    object Settings : Screen("settings_screen")
    object Orders : Screen("orders_screen")
    object Profile : Screen("profile_screen")
    object Main : Screen("main_screen")
}
