package com.videoteam.videoeditor2017.di.component

import com.videoteam.videoeditor2017.di.PerActivity
import com.videoteam.videoeditor2017.di.module.ActivityModule
import com.videoteam.videoeditor2017.view.activity.MainActivity
import dagger.Subcomponent
import javax.inject.Inject

/**
 * Created by hanhanh.nguyen on 10/18/2017.
 */
@PerActivity
@Subcomponent(
        modules = arrayOf(ActivityModule::class)
)
interface ActivityComponent {
    fun inject(mainActivity: MainActivity)
}