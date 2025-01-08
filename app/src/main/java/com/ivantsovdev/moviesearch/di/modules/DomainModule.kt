package com.ivantsovdev.moviesearch.di.modules

import com.ivantsovdev.moviesearch.data.MainRepository
import com.ivantsovdev.moviesearch.data.TmdbApi
import com.ivantsovdev.moviesearch.domain.Interactor
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DomainModule {
    @Singleton
    @Provides
    fun provideInteractor(repository: MainRepository, tmdbApi: TmdbApi) = Interactor(repo = repository, retrofitService = tmdbApi)
}