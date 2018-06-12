package com.daria.test.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import java.util.HashSet;
import java.util.Set;

//@Entity
@NoArgsConstructor
public class Book implements IEntity {
    @Id
    @GeneratedValue
    @Getter @Setter private Long id;

    @NotBlank
    @Getter @Setter private String title;

    @Getter @Setter private String description;

    @Positive
    @Getter @Setter private double price;

    @ManyToMany
    private Set<Genre> genres;

    @ManyToMany
    private Set<Author> authors;

    public Book(){
        this.genres = new HashSet<>();
        this.authors = new HashSet<>();
    }

    public Book(String title, String description){
        this.title = title;
        this.description = description;
    }

}
