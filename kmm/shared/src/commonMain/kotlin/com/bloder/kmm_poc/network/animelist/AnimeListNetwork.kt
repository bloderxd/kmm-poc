package com.bloder.kmm_poc.network.animelist

import com.bloder.kmm_poc.network.Network
import io.ktor.client.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

const val MyAnimeListEndPoint = "https://api.jikan.moe/v3"

interface AnimeListNetwork : Network {

    override fun client(): HttpClient = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
            })
        }
    }

    companion object : AnimeListNetwork
}