package com.ali_sajjadi.daneshjooyarapp.ui.customView.navigation



enum class FragmentType {
    HOME, ABOUT, CERTIFICATE
}

interface ActivityFragment {
    fun setFragment(type: FragmentType)
}