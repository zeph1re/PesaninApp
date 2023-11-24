package com.example.pesanin.repository

import CarDao
import Motorbike
import com.example.pesanin.data.MotorDao
import com.example.pesanin.data.car.Car
import com.example.pesanin.data.selling.Selling
import com.example.pesanin.data.selling.SellingDao
import kotlinx.coroutines.flow.Flow

class Repository (
    private val carDao: CarDao,
    private val motorDao: MotorDao,
    private val sellingDao: SellingDao,
)  {

//    Car
//    Get all car
    fun getAllCar() : List<Car> {
        return carDao.getAllCar()
    }

//    Get all car
     fun getAllMotor () : Flow<List<Motorbike>>{
        return motorDao.getAllMotor()
    }

    suspend fun addCar(car: Car) {
        carDao.insertCar(car)
    }

    suspend fun addMotor(motorbike: Motorbike) {
        motorDao.insertMotor(motorbike)
    }

    suspend fun addSelling(item: Selling) {
        sellingDao.addSellingData(item)
    }








}