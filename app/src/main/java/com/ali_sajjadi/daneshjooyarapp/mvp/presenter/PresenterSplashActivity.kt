package com.ali_sajjadi.daneshjooyarapp.mvp.presenter

import android.os.Handler
import android.os.Looper
import com.ali_sajjadi.daneshjooyarapp.mvp.model.ModelSplashActivity
import com.ali_sajjadi.daneshjooyarapp.mvp.view.ViewSplashActivity
import info.alirezaahmadi.frenchpastry.mvp.ext.BaseLifeCycle

class PresenterSplashActivity(
    private val view: ViewSplashActivity,
    private val model: ModelSplashActivity
) : BaseLifeCycle {

    private val handler = Handler(Looper.getMainLooper())
    override fun onCreate() {
        handler.postDelayed({
            checkUserLogin()
        },3000)

    }
   private fun checkUserLogin(){
        val isLoggedIn = model.isUserLoggedIn()


        val isNetworkAvailable = model.isNetworkAvailable()

        if (isNetworkAvailable) {
            if (isLoggedIn) {

                view.navigateToMainActivity()
            } else {

                view.navigateToLoginActivity()
            }
        } else {

            view.showNetworkSettingsDialog()
        }
    }

    fun saveLoginState(isLoggedIn: Boolean) {
        model.saveLoginState(isLoggedIn)
    }

    override fun onResume() {
        if (!model.isNetworkAvailable()) {
            view.showNetworkSettingsDialog()
        }
    }
}
