package com.ali_sajjadi.daneshjooyarapp.mvp.model

import DataListVideo

import androidx.fragment.app.Fragment

class ModelVideosFragment(
    private val fragment: Fragment
) {

    fun dataList(): ArrayList<DataListVideo> =
        fragment.arguments?.getParcelableArrayList("videoList") ?: arrayListOf()

}
