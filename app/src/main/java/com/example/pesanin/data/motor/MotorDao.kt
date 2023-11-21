package com.example.pesanin.data

import Motor
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow


@Dao
interface MotorDao {

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMotor (motor: Motor)

    @Update
    suspend fun updateMotor (motor: Motor)

    @Delete
    suspend fun deleteMotor (motor : Motor)

    @Query ("SELECT * FROM motor")
    fun getAllMotor () : Flow<List<Motor>>

    @Query ("SELECT * FROM motor where motor_id = :id")
    fun getMotor (id : Int) : Flow<Motor>
}