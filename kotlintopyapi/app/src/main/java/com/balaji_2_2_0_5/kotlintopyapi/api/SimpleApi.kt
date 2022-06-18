package com.balaji_2_2_0_5.kotlintopyapi.api

import com.balaji_2_2_0_5.kotlintopyapi.model.Posts
import retrofit2.Response
import retrofit2.http.GET

interface SimpleApi {

@GET("posts")
suspend fun getPosts():Response<Posts>

}