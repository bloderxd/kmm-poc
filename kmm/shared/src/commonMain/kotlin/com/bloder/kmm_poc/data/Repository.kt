package com.bloder.kmm_poc.data

import arrow.core.continuations.Effect
import com.bloder.kmm_poc.network.error.NetworkError

interface Repository<T, E> {

    suspend fun T.fetch(): Effect<NetworkError, E>
}