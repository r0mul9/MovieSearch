package com.ivantsovdev.moviesearch.di.modules

import com.ivantsovdev.moviesearch.data.MainRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {
    @Provides
    @Singleton
    fun provideRepository() = MainRepository()
}