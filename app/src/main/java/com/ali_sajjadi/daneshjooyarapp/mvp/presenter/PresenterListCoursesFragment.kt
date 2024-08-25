package com.ali_sajjadi.daneshjooyarapp.mvp.presenter


import ModelListCoursesFragment
import com.ali_sajjadi.daneshjooyarapp.mvp.view.ViewListCoursesFragment
import info.alirezaahmadi.frenchpastry.mvp.ext.BaseLifeCycle


class PresenterListCoursesFragment(
     val view : ViewListCoursesFragment,
     val model : ModelListCoursesFragment
): BaseLifeCycle {

    override fun onCreate() {

        view.setRecyclerCourse(model.dataList()?: arrayListOf())
    }

}
