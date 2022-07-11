package com.dh.catalogservice.service;

import com.dh.catalogservice.model.Serie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "SERIE")
public interface SerieFeign {

    @RequestMapping(method = RequestMethod.GET, value = "/serie/{genre}")
    List<?> findSerie(@PathVariable String genre);

    @RequestMapping(method = RequestMethod.POST, value = "/serie")
    Serie saveSerie(@RequestBody Serie serie);
}
