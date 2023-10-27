package com.dew.todo.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun WelcomeMessageComponent() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.Start
    ) {
        Text(text = "Welcome Dew", fontWeight = FontWeight.Bold, fontSize = 20.sp)
        Text(
            text = "Your task",
            color = Color.Gray,
            fontWeight = FontWeight.Light,
            fontSize = 18.sp
        )
    }
}