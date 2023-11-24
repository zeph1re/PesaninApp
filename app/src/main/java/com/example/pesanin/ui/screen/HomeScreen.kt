@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.pesanin.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview






@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Magenta),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "HOME",
            fontSize = MaterialTheme.typography.bodySmall.fontSize,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
    }
}

@Composable
@Preview (showSystemUi = true)
fun HomeScreenPreview() {
    HomeScreen()
}


