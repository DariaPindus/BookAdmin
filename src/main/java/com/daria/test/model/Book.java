package com.daria.test.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@NoArgsConstructor
public class Book implements IEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Getter @Setter private Long id;

    @NotBlank
    @Getter @Setter private String title;

    @Getter @Setter private String description;

    @Positive
    @Getter @Setter private double price;

    @ManyToMany(cascade =  {CascadeType.MERGE, CascadeType.DETACH})
    @Getter @Setter
    private Set<Genre> genres = new HashSet<>();

    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.PERSIST})
    @Getter @Setter
    private Set<Author> authors = new HashSet<>();

    public Book(String title, String description, double price){
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public Book(@NotBlank String title, String description, @Positive double price, Set<Genre> genres, Set<Author> authors) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.genres = genres;
        this.authors = authors;
    }

    public void addGenre(Genre genre){
        this.genres.add(genre);
    }

    public void addAuthor(Author author){
        this.authors.add(author);
    }
}
