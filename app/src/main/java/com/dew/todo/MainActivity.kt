package com.dew.todo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dew.todo.component.HomeHeaderComponent
import com.dew.todo.component.WelcomeMessageComponent
import com.dew.todo.ui.theme.TodoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TodoTheme {
                HomePage()
            }
        }
    }
}

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
            Spacer(modifier = Modifier.height(16.dp))
            WelcomeMessageComponent()
        }
    }
}
