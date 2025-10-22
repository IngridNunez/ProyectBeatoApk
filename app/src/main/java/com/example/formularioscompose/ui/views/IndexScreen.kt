package com.example.formularioscompose.ui.views

import androidx.compose.foundation.layout.*
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.formularioscompose.viewmodel.UsuarioViewModel

@Composable
fun IndexScreen(navController: NavController, viewModel: UsuarioViewModel) {

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        // 6 filas de 2 tarjetas cada una
        RowTarjetas("Tarjeta 1", "Tarjeta 2")
        RowTarjetas("Tarjeta 3", "Tarjeta 4")
        RowTarjetas("Tarjeta 5", "Tarjeta 6")
        RowTarjetas("Tarjeta 7", "Tarjeta 8")
        RowTarjetas("Tarjeta 9", "Tarjeta 10")
        RowTarjetas("Tarjeta 11", "Tarjeta 12")
    }
}

@Composable
fun RowTarjetas(texto1: String, texto2: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        ElevatedCardExample(
            texto = texto1,
            modifier = Modifier
                .weight(1f)
                .height(100.dp)
        )

        ElevatedCardExample(
            texto = texto2,
            modifier = Modifier
                .weight(1f)
                .height(100.dp)
        )
    }
}

@Composable
fun ElevatedCardExample(texto: String, modifier: Modifier = Modifier) {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
        modifier = modifier
    ) {
        Text(
            text = texto,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Center
        )
    }
}
