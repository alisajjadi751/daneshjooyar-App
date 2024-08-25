package com.ali_sajjadi.daneshjooyarapp.ui.fragment

import DataInfo
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ali_sajjadi.daneshjooyarapp.adapter.recycler.InfoRecyclerAdapter
import com.ali_sajjadi.daneshjooyarapp.databinding.FragmentInfoBinding

class InfoFragment : Fragment() {

    private var dataList: ArrayList<DataInfo>? = null
    private lateinit var binding: FragmentInfoBinding

    companion object {
        fun newInstance(dataList: ArrayList<DataInfo>): InfoFragment {
            val fragment = InfoFragment()
            val args = Bundle()
            args.putParcelableArrayList("infoList", dataList)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentInfoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataList = arguments?.getParcelableArrayList("infoList")

        binding.recyclerInfo.layoutManager =
            LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        binding.recyclerInfo.adapter = dataList?.let {
            InfoRecyclerAdapter(requireContext(), it)
        }
    }
}
