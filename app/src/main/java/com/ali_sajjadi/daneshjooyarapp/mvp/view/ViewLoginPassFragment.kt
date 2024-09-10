package com.ali_sajjadi.daneshjooyarapp.mvp.view

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import com.ali_sajjadi.daneshjooyarapp.databinding.FragmentLoginPassBinding
import com.ali_sajjadi.daneshjooyarapp.mvp.ext.ActivityUtils

class ViewLoginPassFragment(
    mContext: Context,
    private val fragment: Fragment,
    private val activityUtils: ActivityUtils,
) {
    val binding = FragmentLoginPassBinding.inflate(LayoutInflater.from(mContext))

    @SuppressLint("SetTextI18n")
    fun getNumber() {

        val number = fragment.arguments?.getString("NUMBER")
        binding.txtMobile.text = "کد تایید برای شماره موبایل $number ارسال شد."
    }

    fun editNumber(){
        binding.edtMobile.setOnClickListener {
            activityUtils.finished()
        }
    }


}