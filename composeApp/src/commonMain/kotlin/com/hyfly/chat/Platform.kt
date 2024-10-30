package com.hyfly.chat

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform