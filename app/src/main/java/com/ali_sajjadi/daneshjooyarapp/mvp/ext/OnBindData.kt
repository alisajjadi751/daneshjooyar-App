package com.ali_sajjadi.daneshjooyarapp.mvp.ext

import com.ali_sajjadi.daneshjooyarapp.db.local.model.VideoTimeEntity

interface OnBindData {

    fun saveData(videoTimeEntity: VideoTimeEntity)

}