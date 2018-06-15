package com.daria.test.controller;

import com.daria.test.model.Author;
import com.daria.test.model.Book;
import com.daria.test.model.Genre;
import com.daria.test.service.AuthorService;
import com.daria.test.service.BookService;
import com.daria.test.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    GenreService genreService;
    @Autowired
    AuthorService authorService;
    @Autowired
    BookService bookService;

    @RequestMapping("/genres")
    public List<Genre> allGenres(){
        return genreService.findAll();
    }

    @RequestMapping("/authors")
    public List<Author> allAuthors(){
        return authorService.findAll();
    }

}
