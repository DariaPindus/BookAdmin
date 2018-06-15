package com.daria.test.controller;

import com.daria.test.model.Book;
import com.daria.test.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    BookService bookService;

    @RequestMapping("")
    public List<Book> books(@RequestParam(value = "genre", required = false) String genreId,
                            @RequestParam(value = "author", required = false) String authorId){
        if (genreId != null)
            return bookService.findByGenre(Long.valueOf(genreId));
        if (authorId != null)
            return bookService.findByAuthor(Long.valueOf(authorId));
        return bookService.findAll();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Book create(@Valid @RequestBody Book book){
        return bookService.save(book);
    }

    @RequestMapping("/{id}")
    public Book getBook(@PathVariable String id) {
        return bookService.findById(Long.valueOf(id)).get();
    }

    @RequestMapping("/{id}/update")
    public Book update(@PathVariable String id, @Valid @RequestBody Book book){
        return bookService.update(book);
    }

}
