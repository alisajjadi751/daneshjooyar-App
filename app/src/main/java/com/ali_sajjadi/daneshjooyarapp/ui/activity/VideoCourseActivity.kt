package com.ali_sajjadi.daneshjooyarapp.ui.activity


import com.ali_sajjadi.daneshjooyarapp.mvp.view.ViewVideoCourseActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ali_sajjadi.daneshjooyarapp.mvp.model.ModelVideoCourseActivity
import com.ali_sajjadi.daneshjooyarapp.mvp.presenter.PresenterVideoCourseActivity


class VideoCourseActivity : AppCompatActivity() {
    private lateinit var view: ViewVideoCourseActivity
    private lateinit var presenter: PresenterVideoCourseActivity
    private lateinit var model: ModelVideoCourseActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        view = ViewVideoCourseActivity(this)
        model = ModelVideoCourseActivity(this)
        setContentView(view.binding.root)


        presenter = PresenterVideoCourseActivity(view, model)
        presenter.onCreate()




    }


}
