package com.guido.outcoding.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.guido.outcoding.navigation.AppScreens

@Composable
fun DetailScreen(navController: NavController){

    val id = navController.currentBackStackEntry?.arguments?.getString("id") ?: ""

    Column(){
        Button(onClick = { navController.navigate(AppScreens.HomeScreen.route) })
        { Text("Home") }
        Text(id)
    }

}