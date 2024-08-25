package com.ali_sajjadi.daneshjooyarapp.ui.customView

import android.content.Context
import android.graphics.LinearGradient
import android.graphics.Shader
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import androidx.core.content.ContextCompat
import com.ali_sajjadi.daneshjooyarapp.R
import com.ali_sajjadi.daneshjooyarapp.databinding.CustomItemAboutBinding

class CustomItemAbout(
    context: Context,
    attrs: AttributeSet
) : FrameLayout(context, attrs) {

    private val binding = CustomItemAboutBinding.inflate(LayoutInflater.from(context))
    private val textView = binding.txtTitle12

    init {
        addView(binding.root)
        applyGradientToText()
        initialize(attrs)
    }

    private fun initialize(attrs: AttributeSet) {
        val typeArray = context.obtainStyledAttributes(attrs, R.styleable.CustomItemAbout)

        val text = typeArray.getString(R.styleable.CustomItemAbout_text)
        val text2 = typeArray.getString(R.styleable.CustomItemAbout_text2)
        val src = typeArray.getResourceId(R.styleable.CustomItemAbout_srcCompat,0)

        binding.txtTitle11.text = text
        binding.txtTitle12.text = text2
        binding.imageView15.setImageResource(src)

        typeArray.recycle()
    }

    private fun applyGradientToText() {
        val startColor = ContextCompat.getColor(context, R.color.blue)
        val endColor = ContextCompat.getColor(context, R.color.blue2)
        val textPaint = binding.txtTitle12.paint

        // اطمینان از اینکه رنگ تیره در ابتدا قرار دارد
        val colors = intArrayOf(startColor, endColor)

        // تنظیم جهت گرادیان از چپ به راست
        //val textWidth = binding.textView2.width.toFloat()
        val gradient =
            LinearGradient(0f, 0f, textView.textSize, 0f, colors, null, Shader.TileMode.CLAMP)

        textPaint.shader = gradient
    }
}
