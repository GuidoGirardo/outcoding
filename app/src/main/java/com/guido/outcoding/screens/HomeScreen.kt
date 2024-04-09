package com.guido.outcoding.screens

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.guido.outcoding.viewmodel.AppViewModel
import coil.compose.AsyncImage
import com.guido.outcoding.ui.theme.Purple40

@Composable
fun HomeScreen(navController: NavController, viewModel: AppViewModel) {

    val items = viewModel.retornarItems()

    LazyColumn {
        items(items) { item ->
            Card(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .clickable {
                        navController.navigate(
                            "detail?id=${item.id}&owner=${item.owner}&createdAt=${item.createdAt}&updatedAt=${item.updatedAt}&tags=${item.tags}"
                        )
                    }
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    val imageUrl = "https://cataas.com/cat/${item.id}"
                    AsyncImage(
                        model = imageUrl,
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .height(150.dp)
                            .width(115.dp)
                            .clip(RoundedCornerShape(16.dp))
                    )
                    Column(
                        modifier = Modifier.padding(end = 20.dp, bottom = 10.dp)
                    ) {
                        item.owner?.let { owner ->
                            if(owner == "null") Text(text = "Owner: none", fontWeight = FontWeight.Bold)
                            else Text(text = "Owner: $owner", fontWeight = FontWeight.Bold, color = Purple40)
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(text = "Created: ${item.createdAt.substring(0, 15)}")
                        Spacer(modifier = Modifier.height(20.dp))
                        if(item.tags.isNotEmpty()) {
                            Text(
                                text = "${item.tags.take(6).joinToString()}",
                                modifier = Modifier
                                    .background(Purple40, RoundedCornerShape(5.dp))
                                    .padding(horizontal = 10.dp, vertical = 3.dp),
                                fontSize = 15.sp,
                                color = Color.White
                            )
                        }
                    }
                }
            }
        }
    }
}