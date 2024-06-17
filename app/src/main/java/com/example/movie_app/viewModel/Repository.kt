package com.example.movie_app.viewModel

import com.example.movie_app.models.MoviesList
import com.example.movie_app.util.RetrofitInstance
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Query


//now after requesting the data(moviesList) , now we are going to create a repository class for managing the network
// and then implementing this function on MovieViewModel class, reciving the data and then passing it to the view using a layout.
class Repository {

    // we use suspend fun because they are used for asynchronous programming. They allow us to perform long-running tasks without
    // blocking the main thread, which is crucial for maintaining a responsive user interface in applications.
    suspend fun getMovieList(page: Int): Response<MoviesList> {
        return RetrofitInstance.api.getMovies(page)
    }

}

