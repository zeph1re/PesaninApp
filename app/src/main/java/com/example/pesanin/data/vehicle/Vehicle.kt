package com.example.pesanin.data.vehicle

import java.util.Date

open class Vehicle (
    open val id: Int,
    open val vehicleName : String,
    open val releaseYear : Date,
    open val quantity : Int,
    open val color : String,
    open val price : Long
)


