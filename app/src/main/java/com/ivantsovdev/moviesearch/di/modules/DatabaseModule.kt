package com.ivantsovdev.moviesearch.di.modules

import android.content.Context
import com.ivantsovdev.moviesearch.data.MainRepository
import com.ivantsovdev.moviesearch.data.db.DatabaseHelper
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {
    @Singleton
    @Provides
    fun provideDatabaseHelper(context: Context) = DatabaseHelper(context)

    @Provides
    @Singleton
    fun provideRepository(databaseHelper: DatabaseHelper) = MainRepository(databaseHelper)
}