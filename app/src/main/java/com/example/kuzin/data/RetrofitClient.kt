package com.example.kuzin.data

import com.example.kuzin.data.service.ProductInterface
import com.example.kuzin.data.service.RecipeInterface
import com.example.kuzin.data.service.RetrofitInterface
import com.example.kuzin.data.service.UserInterface
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.net.InetSocketAddress
import java.net.Proxy

object RetrofitClient {
    val loggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }
    val proxy = Proxy(Proxy.Type.HTTP, InetSocketAddress("10.207.106.59", 3128))
    val okHttpClient = OkHttpClient.Builder()
        .proxy(proxy)
        .addInterceptor(loggingInterceptor)
        .build()
    val retrofit = Retrofit.Builder()
        .baseUrl("https://dummyjson.com/")
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val quoteAPI = retrofit.create(RetrofitInterface::class.java)

    val productAPI = retrofit.create(ProductInterface::class.java)

    val recipeAPI = retrofit.create(RecipeInterface::class.java)

    val userAPI = retrofit.create(UserInterface::class.java)
}