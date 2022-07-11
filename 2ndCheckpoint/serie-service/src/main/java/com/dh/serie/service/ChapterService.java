package com.dh.serie.service;

import com.dh.serie.model.Chapter;
import com.dh.serie.repository.ChapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChapterService {

    @Autowired
    ChapterRepository repository;

    public Chapter saveChapter(Chapter chapter) {
        return repository.save(chapter);
    }

    public List<Chapter> buscarTodos() {
        return repository.findAll();
    }
}
