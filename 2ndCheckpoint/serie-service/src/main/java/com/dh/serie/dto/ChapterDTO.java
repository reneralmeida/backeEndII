package com.dh.serie.dto;

import com.dh.serie.model.Chapter;
import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;

@Data
public class ChapterDTO implements Serializable {

    private BigInteger id;
    private String name;
    private String number;
    private String urlStream;

    public static ChapterDTO chapterToDTO(Chapter chapter) {
        ChapterDTO dto = new ChapterDTO();
        dto.setId(chapter.getId());
        dto.setName(chapter.getName());
        dto.setNumber(chapter.getNumber());
        dto.setUrlStream(chapter.getUrlStream());
        return dto;
    }

    public Chapter toChapter() {
        Chapter chap = new Chapter();
        chap.setId(this.getId());
        chap.setName(this.getName());
        chap.setNumber(this.getNumber());
        chap.setUrlStream(this.getUrlStream());
        return chap;
    }
}
