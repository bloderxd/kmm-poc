package com.bloder.kmm_poc.domain

import arrow.core.continuations.Effect
import com.bloder.kmm_poc.data.Repository
import com.bloder.kmm_poc.network.error.NetworkError

suspend fun <T, E, P> T.fetch(p: P): Effect<NetworkError, E> where T : Repository<P, E> = p.fetch()