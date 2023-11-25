package com.example.pesanin.ui.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.pesanin.data.motor.Motorbike

@Composable
fun MotorList(
    dataList: List<Motorbike>,
    onMotorClick: (Motorbike) -> Unit
) {
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(dataList) { data ->
            MotorItemCard(motor = data, onMotorClick)
        }
    }
}

//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun listMotorPreview() {
//    val motorbikeLists = listOf(
//        Motorbike(1, "Supra Fit", 5, 2010, "Black", 10000000, "V2", "Hard", "Smooth"),
//        Motorbike(1, "Supra Fit", 5, 2010, "Black", 10000000, "V2", "Hard", "Smooth"),
//        Motorbike(1, "Supra Fit", 5, 2010, "Black", 10000000, "V2", "Hard", "Smooth"),
//        )
//
//    PesanInTheme {
//        MotorList(dataList = motorbikeLists)
//    }
//}


