package com.ali_sajjadi.daneshjooyarapp.ui.customView

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.ali_sajjadi.daneshjooyarapp.R
import com.ali_sajjadi.daneshjooyarapp.databinding.CustomEditTextBinding

class CustomEditText(
    context: Context,
    attributeSet: AttributeSet
) : FrameLayout(context, attributeSet) {

    private val binding = CustomEditTextBinding.inflate(LayoutInflater.from(context))

    init {
        addView(binding.root)
    }


    private fun initialize(attrs: AttributeSet) {

        val typeArray = context.obtainStyledAttributes(attrs, R.styleable.CustomEditText)

        val type = typeArray.getInteger(R.styleable.CustomEditText_type, 1)
        val rtlSupport = typeArray.getBoolean(R.styleable.CustomEditText_rtlSupport, false)
        val maxLength = typeArray.getInteger(R.styleable.CustomEditText_max, 0)
        val hint = typeArray.getString(R.styleable.CustomEditText_hint)



    }

}