package com.example.pesanin.data.user

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "user")
data class User (
    @ColumnInfo(name = "user_id")
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val name: String,
    val username : String,
    val password : String,
    val address : String,
    val role : String
) : Parcelable
