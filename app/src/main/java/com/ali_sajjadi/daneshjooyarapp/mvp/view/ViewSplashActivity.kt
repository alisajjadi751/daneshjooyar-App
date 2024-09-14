package com.ali_sajjadi.daneshjooyarapp.mvp.view

import android.content.Context
import android.content.Intent
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import com.ali_sajjadi.daneshjooyarapp.databinding.ActivitySplashBinding
import com.ali_sajjadi.daneshjooyarapp.ui.activity.LoginActivity
import com.ali_sajjadi.daneshjooyarapp.ui.activity.MainActivity
import com.google.android.material.bottomsheet.BottomSheetDialog
import android.provider.Settings
import com.ali_sajjadi.daneshjooyarapp.databinding.BottomSheetDialogBinding
import com.ali_sajjadi.daneshjooyarapp.mvp.ext.ActivityUtils

class ViewSplashActivity(
    private val mContext: Context,
    private val activityUtils: ActivityUtils) {

    val binding = ActivitySplashBinding.inflate(LayoutInflater.from(mContext))
    fun navigateToMainActivity() {

        val intent = Intent(mContext, MainActivity::class.java)
        mContext.startActivity(intent)
        activityUtils.finished()
    }
    fun navigateToLoginActivity() {

        val intent = Intent(mContext, LoginActivity::class.java)
        mContext.startActivity(intent)
        activityUtils.finished()
    }
    fun showNetworkSettingsDialog() {
        val view = BottomSheetDialogBinding.inflate(LayoutInflater.from(mContext))
        val dialog = BottomSheetDialog(mContext)
        dialog.setCancelable(false)
        dialog.setContentView(view.root)
        dialog.show()

        view.btnWifi.setOnClickListener {
            val settingWifi = Intent(Settings.ACTION_WIFI_SETTINGS)
            mContext.startActivity(settingWifi)
        }

        view.btnNet.setOnClickListener {
            val settingNet = Intent(Settings.ACTION_DATA_ROAMING_SETTINGS)
            mContext.startActivity(settingNet)
        }
    }
}
