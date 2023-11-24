package com.example.pesanin.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pesanin.data.car.Car
import com.example.pesanin.repository.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel (private val repository : Repository) : ViewModel() {

    private val _car = MutableLiveData<Car>()
    val car : LiveData<Car> = _car

//    var state by mutableStateOf(HomeState())
//        private set

    init {
        getAllCar()
    }

    fun getAllCar() {
        viewModelScope.launch {
            repository.getAllCar()
        }
    }

    fun insertCar(car : Car) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.addCar(car)
        }
    }
}

//data class HomeState(
//    val itemChecked:Boolean = false
//)