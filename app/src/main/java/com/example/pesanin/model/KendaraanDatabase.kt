package com.example.pesanin.model

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database (entities = [Kendaraan::class], version = 1, exportSchema = false)
abstract class KendaraanDatabase() : RoomDatabase() {

    abstract fun kendaraanDao(): KendaraanDao

    companion object {
        @Volatile
        private var Instance: KendaraanDatabase? = null

        fun getDatabase(context: Context): KendaraanDatabase {
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(context, KendaraanDatabase::class.java, "kendaraan_database")
                    .build()
                    .also { Instance = it }
            }
        }
    }


}