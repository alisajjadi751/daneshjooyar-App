package com.ali_sajjadi.daneshjooyarapp.mvp.view

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import com.ali_sajjadi.daneshjooyarapp.databinding.FragmentRulesBinding
import com.ali_sajjadi.daneshjooyarapp.mvp.ext.ActivityUtils

class ViewRulesFragment(
    private val mContext: Context,
    private val activityUtils: ActivityUtils
){

    val binding = FragmentRulesBinding.inflate(LayoutInflater.from(mContext))

    fun back(){
        binding.icBack.setOnClickListener {
            activityUtils.back()

        }
    }


}