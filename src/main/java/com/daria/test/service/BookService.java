package com.daria.test.service;

import com.daria.test.model.Author;
import com.daria.test.model.Book;
import com.daria.test.model.Genre;
import com.daria.test.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class BookService extends AbstractService<Book, Long> {

    BookRepository repository;

    @Autowired
    GenreService genreService;
    @Autowired
    AuthorService authorService;


    @Autowired
    public BookService(BookRepository repository)
    {
        this.repository = repository;
        setRepository(repository);
    }


    @PostConstruct
    @Transactional
    public void init(){
        if (repository.findAll().isEmpty()){
            List<Genre> genres = genreService.findAll();

            Set<Genre> g1 = new HashSet<>();
            g1.add(genres.get(0));
            Book book1 = new Book("Master and Magaita", "some book descr", 111.11);
            book1.setGenres(g1);
            this.save(book1);

            g1 = new HashSet<>();
            Book book2 = new Book("Harry Potter", "classic", 88.8);
            book2.addAuthor(new Author("Rouling", "Joanne"));
            g1.add(genres.get(0));
            g1.add(genres.get(1));
            book2.setGenres(g1);
            this.save(book2);
        }
    }

    @Transactional
    public Book save2(Book book){
        Set<Genre> genres = new HashSet<>();
        if (!book.getGenres().isEmpty()){
            book.getGenres().stream().forEach(g->{
                if (g.getId() != null)
                    genres.add(genreService.findById(g.getId()).get());
                else
                    genres.add(g);

            });
        }
        //repository.
        book.setGenres(genres);
        return repository.save(book);
    }

    @Transactional
    public List<Book> findByGenre(Long genreId){
        return repository.findByGenres_Id(genreId);
    }

    @Transactional
    public List<Book> findByAuthor(Long authorId){
        return repository.findByAuthor(authorId);
    }
}
