package com.dew.todo.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dew.todo.component.HomeHeaderComponent
import com.dew.todo.component.TaskComponent
import com.dew.todo.component.WelcomeMessageComponent
import com.dew.todo.data.taskList

@Composable
@Preview(showSystemUi = true)
fun HomePage() {
    LazyColumn(
        contentPadding = PaddingValues(
            start = 16.dp, end = 16.dp, bottom = 16.dp
        )
    ) {
        item {
            Spacer(modifier = Modifier.height(16.dp))
            HomeHeaderComponent()
        }
        item {
            Spacer(modifier = Modifier.height(28.dp))
            WelcomeMessageComponent()
            Spacer(modifier = Modifier.height(28.dp))
        }
        items(taskList) {
            Spacer(modifier = Modifier.height(16.dp))
            TaskComponent(task = it)
        }
    }
}