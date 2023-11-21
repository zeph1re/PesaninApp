package com.example.pesanin.data.selling

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface SellingDao {

    @Insert
    fun addSellingData( item : Selling)

    @Update
    fun updateSellingData(item : Selling)

    @Query ("SELECT * FROM selling as s ")
    fun getAllSellingDatas () : Flow<List<Selling>>

    fun getSellingData () : Flow<Selling>
}