package org.test.mvvm.api

import com.example.retrofit.Model.Responsedata
import retrofit2.http.*

interface ApiService {

    @POST("post")
    @Headers("Accept: application/json")
  suspend  fun post(
       @Body body:String
    ): Responsedata
}