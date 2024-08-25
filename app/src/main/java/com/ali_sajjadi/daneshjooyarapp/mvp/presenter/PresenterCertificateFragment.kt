package com.ali_sajjadi.daneshjooyarapp.mvp.presenter

import com.ali_sajjadi.daneshjooyarapp.mvp.model.ModelCertificateFragment
import com.ali_sajjadi.daneshjooyarapp.mvp.view.ViewCertificateFragment
import info.alirezaahmadi.frenchpastry.mvp.ext.BaseLifeCycle

class PresenterCertificateFragment(
    private val view: ViewCertificateFragment,
    private val model: ModelCertificateFragment
):BaseLifeCycle {
    override fun onCreate() {

    }
}