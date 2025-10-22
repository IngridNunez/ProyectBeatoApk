package com.example.formularioscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.formularioscompose.ui.views.FormularioLoginScreen
import com.example.formularioscompose.ui.views.FormularioScreen
import com.example.formularioscompose.ui.views.IndexScreen
import com.example.formularioscompose.ui.views.PantallaPrincipal
import com.example.formularioscompose.viewmodel.UsuarioViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                AppNav()
            }
        }
    }
}

@Composable
fun AppNav() {
    val navController = rememberNavController()
    val usuarioViewModel: UsuarioViewModel = viewModel()

    NavHost(navController = navController, startDestination = "Inicio") {
        composable("Inicio") { PantallaPrincipal(navController = navController) }
        composable("Login") { FormularioLoginScreen(navController, usuarioViewModel) }
        composable("Registro") { FormularioScreen(navController,usuarioViewModel) }
        composable ("Index") { IndexScreen(navController,usuarioViewModel) }
    }
}
