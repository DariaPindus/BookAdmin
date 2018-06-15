package com.daria.test.repository;

import com.daria.test.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

    /*@Query("SELECT b FROM Book b JOIN Genre g where g.id=?1")
    List<Book> findByGenre(Long genreId);*/

    List<Book> findByGenres_Id(long id);

    @Query("SELECT b FROM Book b JOIN Author a where a.id=?1")
    List<Book> findByAuthor(Long authorId);
}
