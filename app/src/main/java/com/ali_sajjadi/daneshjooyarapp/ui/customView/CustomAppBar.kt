package com.ali_sajjadi.daneshjooyarapp.ui.customView

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.Toast
import com.ali_sajjadi.daneshjooyarapp.R
import com.ali_sajjadi.daneshjooyarapp.databinding.CustomAppBarBinding

class CustomAppBar(
    context: Context,
    attrs: AttributeSet
) : FrameLayout(context, attrs) {

    private val binding = CustomAppBarBinding.inflate(LayoutInflater.from(context))


    init {
        addView(binding.root)
        binding.icTicket.setOnClickListener {

        }
    }



}