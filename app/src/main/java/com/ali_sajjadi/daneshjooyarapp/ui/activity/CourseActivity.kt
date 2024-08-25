package com.ali_sajjadi.daneshjooyarapp.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ali_sajjadi.daneshjooyarapp.mvp.model.ModelCourseActivity
import com.ali_sajjadi.daneshjooyarapp.mvp.presenter.PresenterCourseActivity
import com.ali_sajjadi.daneshjooyarapp.mvp.view.ViewCourseActivity

class CourseActivity : AppCompatActivity() {
    private lateinit var presenter: PresenterCourseActivity
    private lateinit var view: ViewCourseActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        view = ViewCourseActivity(this, supportFragmentManager, lifecycle)
        setContentView(view.binding.root)

        val model = ModelCourseActivity(this)
        presenter = PresenterCourseActivity(view, model)
        presenter.onCreate()

        // Restore video position if available
       /* savedInstanceState?.let {
            val position = it.getInt("video_position", 0)
            view.seekToVideo(position)
        }*/
    }

    /*override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        // Save the current video position
        outState.putInt("video_position", view.getVideoCurrentPosition())
    }*/
}
