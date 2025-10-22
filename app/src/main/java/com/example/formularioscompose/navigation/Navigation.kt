package com.example.formularioscompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.formularioscompose.viewmodel.UsuarioViewModel
import com.example.formularioscompose.ui.views.*


@Composable
fun AppNavigation(navController: NavHostController,
                  usuarioViewModel: UsuarioViewModel){
    NavHost(
        navController = navController, startDestination = "Inicio",
    ){
        composable("Inicio") { PantallaPrincipal(navController = navController) }
        composable("Login") { FormularioLoginScreen(navController, usuarioViewModel) }
        composable("Registro") { FormularioScreen(navController, usuarioViewModel) }
    }
}