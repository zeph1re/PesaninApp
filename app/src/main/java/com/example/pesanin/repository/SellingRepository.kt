package com.example.pesanin.repository

import CarDao
import com.example.pesanin.data.MotorDao
import com.example.pesanin.data.car.Car
import com.example.pesanin.data.selling.SellingDao
import kotlinx.coroutines.flow.Flow

class SellingRepository (
    private val carDao: CarDao,
    private val motorDao: MotorDao,
    private val sellingDao: SellingDao
) {


}