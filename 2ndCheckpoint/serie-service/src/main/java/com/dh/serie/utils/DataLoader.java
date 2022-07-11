package com.dh.serie.utils;

import com.dh.serie.dto.SerieDTO;
import com.dh.serie.model.Season;
import com.dh.serie.model.Chapter;
import com.dh.serie.model.Serie;
import com.dh.serie.repository.ChapterRepository;
import com.dh.serie.repository.SeasonRepository;
import com.dh.serie.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import java.util.List;

//@Configuration
//public class DataLoader implements ApplicationRunner {
//
//    @Autowired
//    private SerieRepository serieRepository;
//
//    @Autowired
//    private SeasonRepository seasonRepository;
//
//    @Autowired
//    private ChapterRepository chapterRepository;
//
//    public void run(ApplicationArguments args) throws Exception {
//
//        List<Season> seasonList = List.of(
//                new Season(null, "01"),
//                new Season(null, "02"),
//                new Season(null, "03")
//        );
//        seasonList.forEach(season -> seasonRepository.save(season));
//
//        List<Chapter> chapterList = List.of(
//                new Chapter(null, "testando", "01", "www.teste.com"),
//                new Chapter(null, "testando2", "01", "www.teste2.com"),
//                new Chapter(null, "testando3", "01", "www.teste3.com")
//        );
//        chapterList.forEach(chapter -> chapterRepository.save(chapter));
//
//        Serie test = new Serie(null, "Breaking Bad", "Drama", seasonList, chapterList);
//        Serie test2 = new Serie(null, "The Wire", "Drama", seasonList, chapterList);
//        Serie test3 = new Serie(null, "Twin Peaks", "Drama", seasonList, chapterList);
//
//        List.of(
//                test,
//                test2,
//                test3
//        ).forEach(serie -> serieRepository.save(serie));
//
//    }
//}
