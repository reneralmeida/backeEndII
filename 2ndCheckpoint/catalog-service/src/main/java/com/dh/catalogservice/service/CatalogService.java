package com.dh.catalogservice.service;

import com.dh.catalogservice.model.Movie;
import com.dh.catalogservice.model.Serie;
import com.dh.catalogservice.repository.MovieRepository;
import com.dh.catalogservice.repository.SerieRepository;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService {

    @Autowired
    RabbitTemplate rabbitTemplate;
    @Autowired
    MovieRepository repositoryMovie;
    @Autowired
    SerieRepository repositorySerie;

    public List<Movie> buscarTodos()  {
        return repositoryMovie.findAll();
    }
    public Movie saveMovie(Movie movie) {
        rabbitTemplate.convertAndSend("movieQueue", movie);
        return repositoryMovie.save(movie); }

    public List<Serie> buscarTodas() {
        return repositorySerie.findAll();
    }

    public Serie saveSerie(Serie serie) {
        rabbitTemplate.convertAndSend("serieQueue", serie);
        return repositorySerie.save(serie); }
}
