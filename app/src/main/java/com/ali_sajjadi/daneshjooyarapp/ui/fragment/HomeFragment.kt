package com.ali_sajjadi.daneshjooyarapp.ui.fragment

import com.ali_sajjadi.daneshjooyarapp.mvp.view.ViewHomeFragment
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ali_sajjadi.daneshjooyarapp.mvp.ext.ActivityUtils
import com.ali_sajjadi.daneshjooyarapp.mvp.model.ModelHomeFragment
import com.ali_sajjadi.daneshjooyarapp.mvp.presenter.PresenterHomeFragment


class HomeFragment : Fragment() {
    private lateinit var activityUtils: ActivityUtils

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = ViewHomeFragment(requireContext())
        val presenter = PresenterHomeFragment(view, ModelHomeFragment())
        presenter.onCreate()
        return view.binding.root
    }

    companion object {
        fun newInstance(activityUtils: ActivityUtils): HomeFragment {
            val fragment = HomeFragment()
            fragment.activityUtils = activityUtils
            return fragment
        }
    }

}
