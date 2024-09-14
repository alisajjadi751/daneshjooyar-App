package com.ali_sajjadi.daneshjooyarapp.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ali_sajjadi.daneshjooyarapp.R
import com.ali_sajjadi.daneshjooyarapp.mvp.ext.ActivityUtils
import com.ali_sajjadi.daneshjooyarapp.mvp.model.ModelLoginPassFragment
import com.ali_sajjadi.daneshjooyarapp.mvp.presenter.PresenterLoginPassFragment
import com.ali_sajjadi.daneshjooyarapp.mvp.view.ViewLoginPassFragment

class LoginPassFragment:Fragment(),ActivityUtils {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = ViewLoginPassFragment(requireContext(),this ,this)
        val presenter = PresenterLoginPassFragment(view, ModelLoginPassFragment(requireContext()))
        presenter.onCreate()
        return view.binding.root
    }

    override fun back() {
        requireActivity().supportFragmentManager.popBackStack()
    }

    override fun setFragment(fragment: Fragment) {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.login_frameLayout,fragment)
            .commit()
    }

     override fun finishedAffinity(fragment: Fragment) {
        // استفاده از finishAffinity() برای اطمینان از اینکه کاربر نمی‌تواند بازگردد
        requireActivity().finishAffinity()
    }
}