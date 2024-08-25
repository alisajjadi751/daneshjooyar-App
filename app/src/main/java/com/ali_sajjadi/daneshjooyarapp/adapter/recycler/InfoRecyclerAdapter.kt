package com.ali_sajjadi.daneshjooyarapp.adapter.recycler

import DataInfo
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.ali_sajjadi.daneshjooyarapp.R
import com.ali_sajjadi.daneshjooyarapp.databinding.CustomItemAboutBinding
import com.ali_sajjadi.daneshjooyarapp.databinding.ListItemInfoBinding

class InfoRecyclerAdapter(
    private val context: Context,
    private val dataInfo: List<DataInfo>
) : RecyclerView.Adapter<InfoRecyclerAdapter.InfoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        InfoViewHolder(ListItemInfoBinding.inflate(LayoutInflater.from(context), parent, false))

    override fun getItemCount() = dataInfo.size

    override fun onBindViewHolder(holder: InfoViewHolder, position: Int) {
        holder.setData(dataInfo[position])
    }

    inner class InfoViewHolder(
        val binding: ListItemInfoBinding
    ) : ViewHolder(binding.root) {

        fun setData(data: DataInfo) {

            binding.imgWho.setImageResource(data.img)
            binding.txtTitli11.text = data.title11
            binding.txtTitli12.text = data.title12
            binding.txtTitle21.text = data.title21
            binding.txtTitle22.text = data.title22
            binding.txtTitle31.text = data.title31
            binding.txtTitle32.text = data.title32
            binding.txtTitle41.text = data.title41
            binding.txtTitle42.text = data.title42

        }


    }


}