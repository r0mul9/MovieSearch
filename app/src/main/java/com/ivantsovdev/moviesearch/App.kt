package com.ivantsovdev.moviesearch


import android.app.Application
import com.ivantsovdev.moviesearch.di.AppComponent
import com.ivantsovdev.moviesearch.di.DaggerAppComponent
import com.ivantsovdev.moviesearch.di.modules.DatabaseModule
import com.ivantsovdev.moviesearch.di.modules.DomainModule
import com.ivantsovdev.moviesearch.di.modules.RemoteModule

class App : Application() {
    lateinit var dagger: AppComponent

    override fun onCreate() {
        super.onCreate()
        instance = this
        //Создаем компонент
        dagger = DaggerAppComponent.builder()
            .remoteModule(RemoteModule())
            .databaseModule(DatabaseModule())
            .domainModule(DomainModule(this))
            .build()
    }


    companion object {
        lateinit var instance: App
            private set
    }
}