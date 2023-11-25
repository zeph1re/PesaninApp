package com.example.pesanin.data.car

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface CarDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCar (car: Car)

    @Update
    suspend fun updateCar (car: Car)

    @Delete
    suspend fun deleteCar (car : Car)

    @Query("SELECT * FROM car")
    fun getAllCar () : Flow<List<Car>>

    @Query("SELECT * FROM car where car_id = :id")
    fun getCar (id : Int) : Flow<Car>
}