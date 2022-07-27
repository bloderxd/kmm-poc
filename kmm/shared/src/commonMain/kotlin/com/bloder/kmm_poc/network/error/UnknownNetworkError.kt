package com.bloder.kmm_poc.network.error

interface UnknownNetworkError : NetworkError {

    companion object : UnknownNetworkError
}