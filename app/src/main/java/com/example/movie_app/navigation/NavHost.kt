package com.example.movie_app.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavArgument
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.movie_app.models.Details


@Composable

fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Banner Screen") {

        composable("Banner Screen") {
            BannerScreen(navController = navController)
        }
        composable("Home Screen") {
            HomeScreen(navController = navController)
        }

        composable("Details screen/{id}",
            arguments = listOf(
                navArgument(
                    name = "id" // Define an argument named "id"
                ) {
                    type = NavType.IntType // Specify that the argument type is an integer
                }
            )
        ) { id -> // Lambda function receiving NavBackStackEntry
            id.arguments?.getInt("id")?.let { id1 -> // Safely retrieve the "id" argument as an integer
                DetailsScreen(id = id1) // Pass the retrieved id to the DetailsScreen composable
            }
        }

    }

}


