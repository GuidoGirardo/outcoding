package com.guido.outcoding.screens

import android.util.Log
import androidx.compose.foundation.Image
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import com.guido.outcoding.viewmodel.AppViewModel

@Composable
fun HomeScreen(navController: NavController, viewModel: AppViewModel) {

    val items = viewModel.retornarItems()

    LazyColumn {
        items(items) { item ->
            Card(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            ) {
                val imageUrl = "https://cataas.com/cat/${item.id}"
                Text(text = "ID: ${item.id}")
                Text(text = "Tags: ${item.tags.joinToString()}")
                item.owner?.let { owner ->
                    Text(text = "Owner: $owner")
                }
                Text(text = "Created At: ${item.createdAt}")
                Text(text = "Updated At: ${item.updatedAt}")
                Log.i("xd", imageUrl)
                Image(
                    painter = rememberImagePainter(imageUrl),
                    contentDescription = null,
                    modifier = Modifier
                        .height(150.dp)
                        .width(115.dp)
                        .clip(RoundedCornerShape(16.dp)),
                    contentScale = ContentScale.Crop
                )
            }
        }
    }
}