package com.example.pesanin.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddMotorScreen() {

    var vehicleName by remember { mutableStateOf("") }
    var quantity by remember { mutableStateOf(0) }
    var releaseYear by remember { mutableStateOf(0) }
    var color by remember { mutableStateOf("") }
    var price by remember { mutableStateOf(0) }
    var engine by remember { mutableStateOf("") }
    var suspensionType by remember { mutableStateOf("") }
    var transmisionType by remember { mutableStateOf("") }

    Box {
        Column(
            modifier = Modifier.padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Add Motorbike",
                fontSize = MaterialTheme.typography.titleLarge.fontSize,
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = vehicleName,
                onValueChange = { vehicleName = it },
                label = { Text("Vehicle Name") }
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = quantity.toString(),
                onValueChange = { quantity = it.toInt() },
                label = { Text("Quantity") }
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = releaseYear.toString(),
                onValueChange = { releaseYear = it.toInt() },
                label = { Text("Release Year") },
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = color,
                onValueChange = { color = it },
                label = { Text("Color") }
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = price.toString(),
                onValueChange = { price = it.toInt() },
                label = { Text("Price") }
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = engine,
                onValueChange = { engine = it },
                label = { Text("Engine") }
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = suspensionType,
                onValueChange = { suspensionType = it },
                label = { Text("Capacity") }
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = transmisionType,
                onValueChange = { transmisionType = it },
                label = { Text("Type Car") }
            )
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = {
                    // Trigger the login function in the ViewModel
//                    authViewModel.login(email, password)
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(
                    "Add Motorbike",
                    fontSize = MaterialTheme.typography.bodySmall.fontSize,
                )
            }
        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun AddMotorPreview() {
    AddMotorScreen()
}