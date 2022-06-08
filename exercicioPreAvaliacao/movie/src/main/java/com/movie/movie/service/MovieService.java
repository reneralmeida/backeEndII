package com.movie.movie.service;

import com.movie.movie.model.Movie;

public interface MovieService {
    void save(Movie movie);
    String findByGenre(String genre);
}
