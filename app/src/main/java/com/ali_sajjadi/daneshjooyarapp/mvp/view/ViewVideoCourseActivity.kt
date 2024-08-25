package com.ali_sajjadi.daneshjooyarapp.mvp.view

import DataCourseVideo
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.MediaController
import android.widget.Toast
import com.ali_sajjadi.daneshjooyarapp.databinding.ActivityVideoCourseBinding

class ViewVideoCourseActivity(
    private val mContext: Context
) {

    val binding = ActivityVideoCourseBinding.inflate(LayoutInflater.from(mContext))

    fun initTitle(title: String?) {

        binding.txtTitleVideo.text = title
    }

    fun initVideoView(courseVideo: DataCourseVideo?) {
        val videoUri = courseVideo?.courseVideo
        val controller = MediaController(mContext)
        controller.setAnchorView(binding.courseVideo)

        binding.playButton.let { playButton ->
            playButton.setOnClickListener {
                binding.courseVideo.start()
                playButton.visibility = View.GONE // مخفی کردن آیکون پخش
            }
        }

        try {
            binding.courseVideo.setMediaController(controller)
            binding.courseVideo.setVideoURI(videoUri)
            binding.courseVideo.requestFocus()

        } catch (e: Exception) {
            Toast.makeText(mContext, e.message, Toast.LENGTH_SHORT).show()
        }

        binding.courseVideo.setOnPreparedListener {
            it.setOnVideoSizeChangedListener { _, _, _ ->
                controller.setAnchorView(binding.courseVideo)
            }
        }

        binding.courseVideo.setOnCompletionListener {
            binding.playButton.visibility = View.VISIBLE // نمایش دوباره آیکون پخش پس از پایان ویدیو
        }

    }
}