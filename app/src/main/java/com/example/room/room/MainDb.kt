package com.example.room.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

/**Основной класс, который будет создавать БД, а если она уже есть - выдавать инстанцию этой БД*/
//аннотация для объявления базы данных.
@Database(
    entities = [Item::class],
    version = 1,
    exportSchema = false
)
abstract class MainDb : RoomDatabase() {
    companion object {
        fun getDb(context: Context): MainDb {
            return Room.databaseBuilder(context.applicationContext, MainDb::class.java, "TestBB")
                .build()
        }
    }
}