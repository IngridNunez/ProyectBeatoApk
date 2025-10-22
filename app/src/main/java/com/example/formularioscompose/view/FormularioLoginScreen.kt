package com.example.formularioscompose.view

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController
import com.example.formularioscompose.viewmodel.EstadoViewModel
import com.example.formularioscompose.viewmodel.UsuarioViewModel

@Composable
fun Login(navController: NavController, viewModel: UsuarioViewModel,){
    val estado by viewModel.estado.collectAsStateWithLifecycle()


    Column(
        Modifier
        .fillMaxSize()
        .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        OutlinedTextField(
            value = estado.correo,
            onValueChange = viewModel::onCorreoChange,
            label = { Text("Correo") },
            isError = estado.errores.correo != null,
            supportingText = {
                estado.errores.correo?.let {
                    Text(
                        it,
                        color = MaterialTheme.colorScheme.error
                    )
                }
            },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = estado.clave,
            onValueChange = viewModel::onClaveChange,
            label = { Text("Clave") },
            isError = estado.errores.clave != null,
            supportingText = {
                estado.errores.clave?.let {
                    Text(
                        it,
                        color = MaterialTheme.colorScheme.error
                    )
                }
            },
            modifier = Modifier.fillMaxWidth()
        )

        Button(
            onClick = {
                if (viewModel.validarFormulario()) {
                    navController.navigate("IndexScreen")
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) { Text("continuar") }


    }


}

