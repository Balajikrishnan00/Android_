package com.balaji_2_2_0_5.retrofitkotlin.model

import retrofit2.Call
import retrofit2.http.GET

interface Retrofit_Interface {


    @get:GET("posts")
    var posts:Call<List<PostModel>>
    companion object{

        //const val BASE_URL="https://nextgenerationsocialnetwork.com/user_details/"
        const val BASE_URL:String="https://jsonplaceholder.typicode.com/"
    }
}