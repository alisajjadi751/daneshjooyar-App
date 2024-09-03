package com.ali_sajjadi.daneshjooyarapp.mvp.presenter

import com.ali_sajjadi.daneshjooyarapp.mvp.model.ModelRulesFragment
import com.ali_sajjadi.daneshjooyarapp.mvp.view.ViewRulesFragment
import info.alirezaahmadi.frenchpastry.mvp.ext.BaseLifeCycle

class PresenterRulesFragment(
    private val view: ViewRulesFragment,
    private val model: ModelRulesFragment
):BaseLifeCycle {

    override fun onCreate() {
        view.back()
    }

}