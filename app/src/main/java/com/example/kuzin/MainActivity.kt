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
import com.example.kuzin.ui.theme.viewModel.UserViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val userViewModel: UserViewModel = viewModel()
            userViewModel.deleteUser(8)
        }
    }
}