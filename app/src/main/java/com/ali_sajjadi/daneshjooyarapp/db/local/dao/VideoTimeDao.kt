package com.ali_sajjadi.daneshjooyarapp.db.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.ali_sajjadi.daneshjooyarapp.db.local.DBHandler
import com.ali_sajjadi.daneshjooyarapp.db.local.model.VideoTimeEntity

@Dao
interface VideoTimeDao {

    @Insert
    fun insertTime(time: VideoTimeEntity)

    @get:Query("SELECT * FROM ${DBHandler.VideoTime_TABLE}")
    val getTime : List<VideoTimeEntity>

    @Update
    fun updateTime (time : VideoTimeEntity):Int

}