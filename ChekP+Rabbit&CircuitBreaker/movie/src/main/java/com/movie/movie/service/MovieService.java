package com.movie.movie.service;

import com.movie.movie.model.Movie;

import java.util.List;

public interface MovieService {
    Movie save(Movie movie);
    List<Movie> findByGenre(String genre);
    List<Movie> buscarTodos();
}
