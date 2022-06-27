package com.movie.catalog.controller;

import com.movie.catalog.service.CatalogService;
import com.movie.catalog.service.MovieFeign;
import com.movie.movie.model.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private CatalogService service;

    @Autowired
    private MovieFeign movieFeign;

    @GetMapping("/{genre}")
    public List<?> findMovie(@PathVariable String genre) {
        return service.getMovie(genre);
    }

    @PostMapping
    public ResponseEntity<?> saveMovie(@RequestBody Movie movie) {
        return ResponseEntity.ok(service.saveMovie(movie)); }
}


