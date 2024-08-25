package com.ali_sajjadi.daneshjooyarapp.ui.fragment

import DataListVideo
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ali_sajjadi.daneshjooyarapp.adapter.recycler.CourseVideosRecyclerAdapter
import com.ali_sajjadi.daneshjooyarapp.databinding.FragmentVideosBinding
import com.ali_sajjadi.daneshjooyarapp.mvp.model.ModelVideosFragment
import com.ali_sajjadi.daneshjooyarapp.mvp.presenter.PresenterVideosFragment
import com.ali_sajjadi.daneshjooyarapp.mvp.view.ViewVideosFragment


class VideosFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = ViewVideosFragment(requireContext())
        val model = ModelVideosFragment(this)
        val presenter = PresenterVideosFragment(view,model)
        presenter.onCreate()
        return view.binding.root
    }

}