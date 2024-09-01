package com.ali_sajjadi.daneshjooyarapp.mvp.view

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.ali_sajjadi.daneshjooyarapp.R
import com.ali_sajjadi.daneshjooyarapp.databinding.FragmentLoginBinding

class ViewLoginFragment(
    private val mContext: Context
) {

    val binding = FragmentLoginBinding.inflate(LayoutInflater.from(mContext))

    fun login() {


        binding.txtEditMobil.addTextChangedListener(object : TextWatcher {

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                val number = binding.txtEditMobil.text.toString()
                binding.textInputLayout.hint = null
                binding.txtMobil.visibility = View.VISIBLE

                if (s?.length == 11 &&number.matches(Regex("(\\+98|0)?9\\d{9}")) ) {
                    binding.btnSendCode.setBackgroundResource(R.drawable.back_button)
                    binding.btnSendCode.isEnabled = true

                } else {
                    binding.btnSendCode.setBackgroundResource(R.drawable.back_button_de_active)
                    binding.btnSendCode.isEnabled = false

                        //binding.txtMobil.setTextColor(R.color.red)
                }
                if (count > 2 && !number.matches(Regex("(\\+98|0)?9\\d{9}")) ){
                    binding.textInputLayout.setError("شماره موبایل نامعتبر است.")
                    binding.txtEditMobil.setBackgroundResource(R.drawable.back_edit_text_error)
                }else{

                    binding.txtEditMobil.setBackgroundResource(R.drawable.back_edit_text)

                }

            }
            override fun afterTextChanged(s: Editable?) {}

        })

    }
}


