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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pesanin.viewmodel.HomeViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddCarScreen(viewModel: HomeViewModel) {

    Box {
        Column(
            modifier = Modifier.padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Add Car",
                fontSize = MaterialTheme.typography.titleLarge.fontSize,
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = viewModel.vehicleName,
                onValueChange = { name -> viewModel.updateVehicleName(name) },
                label = { Text("Vehicle Name") }
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = viewModel.quantity.toString(),
                onValueChange = { it -> viewModel.updateQuantity(it.toInt()) },
                label = { Text("Quantity") }
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = viewModel.releaseYear.toString(),
                onValueChange = { it->  viewModel.updateReleaseYear(it.toInt()) },
                label = { Text("Release Year") },
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = viewModel.color,
                onValueChange = { color -> viewModel.updateColor(color) },
                label = { Text("Color") }
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = viewModel.price.toString(),
                onValueChange = { price -> viewModel.updatePrice(price.toInt()) },
                label = { Text("Price") }
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = viewModel.engine,
                onValueChange = { engine -> viewModel.updateEngine(engine) },
                label = { Text("Engine") }
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = viewModel.capacity.toString(),
                onValueChange = { capacity -> viewModel.updateCapacity(capacity.toInt() ) },
                label = { Text("Capacity") }
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = viewModel.type,
                onValueChange = { type -> viewModel.updateType(type) },
                label = { Text("Type Car") }
            )
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = {
                    // Trigger the login function in the ViewModel
//                    authViewModel.login(email, password)
                          viewModel.insertCar()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(
                    "Add Car",
                    fontSize = MaterialTheme.typography.bodySmall.fontSize,
                )
            }
        }
    }

}

//@Preview(showSystemUi = true)
//@Composable
//fun AddCarPreview() {
//    AddCarScreen(HomeViewModel by viewModels())
//}