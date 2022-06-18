package com.balaji_2_2_0_5.retrofitkotlin2.model

data class TodoModel(
    val completed: Boolean,
    val id: Int,
    val title: String,
    val userId: Int
)