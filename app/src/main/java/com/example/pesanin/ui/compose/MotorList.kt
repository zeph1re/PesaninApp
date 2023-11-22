package com.example.pesanin.ui.compose

import Motor
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pesanin.ui.theme.PesanInTheme
import java.util.Date

@Composable
fun MotorList(
    dataList: List<Motor>
) {
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(dataList) { data ->
            MotorItemCard(item = data)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun listMotorPreview() {
    val motorList = listOf(
        Motor(1, "Supra Fit", 5, Date(2010), "Black", 10000000, "V2", "Hard", "Smooth"),
        Motor(1, "Supra Fit", 5, Date(2010), "Black", 10000000, "V2", "Hard", "Smooth"),
        Motor(1, "Supra Fit", 5, Date(2010), "Black", 10000000, "V2", "Hard", "Smooth"),
        )

    PesanInTheme {
        MotorList(dataList = motorList)
    }
}


