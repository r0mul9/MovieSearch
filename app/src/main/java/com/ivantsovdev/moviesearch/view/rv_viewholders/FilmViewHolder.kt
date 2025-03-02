package com.ivantsovdev.moviesearch.view.rv_viewholders

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ivantsovdev.remote_module.entity.ApiConstants
import com.ivantsovdev.moviesearch.databinding.FilmItemBinding
import com.ivantsovdev.moviesearch.data.Entity.Film

class FilmViewHolder(private val binding: FilmItemBinding) : RecyclerView.ViewHolder(binding.root) {
    private val title = binding.title
    private val poster = binding.poster
    private val description = binding.description

    //Вот здесь мы находим в верстке наш прогресс бар для рейтинга
    private val ratingDonut = binding.ratingDonut

    fun bind(film: Film) {
        binding.title.text = film.title
        //Указываем контейнер, в котором будет "жить" наша картинка
        Glide.with(itemView)
            //Загружаем сам ресурс
            .load(com.ivantsovdev.remote_module.entity.ApiConstants.IMAGES_URL + "w342" + film.poster)
            //Центруем изображение
            .centerCrop()
            //Указываем ImageView, куда будем загружать изображение
            .into(poster)
        binding.description.text = film.description
        binding.ratingDonut.setProgress((film.rating * 10).toInt())
    }

}