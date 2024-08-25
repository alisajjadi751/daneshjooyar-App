package com.ali_sajjadi.daneshjooyarapp.ui.fragment

import ModelListCoursesFragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

import com.ali_sajjadi.daneshjooyarapp.mvp.presenter.PresenterListCoursesFragment
import com.ali_sajjadi.daneshjooyarapp.mvp.view.ViewListCoursesFragment


class ListCoursesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = ViewListCoursesFragment(requireContext())
        val model = ModelListCoursesFragment(this)
        val presenter = PresenterListCoursesFragment(view,model)
        presenter.onCreate()

        return view.binding.root

    }
}
