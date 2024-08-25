package com.ali_sajjadi.daneshjooyarapp.mvp.model

import DataInfo
import DataListVideo
import android.app.Activity
import android.content.Context


class ModelCourseActivity(
    private val context: Context
){

    fun dataVideoList() =
        (context as Activity).intent.getParcelableArrayListExtra<DataListVideo>("videoList")
    fun dataInfoList() =
        (context as Activity).intent.getParcelableArrayListExtra<DataInfo>("infoList")

}
