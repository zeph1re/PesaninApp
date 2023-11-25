package com.example.pesanin.viewmodel


import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pesanin.data.car.Car
import com.example.pesanin.data.motor.Motorbike
import com.example.pesanin.data.selling.Selling
import com.example.pesanin.repository.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel(
    private val repository: Repository,
) : ViewModel() {

    //    Car Section
    var vehicleName by mutableStateOf("")
        private set

    fun updateVehicleName(input: String) {
        vehicleName = input
    }

    var quantity by mutableStateOf(0)
        private set

    fun updateQuantity(input: Int) {
        quantity = input
    }

    var releaseYear by mutableStateOf(0)
        private set

    fun updateReleaseYear(input: Int) {
        releaseYear = input
    }

    var color by mutableStateOf("")
        private set

    fun updateColor(input: String) {
        color = input
    }

    var price by mutableStateOf(0)
        private set

    fun updatePrice(input: Int) {
        price = input
    }


    var engine by mutableStateOf("")
        private set

    fun updateEngine(input: String) {
        engine = input
    }

    //    Car Data Model
    var capacity by mutableStateOf(0)
        private set

    fun updateCapacity(input: Int) {
        capacity = input
    }

    var type by mutableStateOf("")
        private set

    fun updateType(input: String) {
        type = input
    }

    //    Motor Data Model
    var suspensionType by mutableStateOf("")
        private set

    fun updateSuspensionType(input: String) {
        suspensionType = input
    }

    var transmisionType by mutableStateOf("")
        private set
    fun updateTransmisionType(input: String) {
        transmisionType = input
    }

//    Car

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

    fun getCar(id : Int) {
        viewModelScope.launch {
            repository.getCar(id)
        }
    }

     fun insertCar() {
        viewModelScope.launch(Dispatchers.IO) {
            repository.addCar(
                Car(
                    id = 0, vehicleName, quantity, releaseYear, color,
                    price.toLong(), engine, capacity, type
                )
            )
        }
    }

    //Motor

    fun getAllMotor() {
        viewModelScope.launch {
            repository.getAllMotor()
        }
    }
    fun insertMotor() {
        viewModelScope.launch(Dispatchers.IO) {
            repository.addMotor(
                motorbike = Motorbike(
                    id = 0, vehicleName, quantity, releaseYear, color,
                    price.toLong(), engine, suspensionType, transmisionType
                )
            )
        }
    }

//    selling
    fun addSelling(id: Int) {
        viewModelScope.launch {
            repository.addSelling(Selling(id = 1, vehicleId = id))
        }
    }


}


data class HomeState(
    val datalist: List<Car> = emptyList(),
)