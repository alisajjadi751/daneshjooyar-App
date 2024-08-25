package com.ali_sajjadi.daneshjooyarapp.mvp.presenter

import com.ali_sajjadi.daneshjooyarapp.mvp.model.ModelCourseActivity
import com.ali_sajjadi.daneshjooyarapp.mvp.view.ViewCourseActivity
import info.alirezaahmadi.frenchpastry.mvp.ext.BaseLifeCycle

class PresenterCourseActivity(
    private val view: ViewCourseActivity,
    private val model: ModelCourseActivity
) : BaseLifeCycle {

    override fun onCreate() {

        view.setupTabLayout(model.dataVideoList(),model.dataInfoList())
        view.initVideoView(model.demoVideo())


    }
}