package com.dh.serie.controller;

import com.dh.serie.dto.ChapterDTO;
import com.dh.serie.dto.SeasonDTO;
import com.dh.serie.dto.SerieDTO;
import com.dh.serie.model.Chapter;
import com.dh.serie.model.Season;
import com.dh.serie.model.Serie;
import com.dh.serie.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/serie")
public class SerieController {

    @Autowired
    private SerieService service;

    @GetMapping("/{genre}")
    public ResponseEntity<List<Serie>> find(@PathVariable String genre) {
        return ResponseEntity.ok().body(service.findByGenre(genre));
    }

    @PostMapping
    public ResponseEntity<Serie> save(@RequestBody SerieDTO serieDTO) {
        List<Season> seasonList = serieDTO.getSeasonList().stream().map(SeasonDTO::toSeason).collect(Collectors.toList());
        List<Chapter> chapterList = serieDTO.getChapterList().stream().map(ChapterDTO::toChapter).collect(Collectors.toList());
        return ResponseEntity.ok(service.save(serieDTO, seasonList, chapterList));
    }

    @GetMapping
    public ResponseEntity<List<Serie>> buscarTodos() {
        return ResponseEntity.ok().body(service.buscarTodos());
    }
}
