package com.guido.outcoding.screens

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.guido.outcoding.navigation.AppScreens

@Composable
fun DetailScreen(navController: NavController){

    Button(onClick = { navController.navigate(AppScreens.HomeScreen.route) })
    { Text("Home") }

}