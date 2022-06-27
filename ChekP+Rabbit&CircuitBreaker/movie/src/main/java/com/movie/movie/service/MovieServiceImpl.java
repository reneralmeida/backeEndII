package com.movie.movie.service;

import com.movie.movie.model.Movie;
import com.movie.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository repository;


    @Override
    public Movie save(Movie movie) {
        return repository.save(movie);
    }

    @Override
    public List<Movie> findByGenre(String genre) {
        return repository.findByGenre(genre);
    }

    @Override
    public List<Movie> buscarTodos() {
        return repository.findAll();
    }
}
