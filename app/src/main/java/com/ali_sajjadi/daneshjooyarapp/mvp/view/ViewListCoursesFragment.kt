package com.ali_sajjadi.daneshjooyarapp.mvp.view

import DataHome
import android.content.Context
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ali_sajjadi.daneshjooyarapp.adapter.recycler.CoursesRecyclerAdapter
import com.ali_sajjadi.daneshjooyarapp.databinding.FragmentListCoursesBinding

class ViewListCoursesFragment(
    private val mContext: Context
) {


 val binding = FragmentListCoursesBinding.inflate(LayoutInflater.from(mContext))

    fun setRecyclerCourse(dataList:ArrayList<DataHome>){

        binding.coursesRecycler.layoutManager =
            LinearLayoutManager(mContext, RecyclerView.VERTICAL,false)
        binding.coursesRecycler.adapter = CoursesRecyclerAdapter(mContext,dataList)
    }
}
