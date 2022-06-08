package com.movie.movie.controller;

import com.movie.movie.dto.MovieDTO;
import com.movie.movie.model.Movie;
import com.movie.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/movie")
public class MovieController {

    @Autowired
    private MovieService service;

    @PostMapping
    public ResponseEntity<Movie> save(@RequestBody MovieDTO movie) {
        return ResponseEntity.ok(service.save(movie.toMovie()));
    }

    @GetMapping("/{genre}")
    public ResponseEntity<List<MovieDTO>> find(@PathVariable String genre) {
        System.out.println(genre);
        return ResponseEntity.ok(
                service.findByGenre(genre).stream().map(MovieDTO::movieToDTO).collect(Collectors.toList())
        );
    }

    @GetMapping
    public ResponseEntity<List<MovieDTO>> buscarTodos() {
        return ResponseEntity.ok(
                service.buscarTodos().stream().map(MovieDTO::movieToDTO).collect(Collectors.toList())
        );
    }
}
