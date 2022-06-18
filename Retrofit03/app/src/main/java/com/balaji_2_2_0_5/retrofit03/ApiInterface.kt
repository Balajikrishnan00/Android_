package com.balaji_2_2_0_5.retrofit03

import com.balaji_2_2_0_5.retrofit03.model.MyDataItem
import com.balaji_2_2_0_5.retrofit03.model.MyDataItemItem
import retrofit2.Call
import retrofit2.http.GET


interface ApiInterface {
    @GET("posts")
    fun getData():Call <List<MyDataItemItem>>
}