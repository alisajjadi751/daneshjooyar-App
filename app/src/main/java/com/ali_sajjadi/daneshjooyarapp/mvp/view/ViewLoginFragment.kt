package com.ali_sajjadi.daneshjooyarapp.mvp.view

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.text.Editable
import android.text.Spannable
import android.text.SpannableString
import android.text.TextWatcher
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.text.style.UnderlineSpan
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.ali_sajjadi.daneshjooyarapp.R
import com.ali_sajjadi.daneshjooyarapp.databinding.FragmentLoginBinding
import com.ali_sajjadi.daneshjooyarapp.mvp.ext.ActivityUtils
import com.ali_sajjadi.daneshjooyarapp.ui.activity.MainActivity
import com.ali_sajjadi.daneshjooyarapp.ui.fragment.RulesFragment

class ViewLoginFragment(
    private val mContext: Context,
    private val activityUtils: ActivityUtils
) {


    val binding = FragmentLoginBinding.inflate(LayoutInflater.from(mContext))
    private val sharedPreferences: SharedPreferences = mContext.getSharedPreferences("MyAppPrefs", MODE_PRIVATE)


    fun checkLoginStatus() {
        // بررسی اینکه آیا کاربر قبلاً وارد شده است یا خیر
        val isLoggedIn = sharedPreferences.getBoolean("isLoggedIn", false)

        if (isLoggedIn) {
            // کاربر قبلاً وارد شده است، مستقیماً به صفحه اصلی یا بخش دیگر بروید
            val intent = Intent(mContext, MainActivity::class.java)
            mContext.startActivity(intent) // یا هر فرگمنتی که می‌خواهید
        } else {
            // نمایش صفحه ورود
            login()
        }
    }


    fun login() {
        binding.txtEditMobil.addTextChangedListener(object : TextWatcher {

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val number = binding.txtEditMobil.text.toString()
                binding.textInputLayout.hint = null
                binding.txtMobil.visibility = View.VISIBLE

                // چک کردن اینکه شماره وارد شده 11 رقم باشد و با "09" شروع نشود
                if (s?.length == 11 && !number.startsWith("09")) {
                    binding.textInputLayout.error = "شماره موبایل نامعتبر است."
                    binding.txtEditMobil.setBackgroundResource(R.drawable.back_edit_text_error)
                    binding.btnSendCode.setBackgroundResource(R.drawable.back_button_de_active)
                    binding.btnSendCode.isEnabled = false
                } else if (s?.length == 11 && number.startsWith("09")) {
                    binding.btnSendCode.setBackgroundResource(R.drawable.back_button)
                    binding.btnSendCode.isEnabled = true
                    binding.textInputLayout.error = null
                    binding.txtEditMobil.setBackgroundResource(R.drawable.back_edit_text)
                } else {
                    // برای زمانی که شماره کامل نیست یا هنوز وارد نشده
                    binding.textInputLayout.error = null
                    binding.txtEditMobil.setBackgroundResource(R.drawable.back_edit_text)
                    binding.btnSendCode.setBackgroundResource(R.drawable.back_button_de_active)
                    binding.btnSendCode.isEnabled = false
                }

            }

            override fun afterTextChanged(s: Editable?) {

            }

        })
    }

    fun ghavanin() {

        val fullText = "شرایط و قوانین دانشجویار را مطالعه کردم و می پذیرم."
        binding.txtGhavanin.text = fullText
        val clickText = "شرایط و قوانین"
        val spannableString = SpannableString(fullText)

        val startIndex = fullText.indexOf(clickText)
        val endIndex = startIndex + clickText.length

        if (startIndex != -1) {
            // خط دار کردن متن
            spannableString.setSpan(
                UnderlineSpan(),
                startIndex,
                endIndex,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            )

            // قابل کلیک کردن متن
            val clickableSpan = object : ClickableSpan() {
                override fun onClick(widget: View) {
                    // کاری که هنگام کلیک باید انجام شود
                    seenRules()
                    Log.i("TEST", "ed")
                }
            }

            spannableString.setSpan(
                clickableSpan,
                startIndex,
                endIndex,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            )

            // تنظیم SpannableString به TextView
            binding.txtGhavanin.text = spannableString
            binding.txtGhavanin.movementMethod = LinkMovementMethod.getInstance() // فعال‌سازی کلیک
        }
    }

    fun seenRules() {

        activityUtils.setFragment(RulesFragment())
    }

    fun sendCode(fragment: Fragment) {
        binding.btnSendCode.setOnClickListener {

            val bundle = Bundle()
            val mobile = binding.txtEditMobil.text

            bundle.putString("NUMBER", mobile.toString())

            // انتقال داده‌ها به Fragment جدید
            fragment.arguments = bundle

            // نمایش Fragment جدید
            activityUtils.setFragment(fragment)
        }
    }


}
