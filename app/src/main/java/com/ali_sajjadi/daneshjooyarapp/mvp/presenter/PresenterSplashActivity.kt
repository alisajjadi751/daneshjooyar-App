package com.ali_sajjadi.daneshjooyarapp.mvp.presenter

import com.ali_sajjadi.daneshjooyarapp.mvp.model.ModelSplashActivity
import com.ali_sajjadi.daneshjooyarapp.mvp.view.ViewSplashActivity
import info.alirezaahmadi.frenchpastry.mvp.ext.BaseLifeCycle

class PresenterSplashActivity(
    private val view:ViewSplashActivity,
    private val model: ModelSplashActivity
):BaseLifeCycle {

    override fun onCreate() {
        view.startMainActivity()
    }

}