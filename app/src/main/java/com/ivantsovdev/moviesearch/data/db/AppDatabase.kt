package com.ivantsovdev.moviesearch.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ivantsovdev.moviesearch.data.Entity.Film
import com.ivantsovdev.moviesearch.data.dao.FilmDao

@Database(entities = [Film::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun filmDao(): FilmDao
}