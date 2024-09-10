package com.ali_sajjadi.daneshjooyarapp.mvp.view

import android.content.Context
import android.content.Context.CONNECTIVITY_SERVICE
import android.content.Intent
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Handler
import android.os.Looper
import android.provider.Settings
import android.view.LayoutInflater
import com.ali_sajjadi.daneshjooyarapp.databinding.ActivitySplashBinding
import com.ali_sajjadi.daneshjooyarapp.databinding.BottomSheetDialogBinding
import com.ali_sajjadi.daneshjooyarapp.mvp.ext.ActivityUtils
import com.ali_sajjadi.daneshjooyarapp.ui.activity.LoginActivity
import com.google.android.material.bottomsheet.BottomSheetDialog

class ViewSplashActivity(
    private val mContext: Context,
    private val activityUtils: ActivityUtils
) {
    val binding = ActivitySplashBinding.inflate(LayoutInflater.from(mContext))

    fun startMainActivity() {
        if (isNetworkState())

           handler()

        else {

            val view = BottomSheetDialogBinding.inflate(LayoutInflater.from(mContext))
            val dialog = BottomSheetDialog(mContext)
            dialog.setCancelable(false)
            dialog.setContentView(view.root)
            dialog.show()
            view.btnWifi.setOnClickListener {
                val settingWifi = Intent(Settings.ACTION_WIFI_SETTINGS)
                mContext.startActivity(settingWifi)
                if (isNetworkState())
                    handler()

            }
            view.btnNet.setOnClickListener {
                val settingNet = Intent(Settings.ACTION_DATA_ROAMING_SETTINGS)
                mContext.startActivity(settingNet)
                if (isNetworkState())
                    handler()

            }

        }
    }


    private fun isNetworkState(): Boolean {

        val result: Boolean

        val connectivityManager =
            mContext.getSystemService(CONNECTIVITY_SERVICE) as ConnectivityManager

        val networkCapabilities = connectivityManager.activeNetwork
        val actnw =
            connectivityManager.getNetworkCapabilities(networkCapabilities) ?: return false
        result = when {
            actnw.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
            actnw.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
            actnw.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> true
            else -> false
        }

        return result


    }

    private fun handler(){
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(mContext, LoginActivity::class.java)
            mContext.startActivity(intent)
            activityUtils.finished()
        }, 3000)
    }


}