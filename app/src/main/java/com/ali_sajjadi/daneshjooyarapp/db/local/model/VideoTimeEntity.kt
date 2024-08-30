package com.ali_sajjadi.daneshjooyarapp.db.local.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ali_sajjadi.daneshjooyarapp.db.local.DBHandler

@Entity(DBHandler.VideoTime_TABLE)
data class VideoTimeEntity(
    @PrimaryKey(autoGenerate = true )val id : Int,
    @ColumnInfo val time : Int
)
