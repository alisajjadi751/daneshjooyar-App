package com.ali_sajjadi.daneshjooyarapp.mvp.model

import DataCourseVideo
import android.app.Activity
import android.content.Context
import android.content.Intent

class ModelVideoCourseActivity(
   private val mContext: Context
) {

    fun courseVideo() = (mContext as Activity).intent.getParcelableExtra<DataCourseVideo>("video")
    fun courseTitle() = (mContext as Activity).intent.getStringExtra("title")

}
