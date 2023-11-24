//package com.example.pesanin.ui.graph
//
//import android.content.Context
//import com.example.pesanin.data.SellingVehicleDatabase
//import com.example.pesanin.repository.Repository
//
//object Graph {
//    lateinit var db:SellingVehicleDatabase
//        private set
//
//    val repository by lazy {
//        Repository(
//            listDao = db.listDao(),
//            storeDao = db.storeDao(),
//            itemDao = db.itemDao()
//        )
//    }
//
//    fun provide(context: Context){
//        db = SellingVehicleDatabase.getDatabase(context)
//    }
//
//
//
