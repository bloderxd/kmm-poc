package kmm_poc.bloder.com.models

import kotlinx.serialization.Serializable

@Serializable
data class HomeScreenData(
    val title: String,
    val description: String,
)
