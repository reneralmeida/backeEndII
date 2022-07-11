package com.dh.serie.repository;

import com.dh.serie.model.Chapter;
import com.dh.serie.model.Season;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface ChapterRepository extends MongoRepository<Chapter, BigInteger> {

}
