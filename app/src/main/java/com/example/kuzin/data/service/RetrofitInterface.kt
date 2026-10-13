package com.example.kuzin.data.service

import com.example.kuzin.data.model.ResponseQuote
import retrofit2.http.GET

interface RetrofitInterface {
    @GET("quotes")
    suspend fun getQuotes(): ResponseQuote
}