package com.example.pesanin.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pesanin.repository.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel (private val repository : Repository) : ViewModel() {

    val getAllCar = repository.getAllCar()

    fun insertCar() {
        viewModelScope.launch(Dispatchers.IO) {
//            repository.
        }
    }


}