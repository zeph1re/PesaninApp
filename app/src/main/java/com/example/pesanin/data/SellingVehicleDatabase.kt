package com.example.pesanin.data

import CarDao
import Motorbike
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.pesanin.data.car.Car
import com.example.pesanin.data.selling.Selling
import com.example.pesanin.data.selling.SellingDao


@Database(
    entities = [Car::class, Motorbike::class, Selling::class],
    version = 1)
abstract class SellingVehicleDatabase() : RoomDatabase() {

    abstract fun carDao(): CarDao
    abstract fun motorDao() : MotorDao
    abstract fun sellingDao() : SellingDao

    companion object {
        @Volatile
        private var Instance: SellingVehicleDatabase? = null

        fun getDatabase(context : Context): SellingVehicleDatabase {
            return Instance ?: synchronized(SellingVehicleDatabase::class) {
                val instance = Room.databaseBuilder(context, SellingVehicleDatabase::class.java, "selling_vehicle_db")
                    .build()
                    Instance = instance
                return instance
            }
        }

        fun destroyInstance() {
            Instance = null
        }
    }
}
