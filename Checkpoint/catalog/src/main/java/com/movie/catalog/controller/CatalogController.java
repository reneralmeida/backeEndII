package com.movie.catalog.controller;

import com.movie.catalog.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private CatalogService service;

    @GetMapping("/{genre}")
    public List<?> findMovie(@PathVariable String genre) {
        return service.getMovie(genre);
    }
}
