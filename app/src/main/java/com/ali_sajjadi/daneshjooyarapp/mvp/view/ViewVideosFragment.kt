package com.ali_sajjadi.daneshjooyarapp.mvp.view


import DataListVideo
import android.content.Context
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ali_sajjadi.daneshjooyarapp.adapter.recycler.CourseVideosRecyclerAdapter
import com.ali_sajjadi.daneshjooyarapp.databinding.FragmentVideosBinding


class ViewVideosFragment(
    private val context: Context
) {

    val binding = FragmentVideosBinding.inflate(LayoutInflater.from(context))


    fun setCourseRecycler(dataList: ArrayList<DataListVideo>) {
        binding.recyclerVideos.layoutManager =
            LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        binding.recyclerVideos.adapter = CourseVideosRecyclerAdapter(context, dataList)

    }

}
