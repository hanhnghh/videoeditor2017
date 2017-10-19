package com.videoteam.videoeditor2017.view.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.videoteam.videoeditor2017.R
import com.videoteam.videoeditor2017.presenter.MainPresenter
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var mainPresenter : MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
