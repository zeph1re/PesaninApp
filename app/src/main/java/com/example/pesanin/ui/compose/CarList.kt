package com.example.pesanin.ui.compose

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pesanin.data.car.Car
import com.example.pesanin.ui.theme.PesanInTheme
import java.util.Date

@Composable
fun CarList(
    datalist: List<Car>
) {
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    )
    {
        items(datalist) { data ->
            CarItemCard(item = data)
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun listCarPreview() {
    val carList = listOf(
        Car(1, "Toyota Supra", 10, Date(2020), "Hijau", 200000000, "V8", 4, "Small"),
        Car(2, "Toyota", 10, Date(2020), "Hijau", 200000000, "V8", 4, "Small"),
        Car(3, "Honda", 10, Date(2020), "Hijau", 200000000, "V8", 4, "Small")

    )

    PesanInTheme {
        CarList(datalist = carList)
    }
}