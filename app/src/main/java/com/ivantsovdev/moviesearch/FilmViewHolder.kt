package com.ivantsovdev.moviesearch

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ivantsovdev.moviesearch.databinding.FilmItemBinding

class FilmViewHolder(private val binding: FilmItemBinding) : RecyclerView.ViewHolder(binding.root) {
    private val title = binding.title
    private val poster = binding.poster
    private val description = binding.description

    fun bind(film: Film) {
        binding.title.text = film.title
        //Указываем контейнер, в котором будет "жить" наша картинка
        Glide.with(itemView)
            //Загружаем сам ресурс
            .load(film.poster)
            //Центруем изображение
            .centerCrop()
            //Указываем ImageView, куда будем загружать изображение
            .into(poster)
        binding.description.text = film.description
    }

}