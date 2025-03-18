package com.ivantsovdev.moviesearch.utils

import com.ivantsovdev.remote_module.entity.TmdbFilm
import com.ivantsovdev.moviesearch.data.Entity.Film

object Converter {
    fun convertApiListToDtoList(list: List<com.ivantsovdev.remote_module.entity.TmdbFilm>?): List<Film> {
        val result = mutableListOf<Film>()
        list?.forEach {
            result.add(
                Film(
                    title = it.title,
                    poster = it.posterPath,
                    description = it.overview,
                    rating = it.voteAverage,
                    isInFavorites = false
                )
            )
        }
        return result
    }
}