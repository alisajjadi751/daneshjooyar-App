package com.ali_sajjadi.daneshjooyarapp.mvp.presenter

import com.ali_sajjadi.daneshjooyarapp.mvp.view.ViewHomeFragment
import com.ali_sajjadi.daneshjooyarapp.mvp.model.ModelHomeFragment
import info.alirezaahmadi.frenchpastry.mvp.ext.BaseLifeCycle

class PresenterHomeFragment(
    private val view: ViewHomeFragment,
    private val model: ModelHomeFragment

) : BaseLifeCycle {

    override fun onCreate() {
        view.setTitleRecycler()
    }

}