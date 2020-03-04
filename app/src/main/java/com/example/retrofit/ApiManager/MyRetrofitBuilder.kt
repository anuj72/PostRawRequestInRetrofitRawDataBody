package org.test.mvvm.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object MyRetrofitBuilder {
    const val BASE_URL ="https://postman-echo.com/"
    val retrofitBuilder:Retrofit.Builder by lazy {
        Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
    }
    val apiService:ApiService by lazy {
        retrofitBuilder.build().create(ApiService::class.java)
    }
}