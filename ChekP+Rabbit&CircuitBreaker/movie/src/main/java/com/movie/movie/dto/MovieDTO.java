package com.movie.movie.dto;

import com.movie.movie.model.Movie;
import lombok.Data;
import java.io.Serializable;

@Data
public class MovieDTO implements Serializable {

    private Long id;
    private String name, genre, urlStream;

    public static MovieDTO movieToDTO(Movie movie) {
        MovieDTO dto = new MovieDTO();
        dto.setId(movie.getId());
        dto.setName(movie.getName());
        dto.setGenre(movie.getGenre());
        dto.setUrlStream(movie.getUrlStream());
        return dto;
    }

    //Se implementado no controller retorna só o gênero (id, nome e url nulos)
//    public static MovieDTO genreToDto(Movie movie) {
//        MovieDTO genre = new MovieDTO();
//        genre.setGenre(movie.getGenre());
//        return genre;
//    }

    public Movie toMovie() {
        Movie mov = new Movie();
        mov.setId(this.getId());
        mov.setName(this.getName());
        mov.setGenre(this.getGenre());
        mov.setUrlStream(this.getUrlStream());
        return mov;
    }
}
