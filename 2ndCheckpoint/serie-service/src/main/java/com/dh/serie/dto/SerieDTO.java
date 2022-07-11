package com.dh.serie.dto;

import com.dh.serie.model.Chapter;
import com.dh.serie.model.Season;
import com.dh.serie.model.Serie;
import lombok.Data;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class SerieDTO implements Serializable {

    private BigInteger id;
    private String name, genre;
    private List<SeasonDTO> seasonList;
    private List<ChapterDTO> chapterList;


    public static SerieDTO serieToDTO(Serie serie) {
        SerieDTO dto = new SerieDTO();
        dto.setId(serie.getId());
        dto.setName(serie.getName());
        dto.setSeasonList(
                serie.getSeason().stream().map(SeasonDTO::seasonToDTO).collect(Collectors.toList())
        );
        dto.setChapterList(
                serie.getChapter().stream().map(ChapterDTO::chapterToDTO).collect(Collectors.toList())
        );
        return dto;
    }

    public Serie toSerie() {
        Serie ser = new Serie();
        ser.setId(this.getId());
        ser.setName(this.getName());
        ser.setGenre(this.getGenre());
        return ser;
    }
}
