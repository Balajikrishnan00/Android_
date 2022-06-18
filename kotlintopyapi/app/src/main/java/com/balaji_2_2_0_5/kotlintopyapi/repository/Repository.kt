package com.balaji_2_2_0_5.kotlintopyapi.repository

import com.balaji_2_2_0_5.kotlintopyapi.api.RetrofitInstance
import com.balaji_2_2_0_5.kotlintopyapi.model.Posts
import retrofit2.Response

class Repository {

    suspend fun getPosts():Response<Posts>{
        return RetrofitInstance.api.getPosts()
    }
}