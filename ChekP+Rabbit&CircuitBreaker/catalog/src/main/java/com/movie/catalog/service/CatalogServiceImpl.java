package com.movie.catalog.service;

import com.movie.catalog.exception.CircuitBreakerException;
import com.movie.movie.model.Movie;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private MovieFeign movieFeign;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public List<?> getMovie(String genre) {
        return movieFeign.findMovie(genre);
    }

    @Override
    @CircuitBreaker(name="movie", fallbackMethod = "saveMovieFallbackValue")
    @Retry(name="movie")
    public Movie saveMovie(Movie movie) {
        rabbitTemplate.convertAndSend("MovieQueue", movie);
        return movieFeign.saveMovie(movie);}

    public Movie saveMovieFallbackValue(CallNotPermittedException ex) throws CircuitBreakerException {
        throw new CircuitBreakerException("Activating circuit breaker");
    }
}
