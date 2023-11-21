package com.example.pesanin.data.customer

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "customer")
data class Customer (
    @ColumnInfo(name = "customer_id")
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val name: String,
    val username : String,
    val password : String,
    val address : String,
) : Parcelable
