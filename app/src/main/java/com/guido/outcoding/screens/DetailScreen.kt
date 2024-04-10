package com.guido.outcoding.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.guido.outcoding.navigation.AppScreens
import com.guido.outcoding.ui.theme.Purple40

@Composable
fun DetailScreen(navController: NavController){

    val id = navController.currentBackStackEntry?.arguments?.getString("id") ?: ""
    val imageUrl = "https://cataas.com/cat/$id"
    val tags = navController.currentBackStackEntry?.arguments?.getString("tags") ?: ""
    val newTags = if (tags.length >= 2) {
        tags.substring(1, tags.length - 1)
    } else {
        ""
    }
    val owner = navController.currentBackStackEntry?.arguments?.getString("owner") ?: ""
    val updatedAt = navController.currentBackStackEntry?.arguments?.getString("updatedAt") ?: ""
    val createdAt = navController.currentBackStackEntry?.arguments?.getString("createdAt") ?: ""

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        AsyncImage(
            model = imageUrl,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .height(280.dp)
                .width(200.dp)
                .clip(RoundedCornerShape(16.dp))
        )
        Spacer(modifier = Modifier.height(40.dp))
        if(owner == "null") Text(text = "Owner: none", fontWeight = FontWeight.Bold, fontSize = 25.sp)
        else Text(text = "Owner: $owner", fontWeight = FontWeight.Bold, fontSize = 25.sp, color = Purple40)
        Spacer(modifier = Modifier.height(30.dp))
        if(newTags != "") {
            Text(
                text = newTags,
                modifier = Modifier
                    .background(Purple40, RoundedCornerShape(5.dp))
                    .padding(8.dp),
                fontSize = 20.sp,
                color = Color.White,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(30.dp))
        }
        Text("Created: $createdAt",
            modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
            textAlign = TextAlign.Center, fontSize = 15.sp)
        Spacer(modifier = Modifier.height(25.dp))
        Text("Updated: $updatedAt",
            modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
            textAlign = TextAlign.Center, fontSize = 15.sp)
        Spacer(modifier = Modifier.height(40.dp))
        Button(onClick = { navController.navigate(AppScreens.HomeScreen.route) })
        { Text("Home") }

    }

}