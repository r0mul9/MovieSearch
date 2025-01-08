package com.ivantsovdev.moviesearch

import android.app.Application
import com.ivantsovdev.moviesearch.di.AppComponent
import com.ivantsovdev.moviesearch.di.DaggerAppComponent

class App : Application() {
    lateinit var dagger: AppComponent

    override fun onCreate() {
        super.onCreate()
        instance = this
        //Создаем компонент
        dagger = DaggerAppComponent.create()
    }

    companion object {
        lateinit var instance: App
            private set
    }
}