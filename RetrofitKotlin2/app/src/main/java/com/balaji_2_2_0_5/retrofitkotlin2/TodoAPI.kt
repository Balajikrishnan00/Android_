package com.balaji_2_2_0_5.retrofitkotlin2

import com.balaji_2_2_0_5.retrofitkotlin2.model.TodoModel
import retrofit2.Response
import retrofit2.http.GET

interface TodoAPI {

    @GET("todos")
    suspend fun getTodo():Response<List<TodoModel>> //@Query("key")key:String

}