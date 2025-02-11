package com.ivantsovdev.moviesearch.di

import com.ivantsovdev.moviesearch.di.modules.DatabaseModule
import com.ivantsovdev.moviesearch.di.modules.DomainModule
import com.ivantsovdev.moviesearch.di.modules.RemoteModule
import com.ivantsovdev.moviesearch.viewmodel.HomeFragmentViewModel
import com.ivantsovdev.moviesearch.viewmodel.SettingsFragmentViewModel
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(
    //Внедряем все модули, нужные для этого компонента
    modules = [
        RemoteModule::class,
        DatabaseModule::class,
        DomainModule::class
    ]
)
interface AppComponent {
    //метод для того, чтобы появилась возможность внедрять зависимости в HomeFragmentViewModel
    fun inject(homeFragmentViewModel: HomeFragmentViewModel)

    //метод для того, чтобы появилась возможность внедрять зависимости в SettingsFragmentViewModel
    fun inject(settingsFragmentViewModel: SettingsFragmentViewModel)
}