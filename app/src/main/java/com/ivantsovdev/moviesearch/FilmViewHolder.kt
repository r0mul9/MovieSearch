package com.ivantsovdev.moviesearch

import androidx.recyclerview.widget.RecyclerView
import com.ivantsovdev.moviesearch.databinding.FilmItemBinding

class FilmViewHolder(private val binding: FilmItemBinding) : RecyclerView.ViewHolder(binding.root) {
    private val title = binding.title
    private val poster = binding.poster
    private val description = binding.description

    fun bind(film: Film) {
        binding.title.text = film.title
        binding.poster.setImageResource(film.poster)
        binding.description.text = film.description
    }

}