package com.ali_sajjadi.daneshjooyarapp.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ali_sajjadi.daneshjooyarapp.mvp.model.ModelAboutFragment
import com.ali_sajjadi.daneshjooyarapp.mvp.presenter.PresenterAboutFragment
import com.ali_sajjadi.daneshjooyarapp.mvp.view.ViewAboutFragment

class AboutFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = ViewAboutFragment(requireContext())
        val presenter = PresenterAboutFragment(view, ModelAboutFragment())
        presenter.onCreate()
        return view.binding.root


    }
}