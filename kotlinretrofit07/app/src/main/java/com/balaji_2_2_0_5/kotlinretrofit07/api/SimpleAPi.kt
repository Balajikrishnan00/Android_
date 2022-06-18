package com.balaji_2_2_0_5.kotlinretrofit07.api

import com.balaji_2_2_0_5.kotlinretrofit07.model.Post
import retrofit2.Response
import retrofit2.http.*

interface SimpleAPi {

    @GET("posts/1")
    suspend fun getPost1(): Response<Post>

    @GET("posts/{pageNumber}")
    suspend fun getPost2( @Path("pageNumber") number:Int ):Response<Post>

    @GET("posts")
    suspend fun getCustomPost3( @Query("userId") number:Int) :Response<List<Post>>


    //posts?userId=1&_sort=id&_order=desc,asc   php Query

    @GET("posts")
    suspend fun getCustomPost4(
        @Query("userId") number:Int,
        @Query("_sort") sort:String,
        @Query("_order") order:String):Response<List<Post>>

    // _sort=id&_order= desc , asc
    @GET("posts")
    suspend fun getCustomPosts5(
        @Query("userId") userid:Int,
        @QueryMap options:Map<String,String>):Response<List<Post>>

    @POST("posts")
    suspend fun pushPost(@Body post:Post) : Response<Post>

}