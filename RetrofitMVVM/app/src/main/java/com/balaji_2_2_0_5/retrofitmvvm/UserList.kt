package com.balaji_2_2_0_5.retrofitmvvm

data class User(
    val id:Int?,
    val name:String?,
    val email:String?,
    val gender:String?,
    val status:String?
)

data class UserList(
    val data:List<User?>
)

data class UserResponse(val code:Int?,val meta:String?,val data:User?)