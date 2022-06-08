package com.movie.catalog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private MovieFeign movie;

    @Override
    public String getMovie(String genre) {
        return movie.findMovie(genre);
    }
}
