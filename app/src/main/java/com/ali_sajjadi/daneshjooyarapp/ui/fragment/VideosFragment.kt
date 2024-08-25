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


class VideosFragment(
    private val context: Context
) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding = FragmentVideosBinding.inflate(LayoutInflater.from(context))
        val dataList: ArrayList<DataListVideo>? = arguments?.getParcelableArrayList("videoList")


            binding.recyclerVideos.layoutManager =
                LinearLayoutManager(context, RecyclerView.VERTICAL, false)
            binding.recyclerVideos.adapter = CourseVideosRecyclerAdapter(context, dataList!!)




        return binding.root

        /*val view = ViewVideosFragment(context)
        val model = ModelVideosFragment(context)
        val presenter = PresenterVideosFragment(view,model)
        presenter.onCreate()
        return view.binding.root*/
    }

}