package com.example.pesanin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.pesanin.ui.screen.Home
import com.example.pesanin.ui.theme.PesanInTheme
import com.example.pesanin.viewmodel.AuthViewModel
import com.example.pesanin.viewmodel.HomeViewModel

class MainActivity : ComponentActivity() {

    private val homeViewModel: HomeViewModel by viewModels()
    private val authViewModel: AuthViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            PesanInTheme {
                // A surface container using the 'background' color from the theme
                Home(homeViewModel, authViewModel)
            }
        }
    }
}


