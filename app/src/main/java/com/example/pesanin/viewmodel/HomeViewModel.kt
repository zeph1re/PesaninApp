package com.example.pesanin.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pesanin.data.car.Car
import com.example.pesanin.repository.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel (private val repository : Repository) : ViewModel() {

    fun getAllCar() {
        viewModelScope.launch {
            repository.getAllCar()
        }
    }

    fun insertCar(car: Car) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.addCar(car)
        }
    }



}