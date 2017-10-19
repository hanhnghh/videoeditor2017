package com.videoteam.videoeditor2017

import android.app.Application
import android.os.Bundle
import com.videoteam.videoeditor2017.di.component.ActivityComponent
import com.videoteam.videoeditor2017.di.component.AppComponent
import com.videoteam.videoeditor2017.di.module.ActivityModule
import com.videoteam.videoeditor2017.di.module.AppModule

/**
 * Created by hanhanh.nguyen on 10/18/2017.
 */
class VideoApplication : Application(){

    lateinit var appComponent : AppComponent
    lateinit var activityComponent: ActivityComponent

    override fun onCreate(){
        super.onCreate()
        initAppComponent()
        initActivityComponent()
    }

    fun initAppComponent(){
        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }

    fun initActivityComponent(){
        activityComponent = appComponent.plus(ActivityModule())
    }
}