package com.bloder.kmm_poc.network

import io.ktor.client.*

fun interface Network {

    fun client(): HttpClient
}