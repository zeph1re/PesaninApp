package com.example.pesanin.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize
import java.util.Date


@Entity(tableName = "kendaraan")
@Parcelize
data class Kendaraan (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name : String = "",
    val tahunKeluaran : Date? = null,
    val warna : String = "",
    val harga : Int = 0,
) : Parcelable

@Entity(tableName = "mobil")
@Parcelize
data class Mobil(
    val kendaraan: Kendaraan,
    val mesin : String = "",
    val kapasitasPenumpang : Int = 0,
    val tipe : String = ""
) : Parcelable {
    // proxy fields for convenience
    val id get() = kendaraan.id
    val tahunKendaraan get() = kendaraan.tahunKeluaran
    val warna get() = kendaraan.warna
    val harga get() = kendaraan.harga
}

@Entity(tableName = "motor")
@Parcelize
data class Motor(
    val kendaraan: Kendaraan,
    val mesin : String = "",
    val tipeSuspensi : String = "",
    val tipeTransmisi : String = ""
) : Parcelable {
    // proxy fields for convenience
    val id get() = kendaraan.id
    val tahunKendaraan get() = kendaraan.tahunKeluaran
    val warna get() = kendaraan.warna
    val harga get() = kendaraan.harga
}