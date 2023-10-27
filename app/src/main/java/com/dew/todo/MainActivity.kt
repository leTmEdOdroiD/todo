package com.dew.todo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dew.todo.data.BottomNavigationItem
import com.dew.todo.data.Screens
import com.dew.todo.ui.CalenderPage
import com.dew.todo.ui.HomePage
import com.dew.todo.ui.NotificationPage
import com.dew.todo.ui.theme.TodoTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var navigationSelectedItem by remember { mutableStateOf(0) }
            val navController = rememberNavController()
            TodoTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = {
                        NavigationBar {
                            BottomNavigationItem().bottomNavigationItems()
                                .forEachIndexed { index, bottomNavigationItem ->
                                    NavigationBarItem(selected = index == navigationSelectedItem,
                                        label = { Text(text = bottomNavigationItem.label) },
                                        icon = {
                                            Icon(
                                                bottomNavigationItem.icon,
                                                contentDescription = bottomNavigationItem.label
                                            )
                                        }, onClick = {
                                            navigationSelectedItem = index
                                            navController.navigate(bottomNavigationItem.route) {
                                                popUpTo(navController.graph.findStartDestination().id) {
                                                    saveState = true
                                                }
                                                launchSingleTop = true
                                                restoreState = true
                                            }
                                        }
                                    )
                                }
                        }
                    }
                ) { padding ->
                    NavHost(
                        navController = navController,
                        startDestination = Screens.Home.route,
                        modifier = Modifier.padding(paddingValues = padding),
                    ) {
                        composable(Screens.Home.route) {
                            HomePage()
                        }
                        composable(Screens.Calender.route) {
                            CalenderPage()
                        }
                        composable(Screens.Notification.route) {
                            NotificationPage()
                        }

                    }
                }
            }
        }
    }
}

