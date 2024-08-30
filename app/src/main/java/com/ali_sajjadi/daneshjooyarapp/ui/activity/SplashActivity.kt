package com.ali_sajjadi.daneshjooyarapp.ui.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.ali_sajjadi.daneshjooyarapp.databinding.ActivitySplashBinding
import com.ali_sajjadi.daneshjooyarapp.mvp.ext.ActivityUtils
import com.ali_sajjadi.daneshjooyarapp.mvp.model.ModelSplashActivity
import com.ali_sajjadi.daneshjooyarapp.mvp.presenter.PresenterSplashActivity
import com.ali_sajjadi.daneshjooyarapp.mvp.view.ViewSplashActivity

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity(),ActivityUtils {
    private lateinit var view: ViewSplashActivity
    private lateinit var presenter: PresenterSplashActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        view = ViewSplashActivity(this,this)
        super.onCreate(savedInstanceState)
        setContentView(view.binding.root)

        presenter = PresenterSplashActivity(view, ModelSplashActivity())
        presenter.onCreate()



        /*Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        },3000)*/
    }

    override fun finished() {
        finish()
    }

   /* override fun onDestroy() {
        finish()
        super.onDestroy()
    }*/
}