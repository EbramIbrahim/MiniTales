package com.example.auth

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.auth.splash.SplashScreen

const val authRoute = "auth"


sealed class AuthScreen(val route: String) {
    object Splash : AuthScreen("${authRoute}/splash")
    object Login : AuthScreen("${authRoute}/login")
    object Register : AuthScreen("${authRoute}/register")
}



fun NavGraphBuilder.authGraph(
    navController: NavController,
    onAuthSuccess: () -> Unit
) {

    navigation(startDestination = AuthScreen.Splash.route, route = authRoute) {
        composable(route = AuthScreen.Splash.route) {
            SplashScreen()
        }
    }

}






