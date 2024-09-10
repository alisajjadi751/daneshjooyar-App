package com.ali_sajjadi.daneshjooyarapp.mvp.presenter

import com.ali_sajjadi.daneshjooyarapp.mvp.model.ModelLoginFragment
import com.ali_sajjadi.daneshjooyarapp.mvp.view.ViewLoginFragment
import com.ali_sajjadi.daneshjooyarapp.ui.fragment.LoginPassFragment
import info.alirezaahmadi.frenchpastry.mvp.ext.BaseLifeCycle

class PresenterLoginFragment(
    private val view:ViewLoginFragment,
    private val model: ModelLoginFragment
):BaseLifeCycle {



    override fun onCreate() {

       // view.errorNumber()
        view.login()
        view.ghavanin()
        view.sendCode(LoginPassFragment())



    }

}