package com.example.minitales

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.auth.authGraph
import com.example.auth.authRoute


@Composable
fun MainNavHost(
    navHostController: NavHostController,
    modifier: Modifier = Modifier
) {

    NavHost(
        navController = navHostController,
        startDestination = authRoute,
        modifier = modifier
    ) {
        authGraph(
            navController = navHostController,
            onAuthSuccess = {}
        )

    }

}









