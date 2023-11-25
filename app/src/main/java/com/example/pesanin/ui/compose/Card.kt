package com.example.pesanin.ui.compose


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pesanin.data.car.Car
import com.example.pesanin.data.motor.Motorbike


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CarItemCard(
    car: Car,
    onCarClick : (Car) -> Unit
) {
    ElevatedCard(
        onClick = {onCarClick(car)},
        modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)

    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy( 8.dp)
        ) {
            Row {
                Text(
                    text = car.vehicleName,
                    style = MaterialTheme.typography.titleLarge
                )
                Spacer(Modifier.weight(1f))
                Text(
                    text = car.price.toString(),
                    style = MaterialTheme.typography.titleMedium
                )
            }
            Text(text = "Engine ${car.engine}, Type: ${car.type}",
                style = MaterialTheme.typography.bodySmall)
            Text(text = "Stock: ${car.quantity}",
                style = MaterialTheme.typography.bodyMedium)
        }
    }
}

@Composable
fun MotorItemCard(
    motor: Motorbike,
    onMotorClick : (Motorbike) -> Unit
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
                    text = motor.vehicleName,
                    style = MaterialTheme.typography.titleLarge
                )
                Spacer(Modifier.weight(1f))
                Text(
                    text = motor.price.toString(),
                    style = MaterialTheme.typography.titleMedium
                )
            }
            Text(text = "Engine ${motor.engine},Suspension Type: ${motor.suspensionType}",
                style = MaterialTheme.typography.bodySmall)
            Text(text = "Stock: ${motor.quantity}",
                style = MaterialTheme.typography.bodyMedium)
        }
    }
}

