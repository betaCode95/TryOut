package com.gameconfer.modular.plinth.base.data

import java.util.*

data class PlinthRequest<T : Any>(
    val data: T,
    val timestamp: Date = Date()
)