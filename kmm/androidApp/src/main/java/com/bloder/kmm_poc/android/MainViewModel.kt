package com.bloder.kmm_poc.android

import androidx.lifecycle.ViewModel
import com.bloder.kmm_poc.data.TopItem
import com.bloder.kmm_poc.data.TopItemsRequest
import com.bloder.kmm_poc.di.DI
import com.bloder.kmm_poc.domain.FetchTopItemsUseCase
import com.bloder.kmm_poc.domain.invoke
import com.bloder.kmm_poc.network.error.NetworkError
import com.bloder.kmm_poc.network.error.UnknownNetworkError
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainViewModel(private val fetchTopItemsUseCase: FetchTopItemsUseCase = DI.fetchTopItemsUseCase()) : ViewModel() {

    private val _airingAnimes: MutableStateFlow<List<TopItem>> = MutableStateFlow(listOf())
    private val _upcomingAnimes: MutableStateFlow<List<TopItem>> = MutableStateFlow(listOf())
    val airingAnimes: StateFlow<List<TopItem>> get() = _airingAnimes
    val upcomingAnimes: StateFlow<List<TopItem>> get() = _upcomingAnimes

    suspend fun fetchAiringAnimes()  {
        fetchTopItemsUseCase(TopItemsRequest("anime", "airing")).fold(::handleNetworkProblem) {
            _airingAnimes.value = it.topItems
        }
    }

    suspend fun fetchUpcomingAnimes() {
        fetchTopItemsUseCase(TopItemsRequest("anime", "upcoming")).fold(::handleNetworkProblem) {
            _upcomingAnimes.value = it.topItems
        }
    }

    private fun handleNetworkProblem(networkError: NetworkError) {
        when(networkError) {
            is UnknownNetworkError -> {}
        }
    }
}