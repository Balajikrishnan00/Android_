package com.balaji_2_2_0_5.retrofitkotlin2.model

import com.balaji_2_2_0_5.retrofitkotlin2.TodoAPI
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitInstance {

    val api:TodoAPI by lazy {
        Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(TodoAPI::class.java)

    }
}