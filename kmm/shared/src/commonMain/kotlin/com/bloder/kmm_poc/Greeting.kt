package com.bloder.kmm_poc

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}