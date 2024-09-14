package com.ali_sajjadi.daneshjooyarapp.mvp.ext


import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.ali_sajjadi.daneshjooyarapp.adapter.recycler.data.DataVideos


interface ActivityUtils {

    fun switch(){}

    fun setFragment(fragment: Fragment) {}

   /* fun onSaveInstanceState(outState: Bundle){}

    fun onRestoreInstanceState(savedInstanceState:Bundle){}*/

    fun listVideo(data: ArrayList<DataVideos>){}

    fun setViewPagerFragment(viewPager: ViewPager2, data: ArrayList<String>) {}

    fun finished() {}

    fun finishedAffinity(fragment: Fragment) {}

    fun showSnackBar() {}

    fun activeNetwork() {}

    fun back(){}

}