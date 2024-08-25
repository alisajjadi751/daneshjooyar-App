package com.ali_sajjadi.daneshjooyarapp.mvp.presenter

import com.ali_sajjadi.daneshjooyarapp.mvp.model.ModelVideosFragment
import com.ali_sajjadi.daneshjooyarapp.mvp.view.ViewVideosFragment
import info.alirezaahmadi.frenchpastry.mvp.ext.BaseLifeCycle

class PresenterVideosFragment(
    private val view: ViewVideosFragment,
    private val model: ModelVideosFragment
) : BaseLifeCycle {

    override fun onCreate() {
        view.setCourseRecycler(model.dataList())
    }

}
