package com.example.movie_app.models
data class  Metadata(
    val current_page: String, //the page we sent to Api
    val page_count: Int, // how many pages we have?
    val per_page: Int, // number of movies per page (10)
    val total_count: Int // total movies we have
)