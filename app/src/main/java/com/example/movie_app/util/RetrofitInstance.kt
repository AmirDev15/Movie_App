package com.example.movie_app.util

import com.example.movie_app.domain.ApiInterface

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query


object RetrofitInstance {

    val api: ApiInterface by lazy {

        Retrofit.Builder().baseUrl(util.Base).addConverterFactory(
            GsonConverterFactory.create()
        ).build().create(ApiInterface::class.java)
 
    }


}


