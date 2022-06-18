package com.balaji_2_2_0_5.kotlinretrofit06.networking
import com.squareup.moshi.Json

data class Character (
    @Json(name = "name")
    val name:String,
    @Json(name="image")
    val image:String
        )

data class CharacterResponse(@Json(name = "results")
    val result:List<Character>
    )