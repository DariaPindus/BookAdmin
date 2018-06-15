package com.daria.test.service;

import com.daria.test.model.Author;
import com.daria.test.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService extends AbstractService<Author, Long>{

    AuthorRepository repository;

    @Autowired
    public AuthorService(AuthorRepository repository){
        setRepository(repository);
    }
}
