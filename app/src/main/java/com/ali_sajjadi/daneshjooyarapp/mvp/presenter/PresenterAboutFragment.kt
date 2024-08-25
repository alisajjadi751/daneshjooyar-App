package com.ali_sajjadi.daneshjooyarapp.mvp.presenter

import com.ali_sajjadi.daneshjooyarapp.mvp.model.ModelAboutFragment
import com.ali_sajjadi.daneshjooyarapp.mvp.view.ViewAboutFragment
import info.alirezaahmadi.frenchpastry.mvp.ext.BaseLifeCycle

class PresenterAboutFragment(
    private val view : ViewAboutFragment,
    private val model: ModelAboutFragment
): BaseLifeCycle {

    override fun onCreate() {

    }

}