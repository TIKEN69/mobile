package com.example.kuzin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.kuzin.data.model.Product
import com.example.kuzin.ui.theme.viewModel.ProductViewModel
import com.example.kuzin.ui.theme.viewModel.RecipeViewModel
import com.example.kuzin.ui.theme.viewModel.RetrofitViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
           val retrofitViewModel: RetrofitViewModel = viewModel()
           retrofitViewModel.fetchQuotas()


            val productViewModel: ProductViewModel = viewModel()
            val product = Product(
                title = "Офисное кресло Comfort-Т",
                price = 14200.0,
                stock = 3,
                category = "Мебель"
            )
            productViewModel.createProduct(product)

            val recipeViewModel: RecipeViewModel = viewModel()
            recipeViewModel.updateRecipe()
        }
    }
}