@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.pesanin.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
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
import com.example.pesanin.ui.theme.PesanInTheme
import com.example.pesanin.viewmodel.HomeViewModel


@Composable
fun HomeScreen(
    modifier: Modifier,
    viewModel: HomeViewModel,
    onAddCarClick: () -> Unit,
    onCarClick: (Car) -> Unit,
) {
    val cars = viewModel.datalist.datalist

    HomeScreen(
        cars = cars,
        modifier = modifier,
        onAddCarClick = onAddCarClick,
        onCarClick = onCarClick
    )
}

@Composable
fun HomeScreen(
    cars: List<Car>,
    modifier: Modifier = Modifier,
    onAddCarClick: () -> Unit,
    onCarClick: (Car) -> Unit,
) {

    if (cars.isEmpty()) {
        EmptyCar(onAddCarClick = onAddCarClick, modifier)
    } else {
        CarsList(cars, onCarClick, modifier)
    }
}


//    val datalist = mutableListOf<Car>(
//        Car(1, "Toyota Supra", 10, 2020, "Hijau", 200000000, "V8", 4, "Small"),
//        Car(2, "Toyota", 10, 2020, "Hijau", 200000000, "V8", 4, "Small"),
//        Car(3, "Honda", 10, 2020, "Hijau", 200000000, "V8", 4, "Small"),
//        Car(4, "Toyota Supra", 10, 2020, "Hijau", 200000000, "V8", 4, "Small"),
//        Car(5, "Toyota", 10, 2020, "Hijau", 200000000, "V8", 4, "Small"),
//        Car(6, "Honda", 10, 2020, "Hijau", 200000000, "V8", 4, "Small"),
//        Car(7, "Toyota Supra", 10,2020, "Hijau", 200000000, "V8", 4, "Small"),
//        Car(8, "Toyota", 10, 2020, "Hijau", 200000000, "V8", 4, "Small"),
//        Car(9, "Honda", 10, 2020, "Hijau", 200000000, "V8", 4, "Small")
//    )

@Composable
private fun CarsList(
    cars: List<Car>,
    onCarClick: (Car) -> Unit,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 8.dp)
    ) {
        Column {
            Text(
                modifier = Modifier.padding(32.dp),
                text = "Home Page",
                fontSize = MaterialTheme.typography.titleLarge.fontSize,
                fontWeight = FontWeight.Bold,
            )
            CarList(datalist = cars, onCarClick)
        }
        FloatingActionButton(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(16.dp),
            containerColor = Color.DarkGray,
            onClick = {}
        ) {
            Text(text = "Add Car", color = Color.White)

        }
    }
}

@Composable
private fun EmptyCar(onAddCarClick: () -> Unit, modifier: Modifier = Modifier) {
    // Calls reportFullyDrawn when this composable is composed.

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 8.dp),
        contentAlignment = Alignment.Center,
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Empty",
                style = MaterialTheme.typography.headlineSmall
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                shape = MaterialTheme.shapes.medium,
                onClick = onAddCarClick
            ) {
                Text(
                    text = "Add Car",
                    style = MaterialTheme.typography.titleSmall
                )
            }
        }
    }

}

@Preview ( showBackground = true)
@Composable
fun EmptyCar() {
    PesanInTheme {
        EmptyCar(onAddCarClick = { /*TODO*/ })
    }
}
