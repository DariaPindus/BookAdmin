package com.daria.test.repository;

import com.daria.test.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long>{
    Genre findOneByName(String name);
}
