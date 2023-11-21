package com.example.pesanin.data

import CarDao
import Motor
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.pesanin.data.car.Car
import com.example.pesanin.data.customer.Customer
import com.example.pesanin.data.customer.CustomerDao
import com.example.pesanin.data.selling.Selling
import com.example.pesanin.data.selling.SellingDao

@Database(
    entities = [Car::class, Motor::class, Selling::class, Customer::class],
    version = 1)
abstract class SellingVehicleDatabase() : RoomDatabase() {

    abstract fun carDao(): CarDao
    abstract fun motorDao() : MotorDao
    abstract fun sellingDao() : SellingDao
    abstract fun custDao() : CustomerDao

    companion object {
        @Volatile
        private var Instance: SellingVehicleDatabase? = null

        fun getDatabase(context: Context): SellingVehicleDatabase {
            return Instance ?: synchronized(this) {
                val instance = Room.databaseBuilder(context, SellingVehicleDatabase::class.java, "selling_vehicle_db")
                    .build()
                    Instance = instance
                return instance
            }
        }
    }
}
