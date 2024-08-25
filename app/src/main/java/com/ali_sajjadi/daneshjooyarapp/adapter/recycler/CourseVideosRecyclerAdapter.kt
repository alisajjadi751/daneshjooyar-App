package com.ali_sajjadi.daneshjooyarapp.adapter.recycler

import DataListVideo
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.ali_sajjadi.daneshjooyarapp.databinding.ListItemVideoBinding
import com.ali_sajjadi.daneshjooyarapp.ui.activity.VideoCourseActivity

class CourseVideosRecyclerAdapter(
    private val context: Context,
    private val dataCourse: List<DataListVideo>
):RecyclerView.Adapter<CourseVideosRecyclerAdapter.CourseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        CourseViewHolder(ListItemVideoBinding.inflate(LayoutInflater.from(context),
            parent,
            false))

    override fun getItemCount() = dataCourse.size

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        holder.setData(dataCourse[position])
    }

    inner class CourseViewHolder(
        private val binding: ListItemVideoBinding
    ):ViewHolder(binding.root){

        fun setData(data:DataListVideo){


            binding.txtTitleCourse.text = data.title
            binding.imgCourse.setImageResource(data.img)

            binding.root.setOnClickListener {


                val intent = Intent(context,VideoCourseActivity::class.java)
                intent.putExtra("video", data.video)
                intent.putExtra("title", data.title)
                context.startActivity(intent)
            }



        }

    }



}