package com.dh.catalogservice.repository;

import com.dh.catalogservice.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.math.BigInteger;
import java.util.List;

@Repository
public interface MovieRepository extends MongoRepository<Movie, BigInteger> {
    List<Movie> findByGenre(String genre);
}
