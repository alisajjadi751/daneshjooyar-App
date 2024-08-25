package com.ali_sajjadi.daneshjooyarapp.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ali_sajjadi.daneshjooyarapp.mvp.model.ModelVideoCourseFragment
import com.ali_sajjadi.daneshjooyarapp.mvp.presenter.PresenterVideoCourseFragment
import com.ali_sajjadi.daneshjooyarapp.mvp.view.ViewVideoCourseFragment

class VideoCourseFragment:Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = ViewVideoCourseFragment(requireContext())
        val model = ModelVideoCourseFragment()
        val presenter = PresenterVideoCourseFragment(view,model)
        presenter.onCreate()
        return view.binding.root
    }

}