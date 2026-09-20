package com.example.kuzin.data

import com.example.kuzin.model.Quote
import com.example.kuzin.model.ResponseQuote
import retrofit2.http.GET

interface RetrofitInterface {
    @GET("quotes")
    suspend fun getQuotes(): ResponseQuote
}