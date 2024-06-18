package com.example.movie_app

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.movie_app.models.MoviesList
import com.example.movie_app.navigation.Navigation
import com.example.movie_app.ui.theme.Movie_AppTheme
import com.example.movie_app.viewModel.MovieViewModel

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Navigation()
//                Surface(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .padding(20.dp),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//
//                    val movieViewModel = viewModel<MovieViewModel>()
//                    val state = movieViewModel.state
//                    Text(text = state.movies.toString())
//
//
//                }



        }
    }
}
