package com.dh.serie.service;

import com.dh.serie.model.Season;
import com.dh.serie.repository.SeasonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeasonService {

    @Autowired
    SeasonRepository repository;

    public Season saveSeason(Season season) {
        return repository.save(season);
    }

    public List<Season> buscarTodos() {
        return repository.findAll();
    }
}
