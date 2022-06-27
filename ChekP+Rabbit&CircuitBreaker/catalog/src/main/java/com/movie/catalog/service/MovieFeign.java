package com.movie.catalog.service;

import com.movie.movie.model.Movie;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "MOVIE")
public interface MovieFeign {
    @RequestMapping(method = RequestMethod.GET, value = "/movie/{genre}")
    List<?> findMovie(@PathVariable String genre);

    @RequestMapping(method = RequestMethod.POST, value = "/movie")
    Movie saveMovie(@RequestBody Movie movie);
}
