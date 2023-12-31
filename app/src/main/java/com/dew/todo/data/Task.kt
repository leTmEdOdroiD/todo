package com.dew.todo.data

data class Task(
    val id: Int,
    val title: String,
    val description: String? = null,
    val time: String,
)


val taskList = listOf(
    Task(
        1,
        "Do Laundry",
        "Wash and fold clothes",
        "10:00",
    ),
    Task(
        2,
        "Clean Kitchen",
        "Wash dishes, wipe counters, and mop the floor",
        "11:30",
    ),
    Task(
        3,
        "Vacuum Living Room",
        "Clean carpets and furniture",
        "13:00",
    ),
    Task(
        4,
        "Water Plants",
        "Water indoor and outdoor plants",
        "15:00",
    ),
    Task(
        5,
        "Cook Dinner",
        "Prepare a meal for the family",
        "18:00",
    ),
    Task(
        6,
        "Clean Bathrooms",
        "Clean sinks, toilets, showers, and tubs",
        "9:00",
    ),
    Task(
        7,
        "Organize Closet",
        "Sort and fold clothes and arrange them in the closet",
        "11:00",
    ),
    Task(
        8,
        "Dust Furniture",
        "Dust and polish tables, shelves, and other furniture",
        "14:00",
    ),
    Task(
        9,
        "Clean Windows",
        "Wash and wipe windows and mirrors",
        "16:30",
    ),
    Task(
        10,
        "Take Out Trash",
        "Collect and dispose of garbage and recycling",
        "20:00",
    )
)