package com.example.pesanin.data.selling

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "selling")
data class Selling(
    @ColumnInfo(name = "selling_id")
    @PrimaryKey val id : Int,
    val vehicleId : Int
)

