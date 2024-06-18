package com.example.movie_app.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable

fun HomeScreen(navController: NavHostController) {

    Box(
        modifier = Modifier
            .fillMaxSize()
//                            .background(
//                                brush = Brush.horizontalGradient(
//                                    colors = listOf(Color(0xFFFFA726), Color(0xFFFB8C00))
//                                ),
//                                shape = RoundedCornerShape(25.dp)
//                            ),
        ,
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Home Screen", fontSize = 16.sp)
    }
}