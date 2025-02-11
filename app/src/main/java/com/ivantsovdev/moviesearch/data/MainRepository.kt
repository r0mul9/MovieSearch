package com.ivantsovdev.moviesearch.data

import androidx.lifecycle.LiveData
import com.ivantsovdev.moviesearch.data.Entity.Film
import com.ivantsovdev.moviesearch.data.dao.FilmDao
import java.util.concurrent.Executors

class MainRepository(private val filmDao: FilmDao) {

    fun putToDb(films: List<Film>) {
        //Запросы в БД должны быть в отдельном потоке
        Executors.newSingleThreadExecutor().execute {
            filmDao.insertAll(films)
        }
    }

    fun getAllFromDB(): LiveData<List<Film>> = filmDao.getCachedFilms()
}