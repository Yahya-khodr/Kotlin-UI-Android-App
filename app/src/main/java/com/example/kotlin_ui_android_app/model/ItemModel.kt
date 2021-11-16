package com.example.kotlin_ui_android_app.model

data class ItemModel(
    val itemTitle: String,
    val items : List<Item>,
)

data class Item(
    val itemName : String,
)
