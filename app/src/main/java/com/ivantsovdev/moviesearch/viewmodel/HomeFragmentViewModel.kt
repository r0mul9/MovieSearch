package com.ivantsovdev.moviesearch.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ivantsovdev.moviesearch.App
import com.ivantsovdev.moviesearch.domain.Film
import com.ivantsovdev.moviesearch.domain.Interactor

class HomeFragmentViewModel : ViewModel() {
    val filmsListLiveData = MutableLiveData<List<Film>>()
    private var interactor: Interactor = App.instance.interactor
    init {
        //TODO init interactor

        val films = interactor.getFilmsDB()
        filmsListLiveData.postValue(films)
    }
}