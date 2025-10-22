// Demo de DataStore + animación (no enlazada en el NavHost por defecto)
package com.example.formularioscompose.ui.views


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.formularioscompose.viewmodel.EstadoViewModel



@Composable
fun PantallaPrincipal(vm: EstadoViewModel = viewModel(), navController: NavController) {
    val estado = vm.activo.collectAsState()
    val mensaje = vm.mostrarMensaje.collectAsState()






    if (estado.value == null) {
        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            CircularProgressIndicator()
        }
    } else {
        Column(
            Modifier.fillMaxSize().padding(32.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = { navController.navigate("Login") },
                modifier = Modifier.fillMaxWidth()
            ){ Text("Iniciar Sesión") }

            Button(
                onClick = { navController.navigate("Registro") },
                modifier = Modifier.fillMaxWidth()
            ){ Text("Registrarse") }

        }
    }
}
