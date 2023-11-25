package com.example.pesanin.ui.compose

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.pesanin.data.car.Car

@Composable
fun CarList(
    datalist: List<Car>,
    onCarClick : (Car) -> Unit
) {
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    )
    {
        items(
            datalist,
            key = {it.id}
        ) { it ->
            CarItemCard(car = it, onCarClick)
        }

    }
}