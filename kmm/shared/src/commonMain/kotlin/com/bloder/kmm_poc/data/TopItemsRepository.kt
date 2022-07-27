package com.bloder.kmm_poc.data

import arrow.core.continuations.Effect
import arrow.core.continuations.effect
import com.bloder.kmm_poc.network.animelist.AnimeListNetwork
import com.bloder.kmm_poc.network.animelist.MyAnimeListEndPoint
import com.bloder.kmm_poc.network.error.NetworkError
import com.bloder.kmm_poc.network.error.UnknownNetworkError
import io.ktor.client.call.*
import io.ktor.client.request.*
import kotlinx.coroutines.withContext
import kotlin.coroutines.CoroutineContext

interface TopItemsRepository : Repository<TopItemsRequest, TopItemsResponse>

class TopItemsRepositoryDependency(private val animeListNetwork: AnimeListNetwork, private val dispatcher: CoroutineContext) : TopItemsRepository {

    override suspend fun TopItemsRequest.fetch(): Effect<NetworkError, TopItemsResponse> = effect {
        withContext(dispatcher) {
            try {
                animeListNetwork.client().get("$MyAnimeListEndPoint/top/$type/1/$subtype").body()
            } catch (e: Exception) {
                shift(UnknownNetworkError)
            }
        }
    }
}