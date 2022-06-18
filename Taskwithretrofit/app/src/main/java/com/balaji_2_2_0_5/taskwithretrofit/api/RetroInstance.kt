package com.balaji_2_2_0_5.taskwithretrofit.api

import com.balaji_2_2_0_5.taskwithretrofit.api.Constance.Companion.BASEURL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetroInstance {

    val retrofit by lazy {
        Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASEURL).build()
    }

    val api:Api by lazy {
        retrofit.create(Api::class.java)
    }

}