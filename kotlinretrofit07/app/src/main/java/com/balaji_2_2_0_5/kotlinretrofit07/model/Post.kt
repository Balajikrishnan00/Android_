package com.balaji_2_2_0_5.kotlinretrofit07.model
import com.google.gson.annotations.SerializedName

data class Post (
    //@SerializedName(value = "userId")
    val userId:Int,
    val id:Int,
    val title:String,
    val body:String
    )