package com.gameconfer.dossier.components

import android.content.Context
import com.chuckerteam.chucker.api.ChuckerInterceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

internal object RemoteDossier {

    private val retrofit by lazy {
        Retrofit.Builder()
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(endpoint)
            .build()
    }

    private val okHttpClient by lazy {
        val b = OkHttpClient.Builder()
        if (context != null)
            b.addInterceptor(ChuckerInterceptor(context!!))
        b.build()
    }

    var context: Context? = null
    var endpoint: String = ""
}