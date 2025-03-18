package com.ivantsovdev.remote_module.entity

import com.google.gson.annotations.SerializedName

data class TmdbResultsDto(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val tmdbFilms: List<com.ivantsovdev.remote_module.entity.TmdbFilm>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)
