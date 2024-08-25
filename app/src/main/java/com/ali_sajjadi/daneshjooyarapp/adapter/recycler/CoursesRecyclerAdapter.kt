package com.ali_sajjadi.daneshjooyarapp.adapter.recycler

import DataHome
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.ali_sajjadi.daneshjooyarapp.databinding.ListHomeBinding
import com.ali_sajjadi.daneshjooyarapp.ui.activity.CourseActivity

class CoursesRecyclerAdapter(
    private val context: Context,
    private val data: ArrayList<DataHome>
) : RecyclerView.Adapter<CoursesRecyclerAdapter.CoursesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        CoursesViewHolder(ListHomeBinding.inflate(LayoutInflater.from(context),
            parent,
            false))

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: CoursesViewHolder, position: Int) {
        holder.setData(data[position])
    }

    inner class CoursesViewHolder(
        private val binding: ListHomeBinding
    ) : ViewHolder(binding.root) {

        fun setData(data: DataHome) {

            binding.txtCourse.text = data.title
            binding.imgCourse.setImageResource(data.imageResId)

            binding.root.setOnClickListener {
                val intent = Intent(context, CourseActivity::class.java)
                intent.putParcelableArrayListExtra("videoList", ArrayList(data.videos))
                intent.putParcelableArrayListExtra("infoList", ArrayList(data.info))
                intent.putExtra("demoVideo",data.demoVideo)
                context.startActivity(intent)
            }


        }

    }


}