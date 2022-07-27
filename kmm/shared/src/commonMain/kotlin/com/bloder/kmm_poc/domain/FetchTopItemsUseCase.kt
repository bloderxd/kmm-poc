package com.bloder.kmm_poc.domain

import arrow.core.continuations.Effect
import com.bloder.kmm_poc.data.TopItemsRepository
import com.bloder.kmm_poc.data.TopItemsRequest
import com.bloder.kmm_poc.data.TopItemsResponse
import com.bloder.kmm_poc.network.error.NetworkError

class FetchTopItemsUseCase(private val repository: TopItemsRepository) : TopItemsRepository by repository

suspend operator fun FetchTopItemsUseCase.invoke(topItemsRequest: TopItemsRequest): Effect<NetworkError, TopItemsResponse> = topItemsRequest.fetch()