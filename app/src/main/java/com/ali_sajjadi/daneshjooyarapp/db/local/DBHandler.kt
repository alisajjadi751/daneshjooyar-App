package com.ali_sajjadi.daneshjooyarapp.db.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.ali_sajjadi.daneshjooyarapp.db.local.dao.VideoTimeDao
import com.ali_sajjadi.daneshjooyarapp.db.local.model.VideoTimeEntity

@Database(
    entities = [VideoTimeEntity::class],
    version = DBHandler.DATABASE_VERSION
)
abstract class DBHandler : RoomDatabase() {

    abstract fun videoTimeDao(): VideoTimeDao

    companion object {

        private const val DATABASE_NAME = "main_database"
        const val DATABASE_VERSION = 1

        const val VideoTime_TABLE = "videoTimeTable"

        private var INSTANCE: DBHandler? = null

        fun getDatabase(context: Context): DBHandler {

            if (INSTANCE == null)

                INSTANCE = Room.databaseBuilder(
                    context,
                    DBHandler::class.java,
                    DATABASE_NAME
                )
                    .fallbackToDestructiveMigration()
                    .build()

            return INSTANCE!!
        }


    }

}