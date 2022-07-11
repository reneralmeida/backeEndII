package com.dh.movieservice.utils;

import com.dh.movieservice.model.Movie;
import com.dh.movieservice.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataLoader implements ApplicationRunner {

    private MovieRepository movieRepository;

    @Autowired

    public DataLoader(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void run(ApplicationArguments args) {

        List<Movie> movieList = List.of(
                new Movie(null, "Heat", "Acao", "https://www.youtube.com/watch?v=0xbBLJ1WGwQ"),
                new Movie(null, "The Matrix", "SciFi", "https://www.youtube.com/watch?v=2KnZac176Hs"),
                new Movie(null, "Rambo", "Acao", "https://www.youtube.com/watch?v=IAqLKlxY3Eo"),
                new Movie(null, "Assassins", "Acao", "https://www.youtube.com/watch?v=yIMYA1KBubA"),
                new Movie(null, "Donnie Darko", "SciFi", "https://www.youtube.com/watch?v=ZZyBaFYFySk"),
                new Movie(null, "Frequency", "SciFi", "https://www.youtube.com/watch?v=jdACpDDpIUs")
        );
        movieList.forEach(movie -> movieRepository.save(movie));
    }
}
