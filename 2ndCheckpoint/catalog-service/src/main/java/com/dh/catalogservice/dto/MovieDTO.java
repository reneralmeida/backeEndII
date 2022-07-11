package com.dh.catalogservice.dto;

import com.dh.catalogservice.model.Movie;
import lombok.Data;
import java.io.Serializable;
import java.math.BigInteger;

@Data
public class MovieDTO implements Serializable {

    private BigInteger id;
    private String name, genre, urlStream;

    public static MovieDTO movieToDTO(Movie movie) {
        MovieDTO dto = new MovieDTO();
        dto.setId(movie.getId());
        dto.setName(movie.getName());
        dto.setGenre(movie.getGenre());
        dto.setUrlStream(movie.getUrlStream());
        return dto;
    }

    public Movie toMovie() {
        Movie mov = new Movie();
        mov.setId(this.getId());
        mov.setName(this.getName());
        mov.setGenre(this.getGenre());
        mov.setUrlStream(this.getUrlStream());
        return mov;
    }
}
