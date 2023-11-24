package com.example.pesanin.data.selling

import Motorbike
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.pesanin.data.car.Car
import kotlinx.coroutines.flow.Flow

@Dao
interface SellingDao {

    @Insert
    fun addSellingData( item : Selling)

    @Update
    fun updateSellingData(item : Selling)

    @Query ("SELECT * FROM car as C INNER JOIN  selling as S ON C.car_id = S.vehicleId")
    fun getAllCarSelling () : Flow<List<Car>>

    @Query ("SELECT * FROM car as C INNER JOIN  selling as S ON C.car_id = S.vehicleId WHERE id = :id")
    fun getCarSelling (id : Int) : Flow<Motorbike>

    @Query ("SELECT * FROM motor as M INNER JOIN  selling as S ON M.motor_id = S.vehicleId")
    fun getAllMotorSelling () : Flow<List<Motorbike>>

    @Query ("SELECT * FROM motor as M INNER JOIN  selling as S ON M.motor_id = S.vehicleId  WHERE id = :id")
    fun getMotorSelling (id: Int) : Flow<List<Motorbike>>


}