package com.ali_sajjadi.daneshjooyarapp.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.ali_sajjadi.daneshjooyarapp.R
import com.ali_sajjadi.daneshjooyarapp.mvp.ext.ActivityUtils
import com.ali_sajjadi.daneshjooyarapp.mvp.model.ModelMainActivity
import com.ali_sajjadi.daneshjooyarapp.mvp.presenter.PresenterMainActivity
import com.ali_sajjadi.daneshjooyarapp.mvp.view.ViewMainActivity
import com.ali_sajjadi.daneshjooyarapp.ui.fragment.HomeFragment

class MainActivity : AppCompatActivity(), ActivityUtils {

    private lateinit var presenter: PresenterMainActivity
    private lateinit var view: ViewMainActivity


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        view = ViewMainActivity(this,this)
        val model = ModelMainActivity()
        setContentView(view.binding.root)
        presenter = PresenterMainActivity(view, model)
        presenter.onCreate()


    }



    override fun setFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.mainframeLayout, fragment)
            .commit()
    }



}
