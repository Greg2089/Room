package com.example.room.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Таблица для БД*/
@Entity(tableName = "items") //аннотация для объявления сущности базы данных.
data class Item(
    //аннотация для объявления первичного ключа сущности.
    @PrimaryKey(autoGenerate = true) var id: Int? = null,
    //аннотация для настроек конкретного столбца сущности.
    @ColumnInfo(name = "name") var name: String,
    @ColumnInfo(name = "price") var price: String
)