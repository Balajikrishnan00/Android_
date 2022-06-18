package com.balaji_2_2_0_5.kotlinretrofit06.networking

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import retrofit2.http.GET
import retrofit2.http.Query

object ApiClient {

    private const val BASE_URL= "https://rickandmortyapi.com/api/"

    private val moshi=Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

    private val rF:Retrofit by lazy {
        Retrofit.Builder().baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .build()
    }
    val apiService:ApiService by lazy {
        rF.create(ApiService::class.java)
    }
}

interface ApiService{
    @GET("character")
    fun fetchCharacter(@Query("page") page:String): Call<CharacterResponse>
}