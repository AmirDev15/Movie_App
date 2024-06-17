package com.example.movie_app.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.movie_app.models.Data
import kotlinx.coroutines.launch
// MovieViewModel implements ViewModel
class MovieViewModel : ViewModel() {

    private val repository = Repository() //we will fetch the data repository: An instance of Repository, which is  used to fetch data, such as a list of movies.
    var state by mutableStateOf(ScreenState())

    init {
        //This launches a coroutine in the viewModelScope, which is tied to the ViewModel's lifecycle.
        // When the ViewModel is cleared, the coroutine will be automatically canceled.
        viewModelScope.launch {
            val response = repository.getMovieList(state.page)
            state = state.copy(
                movies = response.body()!!.data
            )
        }

    }


}


data class ScreenState(
    val movies: List<Data> = emptyList(),
    val title: String = "",
    val page: Int = 1,
)