package com.ali_sajjadi.daneshjooyarapp.db.local.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity()
data class VideoTimeEntity(
    @PrimaryKey(autoGenerate = true )val id : Int,
    @ColumnInfo val time : Int
)
