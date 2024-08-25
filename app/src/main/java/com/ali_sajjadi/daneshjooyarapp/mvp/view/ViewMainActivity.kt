package com.ali_sajjadi.daneshjooyarapp.mvp.view

import android.content.Context
import android.view.LayoutInflater
import com.ali_sajjadi.daneshjooyarapp.databinding.ActivityMainBinding
import com.ali_sajjadi.daneshjooyarapp.mvp.ext.ActivityUtils
import com.ali_sajjadi.daneshjooyarapp.ui.customView.navigation.ActivityFragment
import com.ali_sajjadi.daneshjooyarapp.ui.customView.navigation.FragmentType
import com.ali_sajjadi.daneshjooyarapp.ui.fragment.AboutFragment
import com.ali_sajjadi.daneshjooyarapp.ui.fragment.CertificateFragment
import com.ali_sajjadi.daneshjooyarapp.ui.fragment.HomeFragment

class ViewMainActivity(
    private val context: Context,
    private val activityUtils: ActivityUtils
) :ActivityFragment {




    val binding = ActivityMainBinding.inflate(LayoutInflater.from(context))


    fun initialize(){

        activityUtils.setFragment(HomeFragment.newInstance(activityUtils))
    }



    fun initBottomNav() {
        binding.customBottomNavigation.onclickHelper(this)
    }

    override fun setFragment(type: FragmentType) {
        val fragment = when (type) {
            FragmentType.HOME -> HomeFragment.newInstance(activityUtils)
            FragmentType.ABOUT -> AboutFragment()
            FragmentType.CERTIFICATE -> CertificateFragment()

        }
        activityUtils.setFragment(fragment)
    }


}