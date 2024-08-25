package com.ali_sajjadi.daneshjooyarapp.mvp.presenter

import com.ali_sajjadi.daneshjooyarapp.mvp.model.ModelMainActivity
import com.ali_sajjadi.daneshjooyarapp.mvp.view.ViewMainActivity
import info.alirezaahmadi.frenchpastry.mvp.ext.BaseLifeCycle

class PresenterMainActivity(
    private val view: ViewMainActivity,
    private val model: ModelMainActivity
) : BaseLifeCycle {

    override fun onCreate() {

        view.initialize()
        initBottomNavigation()

    }

    private fun initBottomNavigation() {
        view.initBottomNav()
    }


}