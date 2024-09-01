package com.ali_sajjadi.daneshjooyarapp.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ali_sajjadi.daneshjooyarapp.R
import com.ali_sajjadi.daneshjooyarapp.ui.fragment.LoginFragment

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportFragmentManager.beginTransaction()
            .replace(R.id.login_frameLayout,LoginFragment() )
            .commit()
    }

}