package com.example.pesanin.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pesanin.data.car.Car
import com.example.pesanin.repository.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel(
    private val repository: Repository
) : ViewModel() {

//    Car Section
    var vehicleName by  mutableStateOf("")
        private set
    fun updateVehicleName(input: String) {
        vehicleName = input
    }

    var quantity by  mutableStateOf(0)
        private set
    fun updateQuantity(input: Int) {
        quantity = input
    }

    var releaseYear by  mutableStateOf(0)
        private set
    fun updateReleaseYear (input: Int) {
        releaseYear = input
    }

    var color by  mutableStateOf("")
        private set
    fun updateColor(input: String) {
        color = input
    }

    var price by   mutableStateOf(0)
        private set
    fun updatePrice(input: Int) {
        price = input
    }

    var engine by  mutableStateOf("")
        private set
    fun updateEngine(input: String) {
        engine = input
    }

    var capacity by  mutableStateOf(0)
        private set
    fun updateCapacity(input: Int) {
        capacity = input
    }

    var type by mutableStateOf("")
        private set
    fun updateType(input: String) {
        type = input
    }


    var datalist by mutableStateOf(HomeState())
    private set
    init {
        getAllCar()
    }

    fun getAllCar() {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getAllCar()
        }
    }

    fun insertCar() {
        viewModelScope.launch(Dispatchers.IO) {
            repository.addCar(Car(id = 0, vehicleName,quantity, releaseYear ,color,
                price.toLong(),engine,capacity, type))
        }
    }
}

//Motor


data class HomeState (
    val datalist : List<Car> = emptyList(),
)