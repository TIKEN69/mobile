package com.example.kuzin.ui.theme.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kuzin.data.RetrofitClient
import com.example.kuzin.data.model.Product
import kotlinx.coroutines.launch

class ProductViewModel: ViewModel() {
    fun createProduct(product: Product){
        viewModelScope.launch {
            try {
                val product = RetrofitClient.productAPI.addProduct(product)
                Log.d("RetrofitViewModel","id: ${product.id}, title: ${product.title}, price: ${product.price}, category: ${product.category}, stock: ${product.stock}")
            } catch (e: Exception){
                Log.e("ProductViewModel", e.message.toString())
            }
        }
    }
}
