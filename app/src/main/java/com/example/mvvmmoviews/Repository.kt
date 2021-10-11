package com.example.mvvmmoviews

class Repository constructor(private val retrofitService: MovieService) {

    fun getAllMovies() = retrofitService.getAllMovies()
}