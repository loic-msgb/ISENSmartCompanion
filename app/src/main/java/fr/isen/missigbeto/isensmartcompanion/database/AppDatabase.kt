package fr.isen.missigbeto.isensmartcompanion.database

import androidx.room.Database
import androidx.room.RoomDatabase
import fr.isen.missigbeto.isensmartcompanion.dao.MessageDao
import fr.isen.missigbeto.isensmartcompanion.models.Message

@Database(entities = [Message::class], version = 2, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun messageDao(): MessageDao
}