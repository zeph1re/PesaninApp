package com.example.pesanin.ui.compose

import Motorbike
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pesanin.data.car.Car


@Composable
fun CarItemCard(
    item: Car
) {
    Card(
        modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)

    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy( 8.dp)
        ) {
            Row {
                Text(
                    text = item.vehicleName,
                    style = MaterialTheme.typography.titleLarge
                )
                Spacer(Modifier.weight(1f))
                Text(
                    text = item.price.toString(),
                    style = MaterialTheme.typography.titleMedium
                )
            }
            Text(text = "Engine ${item.engine}, Type: ${item.type}",
                style = MaterialTheme.typography.bodySmall)
            Text(text = "Stock: ${item.quantity}",
                style = MaterialTheme.typography.bodyMedium)
        }
    }
}

@Composable
fun MotorItemCard(
    item: Motorbike
) {
    Card(
        modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)

    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy( 8.dp)
        ) {
            Row {
                Text(
                    text = item.vehicleName,
                    style = MaterialTheme.typography.titleLarge
                )
                Spacer(Modifier.weight(1f))
                Text(
                    text = item.price.toString(),
                    style = MaterialTheme.typography.titleMedium
                )
            }
            Text(text = "Engine ${item.engine},Suspension Type: ${item.suspensionType}",
                style = MaterialTheme.typography.bodySmall)
            Text(text = "Stock: ${item.quantity}",
                style = MaterialTheme.typography.bodyMedium)
        }
    }
}

