package com.balaji_2_2_0_5.kotlinretrofit05

import com.balaji_2_2_0_5.kotlinretrofit05.model.DataListItem
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitInterface {
    @GET("todos")
    fun getData():Call<List<DataListItem>>

}