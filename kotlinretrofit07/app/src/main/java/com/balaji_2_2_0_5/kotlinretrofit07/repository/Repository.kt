package com.balaji_2_2_0_5.kotlinretrofit07.repository

import com.balaji_2_2_0_5.kotlinretrofit07.api.RetrofitInstance
import com.balaji_2_2_0_5.kotlinretrofit07.model.Post
import retrofit2.Response

class Repository {

    suspend fun getPost1(): Response<Post> {
        return RetrofitInstance.api.getPost1()
    }

    suspend fun getPost2(number:Int):Response<Post>{
        return RetrofitInstance.api.getPost2(number)
    }

    suspend fun getCustomPost3(number: Int):Response<List<Post>>{
        return RetrofitInstance.api.getCustomPost3(number)
    }

    suspend fun getCustomPost4(number:Int,sort:String,order:String):Response<List<Post>> {
        return RetrofitInstance.api.getCustomPost4(number,sort,order)

    }

    suspend fun getCustomPosts5(userid:Int,options:Map<String,String>):Response<List<Post>>{
        return RetrofitInstance.api.getCustomPosts5(userid,options)
    }

    suspend fun pushPost(post:Post):Response<Post>{
        return RetrofitInstance.api.pushPost(post)
    }

}