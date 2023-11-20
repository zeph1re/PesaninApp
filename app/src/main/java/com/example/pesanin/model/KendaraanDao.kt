package com.example.pesanin.model

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow


@Dao
interface KendaraanDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(item: Kendaraan)

    @Update
    suspend fun update(item: Kendaraan)

    @Delete
    suspend fun delete(item: Kendaraan)

    @Query("SELECT * from items WHERE id = :id")
    fun getItem(id: Int): Flow<Kendaraan>

    @Query("SELECT * from items ORDER BY name ASC")
    fun getAllItems(): Flow<List<Kendaraan>>
}