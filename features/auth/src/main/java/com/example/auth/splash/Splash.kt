package com.example.auth.splash

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.auth.AuthScreen
import com.example.auth.R


@Composable
fun SplashScreen(navController: NavController) {
    SplashContent(navController)
}


@Composable
fun SplashContent(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            painter = painterResource(id = R.drawable.mini_tales),
            contentDescription = "mini tales logo",
            modifier = Modifier.clickable {
                navController.navigate(AuthScreen.Login.route)
            }
        )
    }
}






