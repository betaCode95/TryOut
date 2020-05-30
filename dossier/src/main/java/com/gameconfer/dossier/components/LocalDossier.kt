package com.gameconfer.dossier.components

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [], version = 1, exportSchema = false)
abstract class LocalDossier : RoomDatabase() {
    companion object {
        private var roomDB: LocalDossier? = null

        fun create(context: Context, name: String): LocalDossier? {
            if (roomDB == null) {
                roomDB = Room.databaseBuilder(context, LocalDossier::class.java, name)
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return roomDB
        }
    }
}