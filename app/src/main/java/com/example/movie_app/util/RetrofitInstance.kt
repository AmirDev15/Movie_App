package com.example.movie_app.util

import com.example.movie_app.domain.ApiInterface
//import com.squareup.moshi.Moshi
//import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
//import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query


object RetrofitInstance {

    val api: ApiInterface by lazy {

        Retrofit.Builder().baseUrl(util.Base).addConverterFactory(
            GsonConverterFactory.create()
        ).build().create(ApiInterface::class.java)
 
    }


}
//object MoshiInstance {
//    val moshi: Moshi = Moshi.Builder()
//        // Add any additional configuration as needed
//        .addLast(KotlinJsonAdapterFactory())
//        .build()
//}

//
//object RetrofitInstance {
//    val api: ApiInterface by lazy {
//        Retrofit.Builder()
//            .baseUrl(util.Base)  // Replace with your base URL
//            .addConverterFactory(MoshiConverterFactory.create(MoshiInstance.moshi))
//            .build()
//            .create(ApiInterface::class.java)
//    }
//}



