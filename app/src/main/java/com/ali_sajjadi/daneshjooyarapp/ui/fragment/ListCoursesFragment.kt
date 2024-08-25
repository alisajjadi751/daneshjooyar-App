package com.ali_sajjadi.daneshjooyarapp.ui.fragment

import DataHome
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ali_sajjadi.daneshjooyarapp.R
import com.ali_sajjadi.daneshjooyarapp.adapter.recycler.CoursesRecyclerAdapter
import com.ali_sajjadi.daneshjooyarapp.databinding.FragmentListCoursesBinding
import com.ali_sajjadi.daneshjooyarapp.ui.activity.CourseActivity


class ListCoursesFragment : Fragment() {

    private var dataList: ArrayList<DataHome>? = null
    private lateinit var binding: FragmentListCoursesBinding

    companion object {
        fun newInstance(dataList: ArrayList<DataHome>): ListCoursesFragment {
            val fragment = ListCoursesFragment()
            val args = Bundle()
            args.putParcelableArrayList("dataList", dataList)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentListCoursesBinding.inflate(inflater, container, false)
        dataList = arguments?.getParcelableArrayList("dataList")

        setupRecyclerView()

        return binding.root
    }

    private fun setupRecyclerView() {
        binding.coursesRecycler.layoutManager =
            LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
        binding.coursesRecycler.adapter = CoursesRecyclerAdapter(requireContext(), dataList!!)
    }
}
