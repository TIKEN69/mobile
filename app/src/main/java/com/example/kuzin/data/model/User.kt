package com.example.kuzin.data.model

data class User(
    val id : Int? = null,
    val firstName: String,
    val lastName: String,
    val maidenName: String,
    val isDeleted: Boolean = false
)
