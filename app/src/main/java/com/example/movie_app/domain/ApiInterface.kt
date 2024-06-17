package com.example.movie_app.domain

import com.example.movie_app.models.MoviesList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("movies?")
    suspend fun getMovies(
        @Query("page") page: Int,
    ): Response<MoviesList>



}

