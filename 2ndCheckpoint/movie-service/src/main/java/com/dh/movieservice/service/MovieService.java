package com.dh.movieservice.service;

import com.dh.movieservice.model.Movie;

import java.util.List;

public interface MovieService {
    Movie save(Movie movie);
    List<Movie> findByGenre(String genre);
    List<Movie> buscarTodos();
}
