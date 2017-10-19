package com.videoteam.videoeditor2017.di.component

import com.videoteam.videoeditor2017.di.module.ActivityModule
import com.videoteam.videoeditor2017.di.module.AppModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by hanhanh.nguyen on 10/18/2017.
 */
@Singleton
@Component(
        modules = arrayOf(AppModule::class)
)
interface AppComponent {
    fun plus(module : ActivityModule) : ActivityComponent;
}