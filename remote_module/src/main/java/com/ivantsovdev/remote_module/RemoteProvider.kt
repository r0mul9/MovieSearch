package com.ivantsovdev.remote_module

interface RemoteProvider {
    fun provideRemote(): TmdbApi
}