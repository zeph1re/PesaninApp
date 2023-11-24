@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.pesanin.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pesanin.data.car.Car
import com.example.pesanin.ui.compose.CarList
import java.util.Date


@Composable
fun HomeScreen() {

//    val application : Context
//    val viewModel = ViewModelProvider(application)[HomeViewModel::class.java]

    val datalist = mutableListOf<Car>(
        Car(1, "Toyota Supra", 10, Date(2020), "Hijau", 200000000, "V8", 4, "Small"),
        Car(2, "Toyota", 10, Date(2020), "Hijau", 200000000, "V8", 4, "Small"),
        Car(3, "Honda", 10, Date(2020), "Hijau", 200000000, "V8", 4, "Small"),
        Car(4, "Toyota Supra", 10, Date(2020), "Hijau", 200000000, "V8", 4, "Small"),
        Car(5, "Toyota", 10, Date(2020), "Hijau", 200000000, "V8", 4, "Small"),
        Car(6, "Honda", 10, Date(2020), "Hijau", 200000000, "V8", 4, "Small"),
        Car(7, "Toyota Supra", 10, Date(2020), "Hijau", 200000000, "V8", 4, "Small"),
        Car(8, "Toyota", 10, Date(2020), "Hijau", 200000000, "V8", 4, "Small"),
        Car(9, "Honda", 10, Date(2020), "Hijau", 200000000, "V8", 4, "Small")
    )

    Box(
        modifier = Modifier
            .fillMaxSize().padding(horizontal = 8.dp)
    ) {
        Column {
            Text(
                modifier = Modifier.padding(32.dp),
                text = "Home Page",
                fontSize = MaterialTheme.typography.titleLarge.fontSize,
                fontWeight = FontWeight.Bold,
            )
            CarList(datalist = datalist)
        }
        FloatingActionButton(
            modifier = Modifier.align(Alignment.TopEnd).padding(16.dp),
            containerColor = Color.DarkGray,
            onClick = { /*TODO*/ }) {
            Text(text = "Add Car", color = Color.White)

        }
    }
}

@Composable
@Preview (showSystemUi = true)
fun HomeScreenPreview() {
    HomeScreen()
}


