package com.balaji_2_2_0_5.kotlinretrofit07.api


import com.balaji_2_2_0_5.kotlinretrofit07.utils.Constants.Companion.BASEURL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create


object RetrofitInstance {
    private val retrofit:Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASEURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val api:SimpleAPi by lazy {
        retrofit.create(SimpleAPi::class.java)
    }

}