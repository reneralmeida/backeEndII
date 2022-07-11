package com.dh.movieservice.queue;

import com.dh.movieservice.model.Movie;
import com.dh.movieservice.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class MovieListener {

    private final MovieService service;

    @RabbitListener(queues = {"${queue.movie.name}"})
    public void receiveMessage(Movie movie) { service.save(movie); }
}
