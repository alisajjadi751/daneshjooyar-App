package com.ali_sajjadi.daneshjooyarapp.mvp.presenter


import com.ali_sajjadi.daneshjooyarapp.mvp.view.ViewVideoCourseActivity
import com.ali_sajjadi.daneshjooyarapp.mvp.model.ModelVideoCourseActivity

import info.alirezaahmadi.frenchpastry.mvp.ext.BaseLifeCycle

class PresenterVideoCourseActivity(
    private val view: ViewVideoCourseActivity,
    private val model: ModelVideoCourseActivity
) : BaseLifeCycle {

    override fun onCreate() {

        view.initVideoView(model.courseVideo())
        view.initTitle(model.courseTitle())
    }
}
