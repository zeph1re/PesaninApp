package com.example.pesanin.data.motor
import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.pesanin.data.vehicle.Vehicle
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "motor")
data class Motorbike (
    @ColumnInfo(name = "motor_id")
    @PrimaryKey(autoGenerate = true)
    override val id: Int,
    override val vehicleName: String,
    override val quantity: Int,
    override val releaseYear: Int,
    override val color: String,
    override val price: Long,
    val engine : String,
    val suspensionType : String,
    val transmisionType : String
) : Vehicle(id, vehicleName, releaseYear, quantity, color, price) , Parcelable



