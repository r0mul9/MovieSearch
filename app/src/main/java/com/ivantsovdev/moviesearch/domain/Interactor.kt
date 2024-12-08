package com.ivantsovdev.moviesearch.domain

import com.ivantsovdev.moviesearch.data.MainRepository

class Interactor(val repo: MainRepository) {
    fun getFilmsDB(): List<Film> = repo.filmsDataBase
}