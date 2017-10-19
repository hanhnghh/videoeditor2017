package com.videoteam.videoeditor2017.di.module

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by hanhanh.nguyen on 10/18/2017.
 */
@Module
class AppModule(private val application : Application) {

    @Singleton
    @Provides
    fun provideContext() : Application{
        return application
    }


}