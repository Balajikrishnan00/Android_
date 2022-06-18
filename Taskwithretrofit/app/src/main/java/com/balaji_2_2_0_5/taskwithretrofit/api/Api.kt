package com.balaji_2_2_0_5.taskwithretrofit.api

import com.balaji_2_2_0_5.taskwithretrofit.model.modeljsonItem
import retrofit2.Response
import retrofit2.http.GET

interface Api {

    @GET("uploads")
    suspend fun  getPost() : Response<modeljsonItem>
}