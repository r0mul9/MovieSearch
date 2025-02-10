package com.ivantsovdev.moviesearch.di.modules

import android.content.Context
import androidx.room.Room
import com.ivantsovdev.moviesearch.data.MainRepository
import com.ivantsovdev.moviesearch.data.dao.FilmDao
import com.ivantsovdev.moviesearch.data.db.AppDatabase
import com.ivantsovdev.moviesearch.data.db.DatabaseHelper
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {
    @Singleton
    @Provides
    fun provideFilmDao(context: Context) =
        Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "film_db"
        ).build().filmDao()

    @Provides
    @Singleton
    fun provideRepository(filmDao: FilmDao) = MainRepository(filmDao)
}