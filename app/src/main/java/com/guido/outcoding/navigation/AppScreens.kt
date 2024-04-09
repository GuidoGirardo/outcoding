package com.guido.outcoding.navigation

sealed class AppScreens(val route: String) {
    object HomeScreen : AppScreens("home_screen")
    object DetailScreen : AppScreens("detail?id={id}&owner={owner}&createdAt={createdAt}&updatedAt={updatedAt}&tags={tags}")
}