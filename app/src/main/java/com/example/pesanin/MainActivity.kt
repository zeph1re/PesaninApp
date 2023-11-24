package com.example.pesanin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.pesanin.ui.screen.App
import com.example.pesanin.ui.theme.PesanInTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        val carDao = SellingVehicleDatabase.getDatabase(application).carDao()
//        val authDao = SellingVehicleDatabase.getDatabase(application).userDao()
//        val motorDao = SellingVehicleDatabase.getDatabase(application).motorDao()
//        val sellingDao = SellingVehicleDatabase.getDatabase(application).sellingDao()
//
//        val authRepository = AuthRepository(authDao)
//        val homeRepository = Repository(carDao, motorDao, sellingDao)
//
//        val homeFactory = HomeViewModelFactory(homeRepository)
//        val authFactory = AuthViewModelFactory(authRepository)
        setContent {
            PesanInTheme {
                // A surface container using the 'background' color from the theme
                App()
            }
        }
    }
}




