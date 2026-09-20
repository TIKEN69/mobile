package com.example.kuzin.ui.theme.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kuzin.data.RetrofitClient
import kotlinx.coroutines.launch

class RetrofitViewModel: ViewModel() {
    fun fetchQuotas(){
        viewModelScope.launch {
            try {
                val response = RetrofitClient.quoteAPI.getQuotes()
                for (quote in response.quotes) {
                    Log.d("RetrofitViewModel","id: ${quote.id}, quote: ${quote.quote}, author: ${quote.author}")
                }
            } catch (e: Exception){
                Log.e("RetrofitViewModel", "${e.message}")
            }
        }
    }
}