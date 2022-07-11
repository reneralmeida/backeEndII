package com.dh.serie.repository;

import com.dh.serie.model.Season;
import com.dh.serie.model.Serie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface SeasonRepository extends MongoRepository<Season, BigInteger> {

}
