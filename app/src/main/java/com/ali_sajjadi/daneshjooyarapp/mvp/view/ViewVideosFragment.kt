/*
package com.ali_sajjadi.daneshjooyarapp.mvp.view

import DataVideo
import android.content.Context
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ali_sajjadi.daneshjooyarapp.adapter.recycler.CourseVideosRecyclerAdapter

import com.ali_sajjadi.daneshjooyarapp.databinding.FragmentVideosBinding


class ViewVideosFragment(
    private val context: Context
) {

    val binding = FragmentVideosBinding.inflate(LayoutInflater.from(context))


    private val fragment = Fragment()


    private val dataList: ArrayList<DataVideo>? =
        fragment.arguments?.getParcelableArrayList("dataList")


    fun setCourseRecycler() {
        binding.recyclerVideos.layoutManager =
            LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        binding.recyclerVideos.adapter = CourseVideosRecyclerAdapter(context, dataList!!)

    }

}
*/
