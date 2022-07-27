package com.bloder.kmm_poc.di

import com.bloder.kmm_poc.data.TopItemsRepository
import com.bloder.kmm_poc.data.TopItemsRepositoryDependency
import com.bloder.kmm_poc.domain.FetchTopItemsUseCase
import com.bloder.kmm_poc.network.animelist.AnimeListNetwork
import kotlinx.coroutines.Dispatchers

object DI {
    fun animeListNetwork(): AnimeListNetwork = AnimeListNetwork
    fun topItemRepository(): TopItemsRepository = TopItemsRepositoryDependency(
        animeListNetwork = animeListNetwork(),
        dispatcher = Dispatchers.Default
    )
    fun fetchTopItemsUseCase(): FetchTopItemsUseCase = FetchTopItemsUseCase(topItemRepository())
}