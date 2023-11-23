package com.example.pesanin.repository

import CarDao
import com.example.pesanin.data.MotorDao
import com.example.pesanin.data.car.Car
import com.example.pesanin.data.selling.SellingDao

class Repository (
    private val carDao: CarDao,
    private val motorDao: MotorDao,
    private val sellingDao: SellingDao
)  {

//    Car
//    Get all car
     fun getAllCar () {
        carDao.getAllCar()
    }

//    Get all car
    fun getAllMotor () {
        motorDao.getAllMotor()
    }

    suspend fun addCar(car: Car) {
        carDao.insertCar(car)
    }






}