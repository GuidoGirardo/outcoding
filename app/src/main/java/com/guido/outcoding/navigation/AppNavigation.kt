package com.guido.outcoding.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.guido.outcoding.screens.DetailScreen
import com.guido.outcoding.screens.HomeScreen
import androidx.navigation.compose.composable
import com.guido.outcoding.model.ModelItem

@Composable
fun AppNavigation(items: List<ModelItem>) {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = AppScreens.HomeScreen.route) {

        composable(route = AppScreens.HomeScreen.route) {
            HomeScreen(navController, items)
        }
        composable(route = AppScreens.DetailScreen.route) {
            DetailScreen(navController)
        }

    }

}