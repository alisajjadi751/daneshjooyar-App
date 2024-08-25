package com.ali_sajjadi.daneshjooyarapp.mvp.view

import DataDemoVideo
import DataInfo
import DataListVideo
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.MediaController
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.widget.ViewPager2
import com.ali_sajjadi.daneshjooyarapp.adapter.viewPager.CoursePager
import com.ali_sajjadi.daneshjooyarapp.databinding.ActivityCourseBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class ViewCourseActivity(
    private val context: Context,
    private val fragmentManager: FragmentManager,
    private val lifecycle: Lifecycle
) {
    val binding = ActivityCourseBinding.inflate(LayoutInflater.from(context))

    private var viewPager: ViewPager2
    private var tabLayout: TabLayout

    init {
        viewPager = binding.viewPager
        tabLayout = binding.tableLayout2
    }




    fun setupTabLayout(videoList:ArrayList<DataListVideo>?,infoList:ArrayList<DataInfo>?) {
        val tableTitle = arrayOf("ویدیو ها", "اطلاعات")

        binding.viewPager.adapter =
            CoursePager(context, tableTitle.size, fragmentManager, lifecycle, videoList, infoList)

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = tableTitle[position]
        }.attach()
    }

    fun initVideoView(demoVideo: DataDemoVideo?) {
        val videoUri = demoVideo?.demoVideo
        val controller = MediaController(context)
        controller.setAnchorView(binding.videoView)



           binding. playButton2?.setOnClickListener {
                binding.videoView.start()
               binding. playButton2.visibility = View.GONE // مخفی کردن آیکون پخش
            }


        try {
            binding.videoView.setMediaController(controller)
            binding.videoView.setVideoURI(videoUri)
            binding.videoView.requestFocus()


        } catch (e: Exception) {
            Toast.makeText(context, e.message, Toast.LENGTH_SHORT).show()
        }

        binding.videoView.setOnPreparedListener {
            it.setOnVideoSizeChangedListener { _, _, _ ->
                controller.setAnchorView(binding.videoView)
            }
        }

        binding.videoView.setOnCompletionListener {
            binding.playButton2?.visibility = View.VISIBLE // نمایش دوباره آیکون پخش پس از پایان ویدیو
        }


    }

    fun getVideoCurrentPosition(): Int {
        return if (binding.videoView.isPlaying) binding.videoView.currentPosition else 0
    }

    fun seekToVideo(position: Int) {
        binding.videoView.setOnPreparedListener {
            it.seekTo(position)
            binding.videoView.start()
        }
    }
}
