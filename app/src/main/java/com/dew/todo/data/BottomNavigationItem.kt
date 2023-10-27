package com.dew.todo.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavigationItem(
    val label : String = "",
    val icon : ImageVector = Icons.Filled.Home,
    val route : String = ""
) {

    //function to get the list of bottomNavigationItems
    fun bottomNavigationItems() : List<BottomNavigationItem> {
        return listOf(
            BottomNavigationItem(
                label = "Home",
                icon = Icons.Filled.Home,
                route = Screens.Home.route
            ),
            BottomNavigationItem(
                label = "Calender",
                icon = Icons.Filled.DateRange,
                route = Screens.Calender.route
            ),
            BottomNavigationItem(
                label = "Notification",
                icon = Icons.Filled.Notifications,
                route = Screens.Notification.route
            ),
        )
    }
}

sealed class Screens(val route : String) {
    object Home : Screens("home_route")
    object Calender : Screens("calender_route")
    object Notification : Screens("notification_route")
}
