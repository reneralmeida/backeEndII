package com.dh.catalogservice.controller;

import com.dh.catalogservice.dto.MovieDTO;
import com.dh.catalogservice.model.Movie;
import com.dh.catalogservice.model.Serie;
import com.dh.catalogservice.service.CatalogService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private CatalogService service;

    @RequestMapping(value = {"/movies"}, method = RequestMethod.GET)
    public ResponseEntity<List<MovieDTO>> buscarTodos() {
        return ResponseEntity.ok(
                service.buscarTodos().stream().map(MovieDTO::movieToDTO).collect(Collectors.toList())
        );
    }

    @RequestMapping(value = {"/movies"}, method = RequestMethod.POST)
    public ResponseEntity<?> saveMovie(@RequestBody Movie movie) {
        return ResponseEntity.ok(service.saveMovie(movie)); }

    @RequestMapping(value = {"/series"}, method = RequestMethod.GET)
    public ResponseEntity<List<Serie>> buscarTodas() {
        return ResponseEntity.ok().body(service.buscarTodas());
    }

    @RequestMapping(value = {"/series"}, method = RequestMethod.POST)
    public ResponseEntity<?> saveSerie(@RequestBody Serie serie) {
        return ResponseEntity.ok(service.saveSerie(serie)); }
}


