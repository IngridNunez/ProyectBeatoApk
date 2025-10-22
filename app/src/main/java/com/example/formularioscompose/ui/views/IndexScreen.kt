package com.example.formularioscompose.ui.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.formularioscompose.R
import com.example.formularioscompose.viewmodel.UsuarioViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IndexScreen(navController: NavController, viewModel: UsuarioViewModel) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Pasteleria Mil Sabores") // Personalizar dps
                }
            )
        }
    ) { paddingValues ->

        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(16.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            RowTarjetas("Tarjeta 1", R.drawable.imagen13, "Tarjeta 2", R.drawable.imagen7)
            RowTarjetas("Tarjeta 3", R.drawable.imagen2, "Tarjeta 4", R.drawable.imagen8)
            RowTarjetas("Tarjeta 5", R.drawable.imagen3, "Tarjeta 6", R.drawable.imagen9)
            RowTarjetas("Tarjeta 7", R.drawable.imagen4, "Tarjeta 8", R.drawable.imagen10)
            RowTarjetas("Tarjeta 9", R.drawable.imagen5, "Tarjeta 10", R.drawable.imagen11)
            RowTarjetas("Tarjeta 11", R.drawable.imagen6, "Tarjeta 12", R.drawable.imagen12)
        }
    }
}

@Composable
fun RowTarjetas(
    texto1: String, imagen1: Int,
    texto2: String, imagen2: Int
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        CustomElevatedCard(
            texto = texto1,
            imagenResId = imagen1,
            modifier = Modifier
                .weight(1f)
                .height(100.dp)
        )

        CustomElevatedCard(
            texto = texto2,
            imagenResId = imagen2,
            modifier = Modifier
                .weight(1f)
                .height(100.dp)
        )
    }
}

@Composable
fun CustomElevatedCard(texto: String, imagenResId: Int, modifier: Modifier = Modifier) {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
        modifier = modifier
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = imagenResId),
                contentDescription = texto,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .fillMaxWidth()
                    .size(50.dp)
            )

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp),
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = texto,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }



        }
    }
}
