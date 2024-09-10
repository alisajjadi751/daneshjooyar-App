package com.ali_sajjadi.daneshjooyarapp.mvp.presenter

import com.ali_sajjadi.daneshjooyarapp.mvp.model.ModelLoginPassFragment
import com.ali_sajjadi.daneshjooyarapp.mvp.view.ViewLoginPassFragment
import info.alirezaahmadi.frenchpastry.mvp.ext.BaseLifeCycle

class PresenterLoginPassFragment(
    private val view:ViewLoginPassFragment,
    private val model:ModelLoginPassFragment
):BaseLifeCycle {
    override fun onCreate() {
        view.getNumber()
        view.editNumber()
    }
}