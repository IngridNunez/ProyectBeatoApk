package com.example.formularioscompose.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.formularioscompose.model.DetalleProducto

class DetalleProductViewModel : ViewModel() {

    private val _productoSeleccionado = MutableLiveData<DetalleProducto?>()
    val productoSeleccionado: LiveData<DetalleProducto?> = _productoSeleccionado

    fun seleccionarProducto(producto: DetalleProducto) {
        _productoSeleccionado.value = producto
    }
}
