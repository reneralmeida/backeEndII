package com.dh.serie.service;

import com.dh.serie.dto.SerieDTO;
import com.dh.serie.model.Chapter;
import com.dh.serie.model.Season;
import com.dh.serie.model.Serie;
import com.dh.serie.repository.SerieRepository;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerieService {

    @Autowired
    SerieRepository repository;
    public Serie save(SerieDTO dto, List<Season> seasonList, List<Chapter> chapterList) {
        var serie = new Serie();
        serie.setId(dto.getId());
        serie.setName(dto.getName());
        serie.setSeason(seasonList);
        serie.setChapter(chapterList);
        return repository.save(serie);
    }
    public List<Serie> findByGenre(String genre) {
        return repository.findByGenre(genre);
    }

    public List<Serie> buscarTodos() {
        return repository.findAll();
    }
}
