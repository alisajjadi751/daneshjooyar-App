package com.ali_sajjadi.daneshjooyarapp.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.ali_sajjadi.daneshjooyarapp.R
import com.ali_sajjadi.daneshjooyarapp.mvp.ext.ActivityUtils
import com.ali_sajjadi.daneshjooyarapp.ui.fragment.LoginFragment

class LoginActivity : AppCompatActivity(),ActivityUtils {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)
        supportFragmentManager.beginTransaction()
            .replace(R.id.login_frameLayout,LoginFragment() )
            .commit()
    }

    override fun finished() {
        finish()
    }

    override fun setFragment(fragment: Fragment) {
        setContentView(R.layout.activity_login)
        supportFragmentManager.beginTransaction()
            .replace(R.id.login_frameLayout,fragment )
            .commit()
    }

   /* override fun finishedAffinity(fragment: Fragment) {

        finishAffinity()
    }*/
}