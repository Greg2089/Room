package com.example.room.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

//аннотация для объявления интерфейса, который будет заниматься манипулированием данными базы данных.
@Dao
/**Указавыем,как приложение будет получать доступ к данным таблицы,создавая аннотированный интерфейс.
 *  Этот интерфейс определяет DAO — или объект доступа к данным, — который включает в себя все методы,
 *  необходимые приложению для вставки, чтения, обновления и удаления данных.*/
interface Dao {
    //аннотация, которая позволяет выполнить вставку в таблицу базы данных.
    @Insert
    fun insertItem(item: Item)

    //аннотация, которая позволяет выполнить SQL-запрос в методах DAO-интерфейса.
    @Query("SELECT * FROM items")
    fun getAllItem(): Flow<List<Item>>
}