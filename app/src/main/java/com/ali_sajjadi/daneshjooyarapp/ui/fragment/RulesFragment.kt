package com.ali_sajjadi.daneshjooyarapp.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ali_sajjadi.daneshjooyarapp.mvp.ext.ActivityUtils
import com.ali_sajjadi.daneshjooyarapp.mvp.model.ModelRulesFragment
import com.ali_sajjadi.daneshjooyarapp.mvp.presenter.PresenterRulesFragment
import com.ali_sajjadi.daneshjooyarapp.mvp.view.ViewRulesFragment

class RulesFragment:Fragment(),ActivityUtils
{

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = ViewRulesFragment(requireContext(),this)
        val presenter = PresenterRulesFragment(view, ModelRulesFragment())
        presenter.onCreate()
        return view.binding.root
    }

    override fun finished() {
       requireActivity().supportFragmentManager.popBackStack()
    }

}