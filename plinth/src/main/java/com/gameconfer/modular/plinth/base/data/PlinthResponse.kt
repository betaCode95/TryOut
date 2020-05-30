package com.gameconfer.modular.plinth.base.data

data class PlinthResponse<T : Any>(
    val data: T,
    val message: String = "",
    val success: Boolean = false
)