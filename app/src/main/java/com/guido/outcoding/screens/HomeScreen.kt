package com.guido.outcoding.screens

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.guido.outcoding.model.ModelItem
import com.guido.outcoding.navigation.AppScreens

@Composable
fun HomeScreen(navController: NavController, items: List<ModelItem>) {
    LazyColumn {
        items(items) { item ->
            Card(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            ) {
                Text(text = "ID: ${item.id}")
                Text(text = "Tags: ${item.tags.joinToString()}")
                item.owner?.let { owner ->
                    Text(text = "Owner: $owner")
                }
                Text(text = "Created At: ${item.createdAt}")
                Text(text = "Updated At: ${item.updatedAt}")
            }
        }
    }
}