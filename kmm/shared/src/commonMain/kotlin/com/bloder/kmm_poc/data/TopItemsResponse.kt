package com.bloder.kmm_poc.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TopItemsResponse(
    @SerialName(value = "request_hash") val requestHash: String,
    @SerialName(value = "request_cached") val requestCached: Boolean,
    @SerialName(value = "request_cache_expiry") val requestCacheExpiry: Long,
    @SerialName(value = "API_DEPRECATION") val apiDeprecation: Boolean,
    @SerialName(value = "API_DEPRECATION_DATE") val apiDeprecationDate: String,
    @SerialName(value = "API_DEPRECATION_INFO") val apiDeprecationInfo: String,
    @SerialName(value = "top") val topItems: List<TopItem>
)

@Serializable
data class TopItem(
    @SerialName(value = "mal_id") val id: Long?,
    @SerialName(value = "rank") val rank: Int?,
    @SerialName(value = "title") val title: String,
    @SerialName(value = "url") val url: String?,
    @SerialName(value = "image_url") val image: String?,
    @SerialName(value = "type") val type: String?,
    @SerialName(value = "episodes") val episodes: Int?,
    @SerialName(value = "start_date") val startDate: String?,
    @SerialName(value = "end_date") val endDate: String?,
    @SerialName(value = "members") val members: Long,
    @SerialName(value = "score") val score: String?,
)