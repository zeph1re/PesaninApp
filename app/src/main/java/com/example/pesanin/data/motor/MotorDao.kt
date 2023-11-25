package com.example.pesanin.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.pesanin.data.motor.Motorbike
import kotlinx.coroutines.flow.Flow


@Dao
interface MotorDao {

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMotor (motorbike: Motorbike)

    @Update
    suspend fun updateMotor (motorbike: Motorbike)

    @Delete
    suspend fun deleteMotor (motorbike : Motorbike)

    @Query ("SELECT * FROM motor")
    fun getAllMotor () : Flow<List<Motorbike>>

    @Query ("SELECT * FROM motor where motor_id = :id")
    fun getMotor (id : Int) : Flow<Motorbike>
}