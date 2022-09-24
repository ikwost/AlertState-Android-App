package com.ikwost.alertstate.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import coil.annotation.ExperimentalCoilApi

import com.ikwost.alertstate.navigation.Screen
import com.ikwost.alertstate.presentation.screen.login.LoginScreen
import com.ikwost.alertstate.presentation.screen.profile.ProfileScreen

@ExperimentalCoilApi
@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Login.route
    ) {
        composable(route = Screen.Login.route) {
            LoginScreen(navController = navController)
        }
        composable(route = Screen.Profile.route) {
            ProfileScreen(navController = navController)
        }
        /*composable(route = Screen.Map.route) {
            MapScreen(navController = navController)
        }*/
    }
}