package com.daria.test.service;

import com.daria.test.model.Genre;
import com.daria.test.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GenreService extends AbstractService<Genre, Long>{

    GenreRepository repository;

    @Autowired
    public GenreService(GenreRepository repository){
        setRepository(repository);
    }

    @Transactional
    public Genre findOneByName(String name){
        return repository.findOneByName(name);
    }
}
