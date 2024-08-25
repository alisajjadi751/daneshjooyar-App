package com.ali_sajjadi.daneshjooyarapp.ui.customView.navigation

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.Toast
import com.ali_sajjadi.daneshjooyarapp.databinding.CustomBottomNavigationBinding

class CustomBottomNavigation(
    context: Context,
    attrs: AttributeSet
) : FrameLayout(context, attrs) {

    private val binding: CustomBottomNavigationBinding

    init {
        binding = CustomBottomNavigationBinding.inflate(LayoutInflater.from(context))
        addView(binding.root)

        binding.imgHomeActive.visibility = VISIBLE
    }

    fun onclickHelper(activityFragment: ActivityFragment) {

        binding.home.setOnClickListener {
            activeHome()
            activityFragment.setFragment(FragmentType.HOME)
        }
        binding.about.setOnClickListener {
            activeAbout()
            activityFragment.setFragment(FragmentType.ABOUT)
        }

        binding.certificate.setOnClickListener {
            activeCertificate()
            activityFragment.setFragment(FragmentType.CERTIFICATE)
        }


    }

    private fun activeHome() {
        binding.imgHome.visibility = INVISIBLE
        binding.imgAbout.visibility = VISIBLE
        binding.imgCertificate.visibility = VISIBLE

        binding.imgAboutActive.visibility = INVISIBLE
        binding.imgCertificateActive.visibility = INVISIBLE
        binding.imgHomeActive.visibility = VISIBLE

    }

    private fun activeAbout() {
        binding.imgAbout.visibility = INVISIBLE
        binding.imgHome.visibility = VISIBLE
        binding.imgCertificate.visibility = VISIBLE

        binding.imgHomeActive.visibility = INVISIBLE
        binding.imgCertificateActive.visibility = INVISIBLE
        binding.imgAboutActive.visibility = VISIBLE
    }

    private fun activeCertificate() {
        binding.imgCertificate.visibility = INVISIBLE
        binding.imgHome.visibility = VISIBLE
        binding.imgAbout.visibility = VISIBLE

        binding.imgHomeActive.visibility = INVISIBLE
        binding.imgAboutActive.visibility = INVISIBLE
        binding.imgCertificateActive.visibility = VISIBLE
    }

}