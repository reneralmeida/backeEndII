package com.movie.catalog.service;

import com.movie.movie.model.Movie;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CatalogService {
    List<?> getMovie (String genre);
    Movie saveMovie (Movie movie);
}
