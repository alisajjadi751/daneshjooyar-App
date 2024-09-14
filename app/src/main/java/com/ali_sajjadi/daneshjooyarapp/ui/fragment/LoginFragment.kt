package com.ali_sajjadi.daneshjooyarapp.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ali_sajjadi.daneshjooyarapp.R
import com.ali_sajjadi.daneshjooyarapp.mvp.ext.ActivityUtils
import com.ali_sajjadi.daneshjooyarapp.mvp.model.ModelLoginFragment
import com.ali_sajjadi.daneshjooyarapp.mvp.presenter.PresenterLoginFragment
import com.ali_sajjadi.daneshjooyarapp.mvp.view.ViewLoginFragment

class LoginFragment:Fragment(),ActivityUtils {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = ViewLoginFragment(requireContext(),this)
        val presenter = PresenterLoginFragment(view, ModelLoginFragment())
        presenter.onCreate()
        return view.binding.root

    }

    override fun setFragment(fragment: Fragment) {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.login_frameLayout,fragment)
            .addToBackStack(null)
            .commit()
    }


    override fun back() {
      requireActivity().supportFragmentManager.popBackStack()
    }


}