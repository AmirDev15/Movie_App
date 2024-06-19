package com.example.movie_app.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.movie_app.models.Data
import com.example.movie_app.models.Details
import kotlinx.coroutines.launch

// MovieViewModel implements ViewModel
class MovieViewModel : ViewModel() {

    private val repository = Repository()

    //we will fetch the data repository:
    // An instance of Repository, which is  used to fetch data, such as a list of movies.
    var state by mutableStateOf(ScreenState())
    var id by mutableStateOf(0)

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

    fun getDetailsById() {
        viewModelScope.launch {
            try {
                val response = repository.getDetailsById(id = id)
                if (response.isSuccessful) {
                    state = state.copy(
                        detailsData = response.body()!!  //This extracts the body of the HTTP response, which contains the MovieListResponse object.
                    ) // !!.data: The double exclamation marks (!!) are used to assert that the body is non-null and access its data property, which is a list of movies.
                }
            } catch (e: Exception) {
                state = state.copy(

                )
            }
        }
    }

}
data class ScreenState(
    val movies: List<Data> = emptyList(),
    val detailsData: Details = Details(),
    val page: Int = 1,
)