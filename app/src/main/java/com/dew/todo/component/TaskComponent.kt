package com.dew.todo.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dew.todo.data.Task
import com.dew.todo.ui.theme.*

@Composable
fun TaskComponent(task: Task) {
    val taskColor = listOf(Purple80, PurpleGrey80, Pink80,green80).random()
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        Text(
            text = "${task.time}\nAM",
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Center
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier
                    .weight(0.9f)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(14.dp))
                    .background(taskColor),
                verticalArrangement = Arrangement.spacedBy(12.dp),
            ) {
                Text(
                    text = task.title,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(
                        start = 12.dp,
                        top = 12.dp
                    )
                )
                if (task.description != null) {
                    Text(
                        text = task.description,
                        fontWeight = FontWeight.Normal,
                        fontSize = 16.sp,
                        modifier = Modifier.padding(
                            start = 12.dp,
                            bottom = 12.dp,
                        )
                    )
                }

            }

            Box(
                modifier = Modifier
                    .size(16.dp)
                    .clip(CircleShape)
                    .border(
                        border = BorderStroke(3.dp, Color.Black),
                        shape = CircleShape
                    )
            )
        }
    }
}