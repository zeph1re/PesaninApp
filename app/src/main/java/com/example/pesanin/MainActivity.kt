package com.example.pesanin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.pesanin.data.SellingVehicleDatabase
import com.example.pesanin.repository.Repository
import com.example.pesanin.ui.screen.App
import com.example.pesanin.ui.theme.PesanInTheme
import com.example.pesanin.viewmodel.HomeViewModel

class MainActivity : ComponentActivity() {

    lateinit var db : SellingVehicleDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        db = SellingVehicleDatabase.getDatabase(this)

        val repository by lazy {
            Repository(
                carDao = db.carDao(),
                motorDao = db.motorDao(),
                sellingDao = db.sellingDao()
            )
        }

        val homeViewModel = HomeViewModel(repository)

        setContent {
            PesanInTheme {
                // A surface container using the 'background' color from the theme
                App(homeViewModel)
            }
        }
    }
}




