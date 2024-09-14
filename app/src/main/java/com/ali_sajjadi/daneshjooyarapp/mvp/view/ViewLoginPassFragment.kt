package com.ali_sajjadi.daneshjooyarapp.mvp.view

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import com.ali_sajjadi.daneshjooyarapp.databinding.FragmentLoginPassBinding
import com.ali_sajjadi.daneshjooyarapp.mvp.ext.ActivityUtils
import com.ali_sajjadi.daneshjooyarapp.mvp.model.ModelSplashActivity
import com.ali_sajjadi.daneshjooyarapp.mvp.presenter.PresenterSplashActivity
import com.ali_sajjadi.daneshjooyarapp.ui.activity.MainActivity
import com.ali_sajjadi.daneshjooyarapp.ui.fragment.LoginFragment
import com.ali_sajjadi.daneshjooyarapp.ui.fragment.LoginPassFragment

class ViewLoginPassFragment(
   val mContext: Context,
    private val fragment: Fragment,
    private val activityUtils: ActivityUtils,
) {
    val binding = FragmentLoginPassBinding.inflate(LayoutInflater.from(mContext))

    @SuppressLint("SetTextI18n")
    fun getNumber() {

        val number = fragment.arguments?.getString("NUMBER")
        binding.txtMobile.text = "کد تایید برای شماره موبایل $number ارسال شد.(رمز:12345)"
    }

    fun editNumber(){
        binding.edtMobile.setOnClickListener {
            activityUtils.back()
        }
    }
    fun interPass() {
        binding.btnLogin.setOnClickListener {
            val correctPass = "12345"
            val enteredPass = binding.txtPass.text.toString()
            val pref = PresenterSplashActivity(ViewSplashActivity(mContext,activityUtils), ModelSplashActivity(mContext))
            if (enteredPass == correctPass) {

                val intent = Intent(mContext, MainActivity::class.java)
                mContext.startActivity(intent)
                activityUtils.finishedAffinity(fragment)
                pref.saveLoginState(true)

            } else {

                binding.txtPass.error = "رمز اشتباه است."
            }
        }
    }
}