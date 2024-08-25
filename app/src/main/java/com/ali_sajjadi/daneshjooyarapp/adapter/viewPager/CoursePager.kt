package com.ali_sajjadi.daneshjooyarapp.adapter.viewPager

import DataInfo
import DataListVideo
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.ali_sajjadi.daneshjooyarapp.ui.fragment.InfoFragment
import com.ali_sajjadi.daneshjooyarapp.ui.fragment.VideosFragment

class CoursePager(
    private val context: Context,
    private val size: Int,
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle,
    private val videoList: ArrayList<DataListVideo>?,
    private val infoList: ArrayList<DataInfo>?
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount() = size

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                val videosFragment = VideosFragment()
                videosFragment.arguments = Bundle().apply {
                    putParcelableArrayList("videoList", videoList)
                }
                videosFragment
            }

            1 -> {
                val infoFragment = InfoFragment.newInstance(infoList ?: arrayListOf())
                infoFragment.arguments = Bundle().apply {
                    putParcelableArrayList("infoList", infoList)
                }
                infoFragment
            }

            else -> VideosFragment()
        }

    }
}

